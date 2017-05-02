package com.example.shooting_sample;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

/**
 * Created by taka on 2017/05/02.
 */

public class Score {
    private int score;
    private Paint paint = new Paint();

    public Score()
    {
        paint.setColor(Color.WHITE);
    }

    public void decrease(int point) {
        score -= point;
    }

    public void draw(Canvas canvas) {
        String sc = "000000000" + score;
        canvas.drawText(sc.substring(sc.length() - 10), 0, paint.getTextSize(), paint);
    }
    
    public void add(int point) {
        score += point;
    }
}
