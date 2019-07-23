package com.lifetime.title.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class CustomView extends View {

    private static final int SQUARE_SIZE = 200;

    private Rect mRectSquare;

    private Paint mPaintSquare;

    public CustomView(Context context) {
        super(context);

        init(null);
    }

    public CustomView(Context context, AttributeSet attrs) {
        super(context, attrs);

        init(attrs);
    }

    public CustomView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        init(attrs);
    }

    public CustomView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);

        init(attrs);
    }

    private void init(@Nullable AttributeSet set){
        mRectSquare = new Rect();
        mPaintSquare = new Paint(Paint.ANTI_ALIAS_FLAG);
        mPaintSquare.setColor(Color.GREEN);

    }

    public void swapColor(){
        mPaintSquare.setColor(mPaintSquare.getColor() == Color.GREEN ? Color.RED : Color.GREEN);

        postInvalidate();
    }

    @Override
    protected void onDraw(Canvas canvas){

        mRectSquare.left = 50;
        mRectSquare.top = 50;
        mRectSquare.right = mRectSquare.left + SQUARE_SIZE;
        mRectSquare.bottom = mRectSquare.top + SQUARE_SIZE;

        canvas.drawRect(mRectSquare,mPaintSquare);
    }

}
