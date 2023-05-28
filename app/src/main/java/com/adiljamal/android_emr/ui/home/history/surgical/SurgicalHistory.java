package com.adiljamal.android_emr.ui.home.history.surgical;

import java.util.Date;

public class SurgicalHistory {

    private String Name;
    private Date date;
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
