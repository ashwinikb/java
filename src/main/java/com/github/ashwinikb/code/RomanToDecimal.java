package com.github.ashwinikb.code;

public class RomanToDecimal {

    public static String roman(int number){
        String[] romanSymbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] decimals = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String roman = "";
        if (number >= 1 && number <= 3999)
        {
            for (int i = 0; i < 13; i++)
            {
                while(number >= decimals[i])
                {
                    number = number - decimals[i];

                    roman = roman + romanSymbols[i];
                }
            }
            return roman;
        }
        else
        {
            return "Invalid Number";
        }
    }
}
