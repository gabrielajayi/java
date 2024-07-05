package com.ajcode7;

// if statement = performs a block of code if its condition evaluates to be true

public class Main {
    public static void main(String[] args){
        int age = 74;
    if (age>=75) {
        System.out.println("You are truly old and well experienced");
    }
       else if (age >=18) {
        System.out.println("You're are an adult");
    }  else if (age>=13){
        System.out.println("You're a teenager");
    }
            else {
            System.out.println("You are not an adult");
        }
    }
}
