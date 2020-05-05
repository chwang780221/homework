package com.train.homework.java;

public class Box {
    private float boxLength;
    private float boxWidth;
    private int boxHeight;

    public Box(float length, float width, int height) {
        this.boxLength = length;
        this.boxWidth = width;
        this.boxHeight = height;
    }

    public boolean getBox(float length, float width, int height) {
        return ((length <= boxLength) && (width <= boxWidth) && (height <= boxHeight));
    }
}
