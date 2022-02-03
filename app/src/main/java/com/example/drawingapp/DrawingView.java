package com.example.drawingapp;

import android.content.Context;
import android.graphics.Path;
import android.view.View;

import java.util.ArrayList;

public class DrawingView extends View {

    private ArrayList<Path> paths = new ArrayList<>();

    public DrawingView(Context context) {
        super(context);
    }


}
