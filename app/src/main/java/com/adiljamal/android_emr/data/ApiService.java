package com.adiljamal.android_emr.data;

import com.adiljamal.android_emr.ui.home.history.surgical.SurgeryAdapter;
import com.adiljamal.android_emr.ui.home.history.surgical.SurgicalHistory;

import java.util.List;
import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiService {

    private static final String BASE_URL = "http://192.168.100.5:8080";
    private static ApiService instance;
    private Retrofit retrofit;

    OkHttpClient client = new OkHttpClient.Builder()
            .connectTimeout(20, TimeUnit.SECONDS)
            .build();

    private ApiService() {
        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build();
    }

    public static synchronized ApiService getInstance() {
        if (instance == null) {
            instance = new ApiService();
        }
        return instance;
    }


    public void getAllSurgiries(final SurgeryAdapter surgeryAdapter) {
        ApiServiceInterfaces apiInterface = retrofit.create(ApiServiceInterfaces.class);
        Call<List<SurgicalHistory>> call = apiInterface.getSurgeries();
        call.enqueue(new Callback<List<SurgicalHistory>>() {
            @Override
            public void onResponse(Call<List<SurgicalHistory>> call, Response<List<SurgicalHistory>> response) {
                if (response.isSuccessful()) {
                    List<SurgicalHistory> surgeries = response.body();
                    if (surgeries != null) {
                        surgeryAdapter.setSurgeries(surgeries);
                        surgeryAdapter.notifyDataSetChanged();
                    }
                } else {
                    onFailure(call, new Throwable(response.message()));
                }
            }

            @Override
            public void onFailure(Call<List<SurgicalHistory>> call, Throwable t) {
                t.printStackTrace();
            }
        });
    }


}
