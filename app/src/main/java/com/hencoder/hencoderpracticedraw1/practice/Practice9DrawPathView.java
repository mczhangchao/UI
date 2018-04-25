package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import java.util.Date;

public class Practice9DrawPathView extends View {

    private int height;
    private int width;
    private Path path;//路径
    private Paint mPaint;
    private Paint mPaintpoint;
    private int count;
    private Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch (msg.what) {
                case 0x23://这应该写一个static final的变量
                    count++;
                    if (count < 80) {//形成循环，因为波浪线是两段40所以一个周期80
                        setCount(count);
                        handler.sendEmptyMessageDelayed(0x23, 20);
                    } else {
                        count = 0;
                        handler.sendEmptyMessageDelayed(0x23, 20);
                    }
                    break;
            }

        }
    };

    public void setCount(int count) {
        this.count = count;
        invalidate();
    }


    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        width = getDefaultSize(getSuggestedMinimumWidth(), widthMeasureSpec);
        height = getDefaultSize(getSuggestedMinimumHeight(), heightMeasureSpec);
        setMeasuredDimension(width, height);
    }



    public Practice9DrawPathView(Context context) {
        super(context);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        path = new Path();
        mPaint = new Paint();
//        mPaintpoint = new Paint();
//        mPaintpoint.setStrokeWidth(10);
//        mPaintpoint.setColor(Color.YELLOW);
//        mPaint.setAntiAlias(true);
//        mPaint.setTextSize(50);
//        mPaint.setStyle(Paint.Style.STROKE);
//        handler.sendEmptyMessage(0x23);//
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Log.d("Practice9DrawPathView","onDraw");
        Log.d("Practice9DrawPathView","count is " +count);
//
//        path.reset();
//        path.moveTo(count, 100);
//        for (int i = 0; i < 3; i++) {
//            path.rQuadTo(20, 10, 40, 0);//以（count=0，100）为原点开始画，控制点、结束点
//            path.rQuadTo(20, -10, 40, 0);//以（count=0，100）为原点开始画，控制点、结束点
//        }
//        canvas.drawPath(path, mPaint);

        path.addArc(200, 200, 400, 400, -225, 225);
        path.arcTo(400, 200, 600, 400, -180, 225, false);
        path.lineTo(400, 542);
        canvas.drawPath(path,mPaint);

    }
}
