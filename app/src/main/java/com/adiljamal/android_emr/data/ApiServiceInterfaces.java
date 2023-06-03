package com.adiljamal.android_emr.data;

import com.adiljamal.android_emr.User;
import com.adiljamal.android_emr.ui.home.history.cronics.ChronicDiseases;
import com.adiljamal.android_emr.ui.home.history.surgical.SurgicalHistory;
import com.adiljamal.android_emr.ui.home.vaccine.Vaccine;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiServiceInterfaces {
    @GET("user")
    Call<List<User>> getUsers();
    @GET("vaccine")
    Call<List<Vaccine>> getVaccines();
    @GET("chronicDiseases")
    Call<List<ChronicDiseases>> getChronicDiseases();
    @GET("surgery")
    Call<List<SurgicalHistory>> getSurgeries();
}
