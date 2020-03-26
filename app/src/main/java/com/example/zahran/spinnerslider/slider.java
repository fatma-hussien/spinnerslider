package com.example.zahran.spinnerslider;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class slider extends AppCompatActivity {

    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slider);
        viewPager=findViewById(R.id.views);
        ImageAdapter imageAdapter=new ImageAdapter(this);
        viewPager.setAdapter(imageAdapter);
    }
}
