package com.lifetime.title;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LocalizingStringResources extends AppCompatActivity {

    RelativeLayout myLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.localizing_string_resources);

        Button button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                TextView textView = new TextView(LocalizingStringResources.this);
                myLayout = findViewById(R.id.myLayout);
                textView.setLayoutParams(new RelativeLayout.LayoutParams(
                        RelativeLayout.LayoutParams.MATCH_PARENT,
                        RelativeLayout.LayoutParams.MATCH_PARENT
                ));
                textView.setText("Created on Code");
                myLayout.addView(textView);
//                Toast.makeText(LocalizingStringResources.this,R.string.toast,Toast.LENGTH_LONG).show();
            }
        });
    }
}
