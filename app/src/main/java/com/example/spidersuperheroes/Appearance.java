package com.example.spidersuperheroes;

import android.os.Parcel;
import android.os.Parcelable;

public class Appearance implements Parcelable {
    private String gender;
    private String race;
    protected Appearance(Parcel in) {gender = in.readString();
        race=in.readString();
    }

    public static final Creator<Appearance> CREATOR = new Creator<Appearance>() {
        @Override
        public Appearance createFromParcel(Parcel in) {
            return new Appearance(in);
        }

        @Override
        public Appearance[] newArray(int size) {
            return new Appearance[size];
        }
    };

    public String getGender() {
        return gender;
    }

    public String getRace(){
        return race;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
    }
}