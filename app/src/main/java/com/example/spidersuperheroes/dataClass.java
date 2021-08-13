package com.example.spidersuperheroes;

public class dataClass {
    public Images images;
    public Appearance appearance;
    public Biography biography;
    public PowerStats powerstats;
    public Work work;
    public Connections connections;
    private String name;

    dataClass(Images images,Appearance appearance,Biography biography,PowerStats powerstats,Work work,Connections connections,String name){
        this.images=images;
        this.appearance=appearance;
        this.biography=biography;
        this.powerstats=powerstats;
        this.work=work;
        this.connections=connections;
        this.name=name;
    }

    public Images getImages() {
        return images;
    }

    public Appearance getAppearance() {
        return appearance;
    }

    public Biography getBiography(){
        return biography;
    }

    public PowerStats getPowerstats(){return powerstats;}

    public Work getWork() { return work; }

    public Connections getConnections() { return connections; }

    public String getName() {
        return name;
    }

}
