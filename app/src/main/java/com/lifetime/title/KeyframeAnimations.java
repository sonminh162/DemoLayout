package com.lifetime.title;

import android.os.Bundle;
import android.transition.TransitionManager;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;

public class KeyframeAnimations extends AppCompatActivity {
    private ConstraintLayout layout;
    private ConstraintSet constraintSetNew = new ConstraintSet();
    private ConstraintSet constraintSetOld = new ConstraintSet();
    private boolean altLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.keyframe_animations);

        layout = findViewById(R.id.layoutNew);
        constraintSetOld.clone(layout);
        constraintSetNew.clone(this,R.layout.keyframe_animations_detail);

    }

    public void swapView(View view){
        TransitionManager.beginDelayedTransition(layout);
        if(!altLayout){
            constraintSetNew.applyTo(layout);
            altLayout = true;
        }else{
            constraintSetOld.applyTo(layout);
            altLayout = false;
        }

    }
}
