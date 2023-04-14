package org.example.calc;

import java.util.Scanner;

import static java.lang.System.*;

public class BasicCalculator {
    public static void main(String[] args) {

        out.print("Enter your name: ");
        Scanner consoleInput = new Scanner(System.in);
        String name = consoleInput.next();
        out.println("Hello " + name + "! Let's do some math!");


        //Read two input floats from the console

        out.print("Enter a number: ");
        float num1 = consoleInput.nextFloat();
        out.println("Number 1: " + num1);

        out.print("Enter another number ");
        float num2 = consoleInput.nextFloat();
        out.println("Number 2: " + num2);

        boolean badInput = false;
        do {
            out.println("Would you like to add, subtract, or divide these numbers?");
            String input = consoleInput.next();


            //take the users choice of add, subtract, or divide and print solution.

            if (input.equalsIgnoreCase("add")) {
                doAdd(num1, num2);
                break;

            } else if (input.equalsIgnoreCase("subtract")) {
                doSubtract(num1, num2);
                break;

            } else if (input.equalsIgnoreCase("divide")) {
                doDivide(num1, num2);
                break;

            } else if (input.equalsIgnoreCase("multiply")) {
                doMultiply(num1, num2);
                break;

            } else {
                out.println("I did not understand that... Please try again!");
                badInput = true;

            }
        } while (badInput);
    }
    static void doAdd(float num1, float num2) {
        float result = num1 + num2;
        out.println("The solution is: " + result);
    }

    static void doSubtract(float num1, float num2) {
        float result = num1 - num2;
        out.println("The solution is: " + result);
    }

    static void doDivide(float num1, float num2) {
        float result = num1 / num2;
        out.println("The solution is: " + result);
    }
    static void doMultiply(float num1, float num2) {
        float result = num1 * num2;
        out.println("The solution is: " + result);
    }
}
