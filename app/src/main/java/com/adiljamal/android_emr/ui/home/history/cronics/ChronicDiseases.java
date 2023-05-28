package com.adiljamal.android_emr.ui.home.history.cronics;

public class ChronicDiseases {

    private String diseases;
    private String state;

    public ChronicDiseases(String diseases, String state){
        this.diseases = diseases;
        this.state = state;
    }

    public String getDiseases() {
        return diseases;
    }

    public String getState() {
        return state;
    }
}
