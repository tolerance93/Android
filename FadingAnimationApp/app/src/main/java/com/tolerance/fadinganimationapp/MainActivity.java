package com.tolerance.fadinganimationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private boolean isPortraitIUShowing = true;


    public void animate(View view) {
        Log.i("Info", "animate");

        ImageView portraitImageView = findViewById(R.id.iuImageView1);
        ImageView sittingImageView = findViewById(R.id.iuImageView2);

        if (isPortraitIUShowing) {
            portraitImageView.animate().alpha(0).setDuration(2000);
            sittingImageView.animate().alpha(1).setDuration(2000);
        }
        else {
            portraitImageView.animate().alpha(1).setDuration(2000);
            sittingImageView.animate().alpha(0).setDuration(2000);
        }
        isPortraitIUShowing = !isPortraitIUShowing;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}