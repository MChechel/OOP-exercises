package com.company.Task3;

public class Task3Implementation {
    public static void main(String[] args) {

        Circle myCircle = new Circle("blue",true,13);
        System.out.println(myCircle);
        Rectangle myRectangle = new Rectangle("Yellow",false,15,15);
        System.out.println(myRectangle);
        System.out.println(myRectangle.getArea());
        Square mySquare = new Square("Blue",true,50);
        System.out.println(mySquare);
        System.out.println(mySquare.getArea());
    }
}
