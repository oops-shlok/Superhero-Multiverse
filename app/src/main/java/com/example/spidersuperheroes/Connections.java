package com.example.spidersuperheroes;

public class Connections {
    private String groupAffiliation;
    private String relatives;

    public Connections(String groupAffiliation, String relatives) {
        this.groupAffiliation = groupAffiliation;
        this.relatives = relatives;
    }

    public String getGroupAffiliation() {
        return groupAffiliation;
    }

    public String getRelatives() {
        return relatives;
    }
}
