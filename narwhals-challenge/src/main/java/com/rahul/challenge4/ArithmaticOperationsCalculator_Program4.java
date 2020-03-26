package com.rahul.challenge4;

import java.util.*;
public class ArithmaticOperationsCalculator_Program4 {

    public static void main(String[] args) {

        double result = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Your First Number Below:");

        double number1 = scanner.nextDouble();

        System.out.println("Enter Your Second Number Below");

        double number2 = scanner.nextDouble();

        System.out.println("Enter A for addition");
        System.out.println("Enter S for subtraction");
        System.out.println("Enter M for multiplication");
        System.out.println("Enter D for division");


        String arithmeticChooser = scanner.next();

        System.out.println("Your Result is:");

        if (arithmeticChooser.equals("A") ||arithmeticChooser.equals("a")){
            result=number1+number2;

        }else if (arithmeticChooser.equalsIgnoreCase("S")){
             result=number1-number2;
        }else if(arithmeticChooser.equalsIgnoreCase("M")){
             result=number1*number2;
        }else if (arithmeticChooser.equalsIgnoreCase("D")){
            result=number1/number2;
        }
        System.out.println(result);

    }
}
