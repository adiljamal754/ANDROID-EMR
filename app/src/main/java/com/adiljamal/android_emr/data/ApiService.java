package com.adiljamal.android_emr.data;

import com.adiljamal.android_emr.User;
import com.adiljamal.android_emr.ui.home.history.cronics.ChronicDiseases;
import com.adiljamal.android_emr.ui.home.history.surgical.SurgicalHistory;
import com.adiljamal.android_emr.ui.home.vaccine.Vaccine;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiService {
    @GET("User")
    Call<List<User>> getUsers();
    @GET("Vaccine")
    Call<List<Vaccine>> getVaccines();
    @GET("ChronicDiseases")
    Call<List<ChronicDiseases>> getChronicDiseases();
    @GET("Surgery")
    Call<List<SurgicalHistory>> getSurgeries();
}
