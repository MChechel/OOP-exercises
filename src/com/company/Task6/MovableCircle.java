package com.company.Task6;

public class MovableCircle implements Movable{
    public MovableCircle(MovablePoint circleCenter, int radius) {
        this.circleCenter = circleCenter;
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "circleCenter=" + circleCenter +
                ", radius=" + radius +
                '}';
    }

    private MovablePoint circleCenter;
    private int radius;

    public MovablePoint getCircleCenter() {
        return circleCenter;
    }

    public void setCircleCenter(MovablePoint circleCenter) {
        this.circleCenter = circleCenter;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void moveUp() {
        circleCenter.moveUp();
    }

    @Override
    public void moveDown() {
        circleCenter.moveDown();
    }

    @Override
    public void moveLeft() {
        circleCenter.moveLeft();
    }

    @Override
    public void moveRight() {
        circleCenter.moveRight();
    }
}
