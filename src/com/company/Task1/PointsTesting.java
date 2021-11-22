package com.company.Task1;

import java.util.Arrays;

public class PointsTesting {
    public static void main(String[] args) {
        Point2D myLocation = new Point2D(3.5f,15f);
        System.out.println(Arrays.toString(myLocation.getXY()));
        myLocation.setXY(100,100);
        System.out.println(Arrays.toString(myLocation.getXY()));
        System.out.println(myLocation);
    }
}
