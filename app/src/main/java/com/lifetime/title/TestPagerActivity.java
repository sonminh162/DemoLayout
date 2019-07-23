package com.lifetime.title;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import java.util.ArrayList;

public class TestPagerActivity extends AppCompatActivity {
    private ArrayList<ViewPagerObject> listFace;
    private ViewPager vpSmile;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);
        initData();
        initView();
    }

    private void initData() {
        listFace = new ArrayList<>();
        listFace.add(new ViewPagerObject("#424549",R.drawable.smile1,"smile 1"));
        listFace.add(new ViewPagerObject("#4980f9",R.drawable.smile2,"smile 2"));
        listFace.add(new ViewPagerObject("#796e25",R.drawable.smile3,"smile 3"));
    }

    private void initView() {
        vpSmile = findViewById(R.id.vp_smile);
        TestViewPageAdapter adapter = new TestViewPageAdapter(this,listFace);
        vpSmile.setAdapter(adapter);
    }

}
