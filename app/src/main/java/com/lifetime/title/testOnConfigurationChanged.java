package com.lifetime.title;

import android.annotation.SuppressLint;
import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class testOnConfigurationChanged extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_on_configuration_changed);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onConfigurationChanged(Configuration newConfig){
        super.onConfigurationChanged(newConfig);

        TextView hello = findViewById(R.id.hello);

        if(newConfig.orientation == Configuration.ORIENTATION_PORTRAIT){
            hello.setText("Hello World Portrait");
        }else if(newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE){
            hello.setText("Hello World Landscape");
        }
    }
}
