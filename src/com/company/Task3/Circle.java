package com.company.Task3;

public class Circle extends Shape{
    private double radius;

    public Circle() {
        super();
        this.radius = 1;
    }
    public Circle(String color, boolean isFilled, double radius) {
        super(color, isFilled);
        this.radius = radius;
    }

    public double getArea(){
        return this.radius*this.radius*3.1415;
    }
    public double getPrerimeter(){
        return this.radius*2*3.1415;
    }

    @Override
    public String toString() {
        return "Circle with radius=" + radius + " which is subclass of "+super.toString();
    }
}
