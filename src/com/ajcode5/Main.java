package com.ajcode5;

import java.util.Scanner;

// Finding hypotenuse of a triangle using the math class
public class Main {
    public static void main(String[] args){
        double x;
        double y;
        double z;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side x:");
        x = scanner.nextDouble();
        System.out.println("Enter side x:");
        y = scanner.nextDouble();

       z = Math.sqrt((x*x)+(y*y));

        System.out.println("The hypotenuse is: " + z);

        scanner.close();
    }
}
