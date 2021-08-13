package com.example.spidersuperheroes;

public class Biography {
    private String fullName;
    private String firstAppearance;
    private String placeOfBirth;
    private String publisher;

    Biography(String fullName, String firstAppearance, String placeOfBirth,String publisher) {
        this.fullName = fullName;
        this.firstAppearance = firstAppearance;
        this.placeOfBirth = placeOfBirth;
        this.publisher=publisher;
    }

    public String getFullName() {
        return fullName;
    }

    public String getFirstAppearance() {
        return firstAppearance;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public String getPublisher(){return publisher;}
}
