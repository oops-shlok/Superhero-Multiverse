package com.example.spidersuperheroes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class heroDetails extends AppCompatActivity {
    private ImageView imageview;
    private TextView textView;
    private TextView race;
    private TextView height;
    private TextView weight;
    private TextView gender;
    private String sm1,name1,gender1,race1,height1,weight1;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hero_details);
        imageview=findViewById(R.id.heroImage);
        textView=findViewById(R.id.namesuperhero);
        gender= findViewById(R.id.gender);
        race=findViewById(R.id.race);
        height=findViewById(R.id.height);
        weight=findViewById(R.id.weight);
        getheroName();
        getnameAgain();
        getImage();
        getimageAgain();
        getGender();
        getGenderAgain();
        getRace();
        getraceAgain();
        getHeight();
        getHeightAgain();
        getWeight();
        getWeightAgain();
    }
    private void getheroName(){
        if(getIntent().hasExtra("name")){
            name1=getIntent().getStringExtra("name");
        }else{

        }
    }
    private void getnameAgain(){
        textView.setText(name1);
    }

    private void getImage(){
        if(getIntent().hasExtra("image")){
            sm1=getIntent().getStringExtra("image");
        }else{

        }
    }
    private void getimageAgain(){
        Picasso.with(context).load(sm1).into(imageview);
    }

    private void getGender(){
        if(getIntent().hasExtra("gender")){
            gender1=getIntent().getStringExtra("gender");
        }else{

        }
    }
    private void getGenderAgain(){
        gender.setText(gender1);
    }

    private void getRace(){
        if(getIntent().hasExtra("race")){
            race1=getIntent().getStringExtra("race");
        }else{

        }
    }
    private void getraceAgain(){
        race.setText(race1);
    }

    private void getHeight(){
        if(getIntent().hasExtra("height")){
            height1=getIntent().getStringExtra("height");
        }

    }
    private void getHeightAgain(){
        height.setText(height1);
    }

    private void getWeight(){
        if(getIntent().hasExtra("weight")){
            weight1=getIntent().getStringExtra("weight");
        }else{

        }
    }
    private void getWeightAgain(){
        weight.setText(weight1);
    }

}