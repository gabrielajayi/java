package com.ajcode9;

import java.util.Scanner;
//Logical operators which are used to connect two or more expressions
/*
&& - "And" which means both of the conditions must be true
|| - "OR" which means either condition must be true
! - "NOT" reverses boolean value of a condition
 */

public class Main {
    public static void main(String[] args){

        // example of && which states that both conditions must be true

        /*
        int temp = 25;

        if (temp>30){
            System.out.println("It is hot outside");
        }
        else if (temp>=20 && temp<=30){
            System.out.println("It is warm outside");
        } else {
            System.out.println("It is cold outside");
        }

         */

        // || example

        /*
        Scanner scanner = new Scanner(System.in);

        System.out.println("You are playing a game! click on q or Q to exit");
        String response = scanner.next();

        if(response.equals("q") || response.equals("Q")){
            System.out.println("You have successfully exited the game");
        } else {
            System.out.println("You are still playing the game!");
        } */

        // ! logical operator example
        Scanner scanner = new Scanner(System.in);

        System.out.println("You are playing a game! click on q or Q to quit");
        String response = scanner.next();

        if (!response.equals("q") && !response.equals("Q")){
            System.out.println("You are still playing the game!");
        }
        else {
            System.out.println("You just exited the game");
        }
    }

}
