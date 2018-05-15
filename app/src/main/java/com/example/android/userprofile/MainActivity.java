package com.example.android.userprofile;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView mePicture = findViewById(R.id.profile_picture);
        mePicture.setImageResource(R.drawable.me_bitmoji);

        TextView name = findViewById(R.id.name);
        name.setText(R.string.name);
        name.setTextSize(24);
        name.setTextColor(Color.BLACK);

        TextView birthday = findViewById(R.id.birthday);
        birthday.setText(R.string.birthdate);
        birthday.setTextSize(24);
        birthday.setTextColor(Color.BLACK);

        TextView country = findViewById(R.id.country);
        country.setText("U.S.A.");
        country.setTextSize(24);
        country.setTextColor(Color.BLACK);
    }

}
