package com.company.Exceptions_exercises.Task1;

import javax.naming.CannotProceedException;

class CannotDivideBy0Exception extends Exception {
    public CannotDivideBy0Exception() {
        super("Can't divide by 0!");
    }
}
public class Task1Main {
    public static void main(String[] args) throws CannotDivideBy0Exception {
        System.out.println(divide(10,5));

        System.out.println(divide(0,5));

        System.out.println(divide(10,0));
    }
    //the task stated - in case second parameter is 0, non-default exception should be thrown:CannotDivideBy0Exception
    //I am not sure if what I did is counts as correct solution...
    //
    // Correction 1 - The exeption had to be created - now added
    public static double divide(int a, int b) throws CannotDivideBy0Exception{
        if(b==0){
            throw new CannotDivideBy0Exception();
        }else return a/b;
        }
}


