package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图

        Paint paint=new Paint();
        RectF rectF=new RectF(100,100,500,500);

        paint.setColor(Color.RED);
        canvas.drawArc(rectF,0,20,true,paint);

        paint.setColor(Color.GRAY);
        canvas.drawArc(rectF,30,20,true,paint);

        paint.setColor(Color.GREEN);
        canvas.drawArc(rectF,60,90,true,paint);

        paint.setColor(Color.WHITE);
        canvas.drawArc(rectF,160,20,true,paint);

        RectF rectF2=new RectF(90,90,490,490);
        paint.setColor(Color.BLUE);
        canvas.drawArc(rectF2,180,100,true,paint);

        paint.setColor(Color.DKGRAY);
        canvas.drawArc(rectF,-70,65,true,paint);

    }
}
