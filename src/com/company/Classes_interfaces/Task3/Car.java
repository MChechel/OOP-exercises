package com.company.Classes_interfaces.Task3;

public class Car {
    private String type;
    private String make;

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", make='" + make + '\'' +
                '}';
    }

    public Car() {
    }

    public Car(String type, String make) {
        this.type = type;
        this.make = make;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }
    class Engine{
        private String engineType;
        @Override
        public String toString() {
            return "Engine{" +
                    "engineType='" + engineType + '\'' +
                    '}';
        }
        Engine(String type){
            if(type.equals("economy"))
            {
                this.engineType="diesel";
            }else if (type.equals("electric")){
                this.engineType="electric";
            }else{
                this.engineType = "petro;";
            }
        }

        public void setEngineType(String type) {

            if(type.equals("economy"))
            {
                this.engineType="diesel";
            }else if (type.equals("electric")){
                this.engineType="electric";
            }else{
                this.engineType = "petro;";
            }
        }
    }
}

