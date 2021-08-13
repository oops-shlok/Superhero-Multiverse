package com.example.spidersuperheroes;

import android.os.Parcel;
import android.os.Parcelable;

public class Images implements Parcelable {
    String lg;
    protected Images(Parcel in) {lg=in.readString();
    }

    public static final Creator<Images> CREATOR = new Creator<Images>() {
        @Override
        public Images createFromParcel(Parcel in) {
            return new Images(in);
        }

        @Override
        public Images[] newArray(int size) {
            return new Images[size];
        }
    };

    public String getLg() {
        return lg;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
    }
}
