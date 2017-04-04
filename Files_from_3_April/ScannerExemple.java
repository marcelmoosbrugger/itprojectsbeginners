package com.company;

/**
 * Created by alex on 04/04/17.
 */

import java.util.Scanner; // <-- Don't forget this

public class ScannerExemple {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        System.out.println("Write your name: ");
        String i = sc.next();
        System.out.println("Your name is " + i);


        System.out.println("Write a number: ");
        int num = sc.nextInt();
        System.out.println("Your number is " + num);


        System.out.println("Write a decimal number: "); // you have to use '.' not ','
        double num2 = sc.nextDouble();
        System.out.println("Your number is " + num2);

        sc.close();
    }
}

