package com.adiljamal.android_emr.ui.home.vaccine;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.util.Log;

import com.adiljamal.android_emr.data.ApiService;
import com.adiljamal.android_emr.databinding.ActivityVaccineListBinding;
import com.adiljamal.android_emr.ui.home.history.surgical.SurgeryAdapter;
import com.adiljamal.android_emr.ui.home.history.surgical.SurgicalHistory;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class VaccineListActivity extends AppCompatActivity {

    private ActivityVaccineListBinding binding;
    private List<Vaccine> vaccines ;

    private static final String API_BASE_URL = "https://192.168.168.252:7022/api/";

    private ApiService apiService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityVaccineListBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        try {

            fetchDataFromApi();

        } catch (Exception ex){
           Log.i("TAG", "tag3"+ex.getMessage());
        }

    }


    public void fetchDataFromApi() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(API_BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        apiService = retrofit.create(ApiService.class);

        Call<List<Vaccine>> call = apiService.getVaccines();
        call.enqueue(new Callback<List<Vaccine>>() {
            @Override
            public void onResponse(Call<List<Vaccine>> call, Response<List<Vaccine>> response) {
                if (response.isSuccessful()) {
                    List<Vaccine> vaccineList = response.body();
                    if(!vaccineList.isEmpty()){
                        binding.vaccineRV.setLayoutManager(new LinearLayoutManager(VaccineListActivity.this));

                        VaccineAdapter adapter = new VaccineAdapter(VaccineListActivity.this, vaccineList);
                        binding.vaccineRV.setAdapter(adapter);
                    } else {
                        onFailure(call, new Throwable(response.message()));
                    }

                    for (Vaccine vaccine : vaccineList) {
                        System.out.println(vaccine.getName());
                        Log.i("TAG", "tag1: "+vaccine.getName());
                    }
                } else {
                    System.out.println("Erro na solicitação: " + response.code());
                }
            }
            @Override
            public void onFailure(Call<List<Vaccine>> call, Throwable t) {
                System.out.println("Erro na solicitação: " + t.getMessage());

                Log.i("TAG","tag2: "+t.getMessage());
            }
        });
    }

}