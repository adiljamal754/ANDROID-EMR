package com.adiljamal.android_emr.ui.home.history.cronics;

import com.google.gson.annotations.SerializedName;

public class ChronicDiseases {

    @SerializedName("id")
    private int id;

    @SerializedName("name")
    private String name;

    @SerializedName("state")
    private String state;

    public ChronicDiseases(String diseases, boolean state){
        this.name = diseases;
        this.state = String.valueOf(state);
    }

    public String getDiseases() {
        return name;
    }

    public String getState() {
        return state;
    }
}
