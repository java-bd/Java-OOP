/**
 * Created by Google on 8/22/2015.
 */

package com.example.google.interview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;


public class ChartView extends View {


    public ChartView(Context context, AttributeSet attributeSet){
        super(context, attributeSet);
        init();
    }
    Paint paint;
    public void init(){
        paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setColor(Color.MAGENTA);
        paint.setStyle(Paint.Style.FILL);
        paint.setShadowLayer(30, 0, 0, Color.RED);

    }
    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawCircle(getWidth()/2, getHeight()/2, 80, paint);
    }
}