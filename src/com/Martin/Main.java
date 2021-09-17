package com.Martin;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter name");
        String userName = s.next();

        System.out.println("Enter pin");
        int pin = s.nextInt();

        int loopCount = 5;
        int inc = 1;
        boolean isValid;


        if (pin > 99) {
            isValid = true;
        } else {
            isValid = false;
        }

        while (isValid = true && inc <= 5) {
            System.out.println("Your pin is still valid");
            inc = inc + 1;
        }




    }





}
