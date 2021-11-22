package com.company.Task7;

public class Task7Implementation {
    public static void main(String[] args) {
        Circle myCircle = new Circle(25);
        System.out.println(myCircle.getPerimeter());
        ResizableCircle myResCircle = new ResizableCircle(20);
        System.out.println(myResCircle);
        myResCircle.resize(75);
        System.out.println(myResCircle);

    }
}
