package com.list.letscode;

import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args){

        System.out.println("******************************************");
        System.out.println("******** TEMPERATURE CONVERTER ********");
        System.out.println("******************************************");

        System.out.println("Enter the temperature to perform the conversion:");
        Scanner entryValue = new Scanner(System.in);
        float valueForConversion = entryValue.nextFloat();

        System.out.printf("Temperature %.0fºC. Value converted: %.0f F.", valueForConversion,(valueForConversion * 1.8f)+32);

    }

}
