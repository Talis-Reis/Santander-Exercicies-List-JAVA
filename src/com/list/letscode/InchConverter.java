package com.list.letscode;

import java.util.Scanner;

public class InchConverter {

    public static void main(String[] args){

        Scanner entryValues = new Scanner(System.in);

        final float VALUE_CENTIMETERS = 2.54f;

        System.out.println("Enter the inch value to be converted: ");
        float inchValue = entryValues.nextFloat();

        System.out.printf("Inches %.2f Value converted to centimeters %.2f",inchValue, (inchValue * VALUE_CENTIMETERS));
    }

}
