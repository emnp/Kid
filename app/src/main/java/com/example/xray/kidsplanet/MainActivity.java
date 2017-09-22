package com.example.xray.kidsplanet;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar= getSupportActionBar();
        actionBar.hide();

        if (savedInstanceState == null){
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_IMMERSIVE| View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
            | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN| View.SYSTEM_UI_FLAG_HIDE_NAVIGATION| View.SYSTEM_UI_FLAG_IMMERSIVE| View.SYSTEM_UI_FLAG_IMMERSIVE);
        }

        ImageButton imgbtnStory , imgbtnPoem , imgbtnEdu;
        final FloatingActionButton FAB = (FloatingActionButton) findViewById(R.id.floatingActionButton);

        imgbtnStory = (ImageButton) findViewById(R.id.img_btnStory);
        imgbtnPoem = (ImageButton) findViewById(R.id.img_btnPoem);
//        imgbtnEdu = (ImageButton) findViewById(R.id.img_btnEdu);

        imgbtnStory.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getApplicationContext(), StoryGridView.class);
                startActivity(intent);
            }
        });
        imgbtnPoem.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getApplicationContext(), PoemGridView.class);
                startActivity(intent);
            }
        });
//        imgbtnEdu.setOnClickListener(new View.OnClickListener(){
//
//            @Override
//            public void onClick(View v) {
//            }
//                Intent intent= new Intent(getApplicationContext(), EducationLayout.class);
//                startActivity(intent);
//        });
        FAB.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getApplicationContext(), About_Us.class);
                startActivity(intent);
            }

        });

    }

    }