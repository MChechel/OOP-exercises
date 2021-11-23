package com.company.Classes_interfaces;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidator {
    public static void main(String[] args) {

    Email myAddress = new Email("m255@gmail.com");

        validateEmails(myAddress);
    }


    public static void validateEmails(Email adr){
        if (adr.getAddress().equals("")|| adr.getAddress() == null){
            adr.setAddress("unknown");
        }else{
        Pattern pattern = Pattern.compile("^.+@?+.+\\..+$");
        Matcher matcher = pattern.matcher(adr.getAddress());
        System.out.println("The address is "+matcher.matches());
        }
        }


}

class Email{
    private String address;

    public Email(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}