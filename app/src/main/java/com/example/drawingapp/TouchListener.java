package com.example.drawingapp;


import android.graphics.Path;
import android.view.MotionEvent;
import android.view.View;

public class TouchListener implements View.OnTouchListener {

    @Override
    public boolean onTouch(View view, MotionEvent event) {

        float x = event.getX();
        float y = event.getY();

        DrawingView drawingView = (DrawingView) view;
        Path path;

        return false;

    }

}
