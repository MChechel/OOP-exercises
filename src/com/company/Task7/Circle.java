package com.company.Task7;

public class Circle implements GeometricObject{
    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2*3.1415*this.radius;
    }

    @Override
    public double getArea() {
        return this.radius*this.radius*3.1415;
    }
}
