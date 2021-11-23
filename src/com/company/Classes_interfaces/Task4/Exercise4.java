package com.company.Classes_interfaces.Task4;

public class Exercise4 {
    //разбор решения - сам не разобрался...
    public static void main(String[] args) {
        User user1 = new User();
        // what is the logic here:
        // Validator is an interface - it has 1 method
        // We call it anonymously and have to declare class and specify
        // its method when initiating method from the User class

        user1.setName("Mike", new Validator<String>() {
            @Override
            public boolean validate(String input) {
                return !input.isEmpty()&&Character.isUpperCase(input.charAt(0));
            }
        });
//        System.out.println(user1.getName());

        user1.setLastName("Che", new Validator<String>() {
            @Override
            public boolean validate(String input) {
                return !input.isEmpty()&&Character.isUpperCase(input.charAt(0));
            }
        });
        user1.setLogin("myPersonalLogin", new Validator<String>() {
            @Override
            public boolean validate(String input) {
                return input.length()>=10;
            }

        });

        user1.setPassword("!myPersonalPassword", new Validator<String>() {
            @Override
            public boolean validate(String input) {
                return input.contains("!");
            }
        });


        user1.setAge(33, new Validator<Integer>() {
            @Override
            public boolean validate(Integer input) {
                return (input>0)&&(input<150);
            }
        });
        System.out.println(user1);
    }
}

interface Validator<T>{
    //so, we declare interface, with input of some type - undefined and at the moment it is 'T'
    boolean validate(T input);
}
class User{
    private String name;
    private String lastName;
    private String login;
    private String password;
    private int age;

    public User() {
    }

    public void setName(String name, Validator<String> validator){
        // here we check if the name is validated, then we assign value to class parameter
        if (validator.validate(name)){
            this.name=name;
        }
    }

    public void setLastName(String lastName,Validator<String> validator){
        // here we check if the name is validated, then we assign value to class parameter
        if (validator.validate(lastName)){
            this.lastName=lastName;
        }
    }

    public void setPassword(String password,Validator<String> validator){
        // here we check if the name is validated, then we assign value to class parameter
        if (validator.validate(password)){
            this.password=password;
        }
    }
    public void setLogin(String login,Validator<String> validator){
        // here we check if the name is validated, then we assign value to class parameter
        if (validator.validate(login)){
            this.login=login;
        }
    }
    public void setAge(int age,Validator<Integer> validator){
        // here we check if the name is validated, then we assign value to class parameter
        if (validator.validate(age)){
            this.age=age;
        }
    }


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public int getAge() {
        return age;
    }
}