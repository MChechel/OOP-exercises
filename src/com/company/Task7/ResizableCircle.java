package com.company.Task7;

public class ResizableCircle implements Resizable{
    private double radius;

    @Override
    public String toString() {
        return "ResizableCircle{" +
                "radius=" + radius +
                '}';
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public ResizableCircle(double radius) {
        this.radius = radius;
    }

    @Override
    public void resize(int percent) {
        this.radius = this.radius*percent/100;
    }
}
