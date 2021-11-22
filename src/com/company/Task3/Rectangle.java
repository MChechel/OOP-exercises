package com.company.Task3;

public class Rectangle extends Shape{
    private double width;
    private double length;

    public Rectangle() {
        super();
        this.width = 1;
        this.length = 1;
    }

    public Rectangle(String color, boolean isFilled, double width, double length) {
        super(color, isFilled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }
    @Override
    public double getArea(){
        return this.width*this.length;
    }
    @Override
    public double getPrerimeter(){
        return this.width*2+this.length*2;
    }

    @Override
    public String toString() {
        return "Rectangle with width=" + this.width +" and length=" + this.length+ " which is subclass of "+super.toString();
    }
}
