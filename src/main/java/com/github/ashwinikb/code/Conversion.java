package com.github.ashwinikb.code;

public class Conversion {

    // Decimal to Binary
    public static String binary(int number){
        String binary = "";
        while(number > 0){
            binary = number % 2 + binary;
            number = number / 2;
        }
        return binary;
    }

    // Decimal to HexaDecimal
    public static String hexaDecimal(int number){
        String hexa = "";
        char hexaDecimals[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        while(number > 0){
            hexa = hexaDecimals[number % 16]+ hexa;
            number = number / 16;
        }
        return hexa;
    }

    // Decimal to Octal
    public static String octal(int number){
        String oct = "";
        while(number > 0){
            oct = hexaDecimal(number % 8)+ oct;
            number = number / 8;
        }
        return oct;
    }
}
