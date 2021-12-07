package com.list.letscode;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args){
        Scanner inputValue = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        float firstNumber = inputValue.nextFloat();
        System.out.println("Enter the second number: ");
        float secondNumber = inputValue.nextFloat();

        System.out.println("SUM: " + (firstNumber + secondNumber));
        System.out.println("SUBTRACTION: " + (firstNumber - secondNumber));
        System.out.println("DIVISION: " + (firstNumber / secondNumber));
        System.out.println("MULTIPLICATION: " + (firstNumber * secondNumber));
    }
}
