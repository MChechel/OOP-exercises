package com.company.Task6;

public class TaskImplementation {
    public static void main(String[] args) {
        MovablePoint myPoint = new MovablePoint(0,0,10,10);
        System.out.println(myPoint);
        myPoint.moveLeft();
        System.out.println(myPoint);
        myPoint.moveLeft();
        System.out.println(myPoint);
        myPoint.moveUp();
        System.out.println(myPoint);
//circle implementation
        MovableCircle myCircle = new MovableCircle(myPoint,15);
        System.out.println(myCircle);
        myCircle.moveDown();
        myCircle.moveDown();
        myCircle.moveDown();
        myCircle.setRadius(10);
        System.out.println(myCircle);

    }
}
