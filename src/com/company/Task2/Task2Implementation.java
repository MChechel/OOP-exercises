package com.company.Task2;

public class Task2Implementation {
    public static void main(String[] args) {

        Person mike = new Person("Mike","Tallinn");

        Student st1 = new Student("Mechatronics",5,6000);
        Student st2 = new Student("Mechatronics",4,6000);
        Student st3 = new Student("Mechatronics",1,8000);
        st1.setName("Mike");
        st1.setAddress("Tallinn");
        st2.setName("Jack");
        st2.setAddress("Tallinn");
        st3.setName("Bob");
        st3.setAddress("Tallinn");
        System.out.println(st1);
        Lecturer lecturer1=new Lecturer("Physics",3200);
        lecturer1.setName("Prof.Mark");
        System.out.println(lecturer1);


    }
}
