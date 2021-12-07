package com.list.letscode;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class DollarConverter {

    public static void main(String[] args){
        Scanner entryValues = new Scanner(System.in);

        System.out.println("Enter the dollar quote for TODAY: ");
        float dollarExchangeRate = entryValues.nextFloat();

        System.out.println("Enter the amount in reais to be converted to dollars: ");
        float valueReais = entryValues.nextFloat();

        float valueConverted = valueReais / dollarExchangeRate;

        NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("en", "US"));
        String moneyString = formatter.format(valueConverted);

        System.out.println("Value Converted: " + moneyString);
    }
}
