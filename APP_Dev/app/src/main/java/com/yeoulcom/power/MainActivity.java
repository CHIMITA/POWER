package com.yeoulcom.power;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button button;
    ImageButton Ibtn_Z, Ibtn_Y;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Ibtn_Z = findViewById(R.id.z_testgo);
        Ibtn_Z.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Z_TestActivity.class);
                startActivity(intent);
            }
        });

        Ibtn_Y = findViewById(R.id.y_testgo);
        Ibtn_Y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Y_TestActivity.class);
                startActivity(intent);
            }
        });


    }



}