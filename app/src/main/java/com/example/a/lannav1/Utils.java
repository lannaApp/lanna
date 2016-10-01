package com.example.a.lannav1;

import android.graphics.Paint;

/**
 * Created by a on 25/9/2559.
 */
public class Utils {

    public Paint preparePaint(){
        Paint mPaint = new Paint();
        mPaint.setDither(true);
        mPaint.setColor(0xFFFFFFFF);
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setStrokeJoin(Paint.Join.ROUND);
        mPaint.setStrokeCap(Paint.Cap.ROUND);
        mPaint.setStrokeWidth(30);
        return mPaint;
    }

}
