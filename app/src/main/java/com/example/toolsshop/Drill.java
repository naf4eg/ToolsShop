package com.example.toolsshop;

public class Drill {
    private String title;
    private String info;
    private int imageResourcesId;

    public Drill(String title, String info, int imageResourcesId) {
        this.title = title;
        this.info = info;
        this.imageResourcesId = imageResourcesId;
    }

    public String getTitle() {
        return title;
    }

    public String getInfo() {
        return info;
    }

    public int getImageResourcesId() {
        return imageResourcesId;
    }

    @Override
    public String toString() {
        return title;
    }
}
