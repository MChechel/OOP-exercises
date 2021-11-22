package com.company.Task3;

public class Square extends Rectangle{
    public Square(String color, boolean isFilled, double width) {
        super(color, isFilled, width, width);
    }

    @Override
    public String toString() {
        return "Square with width=" + super.getWidth() + " which is subclass of " + super.toString();
    }
    }
