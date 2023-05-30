package com.adiljamal.android_emr.ui.home.vaccine;

import java.util.Date;

public class Vaccine {

    private String name;
    private Date date;
    private String description;

    public Vaccine(String name, Date date, String description) {
        this.name = name;
        this.date = date;
        this.description = description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public Date getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }
}
