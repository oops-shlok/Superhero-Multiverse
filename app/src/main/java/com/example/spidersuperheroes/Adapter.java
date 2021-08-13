package com.example.spidersuperheroes;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;

import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;


public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private List<dataClass> userList;
    private Activity activity;


    public Adapter(Activity activity, List<dataClass> userList){
        this.activity= activity;
        this.userList=userList;
    }

    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.superheroes,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {
        dataClass dataClass = userList.get(position);
        String lg=dataClass.getImages().getLg();

        holder.name.setText(dataClass.getName());
        Picasso.with(activity).load(lg).fit().into(holder.imageView);
        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity.getApplicationContext(),heroDetails.class);
                intent.putExtra("image",dataClass.getImages().getLg());
                intent.putExtra("name",dataClass.getName());
                intent.putExtra("gender",dataClass.getAppearance().getGender());
                intent.putExtra("race",dataClass.getAppearance().getRace());
                intent.putExtra("fullName",dataClass.getBiography().getFullName());
                intent.putExtra("first",dataClass.getBiography().getFirstAppearance());
                intent.putExtra("birth",dataClass.getBiography().getPlaceOfBirth());
                intent.putExtra("publisher",dataClass.getBiography().getPublisher());
                intent.putExtra("intelligence",dataClass.getPowerstats().getIntelligence());
                intent.putExtra("strength",dataClass.getPowerstats().getStrength());
                intent.putExtra("speed",dataClass.getPowerstats().getSpeed());
                intent.putExtra("durability",dataClass.getPowerstats().getDurability());
                intent.putExtra("power",dataClass.getPowerstats().getPower());
                intent.putExtra("combat",dataClass.getPowerstats().getCombat());
                intent.putExtra("occupation",dataClass.getWork().getOccupation());
                intent.putExtra("group",dataClass.getConnections().getGroupAffiliation());
                intent.putExtra("relatives",dataClass.getConnections().getRelatives());

                activity.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private ImageView imageView;
        private TextView name;
        private RelativeLayout relativeLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.hero_image);
            name = itemView.findViewById(R.id.hero_names);
            relativeLayout = itemView.findViewById(R.id.layout);

        }

    }
}

