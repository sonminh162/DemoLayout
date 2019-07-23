package com.lifetime.title;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import java.util.ArrayList;

public class TestViewPageAdapter extends PagerAdapter {

    private ArrayList<ViewPagerObject> listFace;
    private LayoutInflater layoutInflater;
    private Context context;

    public TestViewPageAdapter(Context context, ArrayList<ViewPagerObject> listFace) {
        this.listFace = listFace;
        this.context = context;
    }

    @Override
    public int getCount() {
        return listFace.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view.equals((object));
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position){
        layoutInflater = LayoutInflater.from(context);
        //Chuyen file xml thanh view
        View view = layoutInflater.inflate(R.layout.item_smile,container,false);
        //anh xa view
        LinearLayout lnContainer = view.findViewById(R.id.ln_container);
        ImageView ivFace = view.findViewById(R.id.iv_icon);
        TextView tvName = view.findViewById(R.id.tv_name);
        //Do du lieu

        ViewPagerObject face = listFace.get(position);

        lnContainer.setBackgroundColor(Color.parseColor(face.getColor()));
        ivFace.setImageResource(face.getFaceId());
        tvName.setText(face.getName());
        //Them vao container
        container.addView(view,0);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object){
        container.removeView((View)object);

    }

}
