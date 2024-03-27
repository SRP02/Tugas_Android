package com.example.tugas_android;

public class Items_Shape {

    String name;
    String image;
    String description;

    public int getParam() {
        return param;
    }

    public void setParam(int param) {
        this.param = param;
    }

    int param;

    public Items_Shape(String name, String image, String description,int param) {
        this.name = name;
        this.image = image;
        this.description = description;
        this.param = param;
    }



    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getImage() {
        return image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}