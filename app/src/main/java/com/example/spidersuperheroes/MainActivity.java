package com.example.spidersuperheroes;

import android.content.Context;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    private Context context;
    LinearLayoutManager layoutManager = new LinearLayoutManager(this);
    List<dataClass> userList;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.info_heroes);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://akabab.github.io/superhero-api/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        heroesAPI heroesAPI = retrofit.create(heroesAPI.class);
        Call<List<dataClass>> call = heroesAPI.getHeroes();
        call.enqueue(new Callback<List<dataClass>>() {
            @Override
            public void onResponse(Call<List<dataClass>> call, Response<List<dataClass>> response) {
                List<dataClass> userList = response.body();
                Adapter adapter = new Adapter(MainActivity.this,userList);
                recyclerView.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<List<dataClass>> call, Throwable t) {
                return;
            }

        });

    }

}