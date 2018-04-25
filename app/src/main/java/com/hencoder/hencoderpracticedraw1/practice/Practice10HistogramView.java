package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图

        Paint paint=new Paint();
        paint.setColor(Color.WHITE);
        paint.setStyle(Paint.Style.STROKE);
        Path path=new Path();
        path.moveTo(100,60);
        path.lineTo(100,600);
        path.rLineTo(800,0);

        canvas.drawPath(path,paint);

        path.reset();
        paint.setColor(Color.GREEN);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        path.addRect(150,500,250,600, Path.Direction.CW);
        path.addRect(270,200,370,600, Path.Direction.CW);
        path.addRect(390,300,490,600, Path.Direction.CW);
        path.addRect(510,400,610,600, Path.Direction.CW);
        path.addRect(630,100,730,600, Path.Direction.CW);
        canvas.drawPath(path,paint);

    }
}
