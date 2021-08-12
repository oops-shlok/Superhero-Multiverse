package com.example.spidersuperheroes;

public class dataClass {
    public Images images;
    public Appearance appearance;
    private String name,sm;

    dataClass(Images images,Appearance appearance,String name, String sm){
        this.images=images;
        this.appearance=appearance;
        this.name=name;
        this.sm = sm;
    }

    public Images getImages() {
        return images;
    }

    public Appearance getAppearance() {
        return appearance;
    }

    public String getName() {
        return name;
    }

    public String getSm() {
        return sm;
    }

}
