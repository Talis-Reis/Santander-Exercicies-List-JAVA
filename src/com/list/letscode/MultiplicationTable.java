package com.list.letscode;

import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args){

        System.out.println("***************************************");
        System.out.println("******  multiplication table    *******");
        System.out.println("***************************************");

        System.out.println("Enter the value to run the multiplication table: ");
        Scanner entryValue = new Scanner(System.in);

        float value = entryValue.nextFloat();

        System.out.println("Value: " + value);

        for (int i = 0; i <= 10; i++) {
            System.out.println(value + " * " + i + " = " + (value * i));
        }

    }
}
