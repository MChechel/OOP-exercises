package com.company.Classes_interfaces.Task3;

public class Task3Implementation {

    public static void main(String[] args) {
        Car myCar = new Car("economy","NEW");
        Car.Engine theEngine = myCar.new Engine(myCar.getType());

        System.out.println(theEngine);


    }
}
