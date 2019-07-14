package com.sulaimandanmallan.andelachallenge1;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

public class MyProfileActivity extends AppCompatActivity {

    public static final String BIG_JOHN  = "fonts/BauhausLightC-Regular.otf";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_profile);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if(toolbar != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }


        TextView name = findViewById(R.id.name_txt);
        TextView track = findViewById(R.id.track_txt);
        TextView country = findViewById(R.id.country_txt);
        TextView email = findViewById(R.id.email_txt);
        TextView phone = findViewById(R.id.phone_txt);
        TextView username = findViewById(R.id.username_txt);
        TextView toolbarTitle = findViewById(R.id.toolbar_title);

        Typeface face = Typeface.createFromAsset(getAssets(),BIG_JOHN);
        name.setTypeface(face);
        track.setTypeface(face);
        country.setTypeface(face);
        email.setTypeface(face);
        phone.setTypeface(face);
        username.setTypeface(face);
        toolbarTitle.setTypeface(face);
    }
}
