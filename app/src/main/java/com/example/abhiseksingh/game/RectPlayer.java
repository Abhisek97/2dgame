package com.example.abhiseksingh.game;

import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.support.constraint.solver.widgets.Rectangle;

/**
 * Created by Abhisek Singh on 7/30/2018.
 */

public class RectPlayer implements GameObject {
    private Rect rectangle;
    private int color;

    public RectPlayer(Rect rectangle, int color) {
        this.rectangle = rectangle;
        this.color = color;
    }

    @Override
    public void draw(Canvas canvas) {

    }

    @Override
    public void update() {

    }

    public void update(Point point) {
        //left, top, right, bottom
        rectangle.set(point.x - rectangle.width(), point.y - rectangle.height(), );
    }
}
