package com.lifetime.title;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

public class fragmentExample2 extends Fragment {

    View view;
    Button firstButton;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        view = inflater.inflate(R.layout.fragment_simple,container,false);
        firstButton = view.findViewById(R.id.firstButton);
        firstButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(getActivity(),"Fragment's Button",Toast.LENGTH_LONG).show();
            }
        });
        return view;
    }
}
