package com.example.assignment8navigationdrawerui.Model;

public class TravelingModel {

    private int img;
    private String type;

    public TravelingModel(int img, String type) {
        this.img = img;
        this.type = type;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
