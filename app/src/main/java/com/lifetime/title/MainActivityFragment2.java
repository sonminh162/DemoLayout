package com.lifetime.title;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivityFragment2 extends AppCompatActivity {

    Button activityButton;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_example_2);
        activityButton = findViewById(R.id.activity_button);

        activityButton.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View v){
               Toast.makeText(getApplicationContext(),"Activity's Button", Toast.LENGTH_LONG).show();
           }
        });
    }
}
