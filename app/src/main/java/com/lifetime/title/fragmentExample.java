package com.lifetime.title;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class fragmentExample extends AppCompatActivity {

    Button firstFragment, secondFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_example);

        //get the reference of Button's
        firstFragment = findViewById(R.id.firstFragment);
        secondFragment = findViewById(R.id.secondFragment);

        //perform setOnClickListener event on First Button
        firstFragment.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //load First Fragment
                loadFragment(new FirstFragment());
            }
        });

        secondFragment.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                loadFragment(new SecondFragment());
            }
        });
    }

    private void loadFragment(Fragment fragment) {
        //create a FragmentManager
        FragmentManager fm = getSupportFragmentManager();
        //create a FragmentTransaction to begin the transaction and replace the Fragment
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        //replace the FrameLayout with new Fragment
        fragmentTransaction.replace(R.id.frameLayout,fragment);
        fragmentTransaction.commit();
    }
}
