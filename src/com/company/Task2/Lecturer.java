package com.company.Task2;

public class Lecturer extends Person{
        private String specialization;
        private int salary;

    @Override
    public String toString() {
        return "Lecturer{" + '\t' +
                "Name='" + super.getName() + '\t' +
                "Address='" + super.getAddress() + '\t' +
                "specialization='" + specialization + '\t' +
                ", salary=" + salary +
                '}';
    }

    public Lecturer(String specialization, int salary) {
        this.specialization = specialization;
        this.salary = salary;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
