package com.lifetime.title;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.lifetime.title.views.CustomView;

public class CustomViewExample extends AppCompatActivity {

    private CustomView mCustomView;

    @Override
    protected void onCreate(Bundle savedInstance){
        super.onCreate(savedInstance);
        setContentView(R.layout.custom_view);

        mCustomView = findViewById(R.id.customView);

        findViewById(R.id.btn_swap_color).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                mCustomView.swapColor();
            }
        });
    }
}
