package com.example.spidersuperheroes;

import android.content.Context;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.Picasso;

public class heroDetails extends AppCompatActivity {
    private ImageView imageview;
    private TextView textView;
    private TextView race;
    private TextView fname;
    private TextView birth;
    private TextView first;
    private TextView publisher;
    private TextView intelligence;
    private TextView strength;
    private TextView speed;
    private TextView durability;
    private TextView power;
    private TextView combat;
    private TextView gender;
    private TextView occupation;
    private TextView group;
    private TextView relatives;
    private String sm1,name1,gender1,race1,fname1,first1,birth1,publisher1,intelligence1,strength1,speed1,durability1,power1,combat1,occupation1,group1,relatives1;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hero_details);
        imageview=findViewById(R.id.heroImage);
        textView=findViewById(R.id.namesuperhero);
        gender= findViewById(R.id.gender);
        race=findViewById(R.id.race);
        fname=findViewById(R.id.height);
        first=findViewById(R.id.firstappearance);
        birth=findViewById(R.id.birth);
        publisher=findViewById(R.id.publisher);
        intelligence=findViewById(R.id.intelligence);
        strength=findViewById(R.id.strength);
        speed = findViewById(R.id.speed);
        durability=findViewById(R.id.durability);
        power=findViewById(R.id.power);
        combat=findViewById(R.id.combat);
        occupation=findViewById(R.id.occupation);
        group=findViewById(R.id.group);
        relatives=findViewById(R.id.relatives);
        getheroName();
        getnameAgain();
        getImage();
        getimageAgain();
        getGender();
        getGenderAgain();
        getRace();
        getraceAgain();
        getFName();
        getFNameAgain();
        getFAppearance();
        getFAppearanceAgain();
        getBirth();
        getBirthAgain();
        getPublisher();
        getPublisherAgain();
        getIntelligence();
        getIntelligenceAgain();
        getStrength();
        getStrengthAgain();
        getSpeed();
        getSpeedAgain();
        getDurabilty();
        getDurabilityAgain();
        getPower();
        getPowerAgain();
        getComabat();
        getCombatAgain(); getOcc(); getOccAgain(); getGroup();getGroupAgain();getRel();getRelAgain();
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
        gender.setText("Gender: "+gender1);
    }

    private void getRace(){
        if(getIntent().hasExtra("race")){
            race1=getIntent().getStringExtra("race");
        }else{

        }
    }
    private void getraceAgain(){
        race.setText("Race: "+race1);
    }

    private void getFName(){
        if(getIntent().hasExtra("fullName")){
            fname1=getIntent().getStringExtra("fullName");
        }

    }
    private void getFNameAgain(){
        fname.setText("Full Name: "+fname1);
    }

    private void getFAppearance(){
        if(getIntent().hasExtra("first")){
            first1=getIntent().getStringExtra("first");
        }else{

        }
    }
    private void getFAppearanceAgain(){
        first.setText("First Appearance:◻ ️"+first1);
    }

    private void getBirth(){
        if(getIntent().hasExtra("birth")){
            birth1=getIntent().getStringExtra("birth");
        }

    }
    private void getBirthAgain(){
        birth.setText("Place Of Birth: "+birth1);
    }

    private void getPublisher(){
        if(getIntent().hasExtra("publisher")){
            publisher1=getIntent().getStringExtra("publisher");
        }

    }
    private void getPublisherAgain(){
        publisher.setText("Publisher: "+publisher1);
    }

    private void getIntelligence(){
        if(getIntent().hasExtra("intelligence")){
            intelligence1=getIntent().getStringExtra("intelligence");
        }

    }
    private void getIntelligenceAgain(){
        intelligence.setText("Intelligence: "+intelligence1);
    }

    private void getStrength(){
        if(getIntent().hasExtra("strength")){
            strength1=getIntent().getStringExtra("strength");
        }

    }
    private void getStrengthAgain(){
        strength.setText("Strength: "+strength1);
    }

    private void getSpeed(){
        if(getIntent().hasExtra("speed")){
            speed1=getIntent().getStringExtra("speed");
        }

    }
    private void getSpeedAgain(){
        speed.setText("Speed: "+speed1);
    }

    private void getDurabilty(){
        if(getIntent().hasExtra("durability")){
            durability1=getIntent().getStringExtra("durability");
        }

    }
    private void getDurabilityAgain(){
        durability.setText("Durability: "+durability1);
    }

    private void getPower(){
        if(getIntent().hasExtra("power")){
            power1=getIntent().getStringExtra("power");
        }

    }
    private void getPowerAgain(){
        power.setText("Power: "+power1);
    }

    private void getComabat(){
        if(getIntent().hasExtra("combat")){
            combat1=getIntent().getStringExtra("combat");
        }

    }
    private void getCombatAgain(){
        combat.setText("Combat: "+combat1);
    }

    private void getOcc(){
        if(getIntent().hasExtra("occupation")){
            occupation1=getIntent().getStringExtra("occupation");
        }

    }
    private void getOccAgain(){
        occupation.setText("Occupation: "+occupation1);
    }

    private void getGroup(){
        if(getIntent().hasExtra("group")){
            group1=getIntent().getStringExtra("group");
        }

    }
    private void getGroupAgain(){
        group.setText("Group: "+group1);
    }

    private void getRel(){
        if(getIntent().hasExtra("relatives")){
            relatives1=getIntent().getStringExtra("relatives");
        }

    }
    private void getRelAgain(){
        relatives.setText("Relatives: "+relatives1);
    }
}