package com.adiljamal.android_emr.ui.news;

import com.google.gson.annotations.SerializedName;

public class News {

    @SerializedName("id")
    private int id;

    @SerializedName("title")
    private String title;

    @SerializedName("image")
    private int image;

    @SerializedName("description")
    private String description;

    public News(String title, int image, String description) {
        this.title = title;
        this.image = image;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
