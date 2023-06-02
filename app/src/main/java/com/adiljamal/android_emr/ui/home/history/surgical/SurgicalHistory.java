package com.adiljamal.android_emr.ui.home.history.surgical;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class SurgicalHistory {

    @SerializedName("id")
    private int id;

    @SerializedName("name")
    private String Name;

    @SerializedName("date")
    private Date date;

    @SerializedName("description")
    private String Description;

    public SurgicalHistory(String name, Date date, String description) {
        Name = name;
        this.date = date;
        Description = description;
    }

    public String getName() {
        return Name;
    }

    public Date getDate() {
        return date;
    }

    public String getDescription() {
        return Description;
    }
}
