
package com.ajcode10;

import java.util.Scanner;

// while loop helps to execute a block of code as long as its condition remains true

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String name = "";

        while(name.isBlank()){
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        }
        System.out.println("Hello "+name);
    }
}
