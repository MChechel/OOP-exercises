package com.company.Task1;

import java.util.Arrays;

public class PointsTesting {
    public static void main(String[] args) {
//        Point2D myLocation = new Point2D(3.5f,15f);
//        System.out.println(Arrays.toString(myLocation.getXY()));
//        myLocation.setXY(100,100);
//        System.out.println(Arrays.toString(myLocation.getXY()));
//        System.out.println(myLocation);
//
//        Point3D my3DLocation = new Point3D();
//        System.out.println((my3DLocation));
//        my3DLocation.setXYZ(1,1,1);
//        System.out.println((my3DLocation));
//
    // Point3D could be used for vector calculation: AB = SQRT((x2-x1)^2+(y2-y1)^2+(z2-z1)^2)
        Point3D pointA = new Point3D();
        pointA.setXYZ(-10,-10,-10);
        Point3D pointB = new Point3D();
        pointB.setXYZ(10,10,10);
        double vectorAB = Math.pow((Math.pow((pointB.getX()-pointA.getX()),2)+
                Math.pow((pointB.getY()-pointA.getY()),2)+
                Math.pow((pointB.getZ()-pointA.getZ()),2)),0.5);
        System.out.println("The value of vector AB is "+vectorAB);
    }
}
