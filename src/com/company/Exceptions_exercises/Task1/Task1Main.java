package com.company.Exceptions_exercises.Task1;

import javax.naming.CannotProceedException;

public class Task1Main {
    public static void main(String[] args) {
        System.out.println(divide(10,5));

        System.out.println(divide(0,5));

        System.out.println(divide(10,0));


    }
    //the task stated - in case second parameter is 0, non-default exception should be thrown:CannotDivideBy0Exception
    //I am not sure if what I did is counts as correct solution...
    public static double divide(int a, int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException("CannotDivideBy0Exception");
        }else return a/b;
        }
}
