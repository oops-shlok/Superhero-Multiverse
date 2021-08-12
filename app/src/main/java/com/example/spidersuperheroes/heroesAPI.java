package com.example.spidersuperheroes;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface heroesAPI {
    @GET("all.json")
    Call<List<dataClass>>getHeroes();
}
