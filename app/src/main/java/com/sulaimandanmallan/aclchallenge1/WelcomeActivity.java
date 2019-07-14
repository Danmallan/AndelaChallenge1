package com.sulaimandanmallan.aclchallenge1;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class WelcomeActivity extends AppCompatActivity {

    public static final String BIG_JOHN  = "fonts/BauhausLightC-Regular.otf";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button aboutButton = findViewById(R.id.about_alc_button);
        Button myProfileButton = findViewById(R.id.my_profile_button);
        TextView welcomTxt = findViewById(R.id.welcome_text);
        TextView toolBarTxt = findViewById(R.id.toolbar_title);

        Typeface face = Typeface.createFromAsset(getAssets(),BIG_JOHN);
        aboutButton.setTypeface(face);
        myProfileButton.setTypeface(face);
        welcomTxt.setTypeface(face);
        toolBarTxt.setTypeface(face);

        aboutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(WelcomeActivity.this, AboutALCActivity.class));
            }
        });
        myProfileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(WelcomeActivity.this, MyProfileActivity.class));
            }
        });

    }
}
