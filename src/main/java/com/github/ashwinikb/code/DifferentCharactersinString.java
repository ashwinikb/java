package com.github.ashwinikb.code;

import java.text.DecimalFormat;

public class DifferentCharactersinString {

    public static void percentage(String s){
        int totalChars = s.length();
        int upperCaseLetters = 0;
        int lowerCaseLetters = 0;
        int digits = 0;
        int others = 0;

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(Character.isUpperCase(ch)){
                upperCaseLetters++;
            }else if(Character.isLowerCase(ch)){
               lowerCaseLetters++;
            }else if(Character.isDigit(ch)){
                digits++;
            }else{
                others++;
            }
        }
        double upperCaseLetterPercentage = (upperCaseLetters * 100.0) / totalChars ;
        double lowerCaseLetterPercentage = (lowerCaseLetters * 100.0) / totalChars;
        double digitsPercentage = (digits * 100.0) / totalChars;
        double otherCharPercentage = (others * 100.0) / totalChars;
        DecimalFormat numberFormat = new DecimalFormat("#.00");
        System.out.println("percentage of upperCaseLetterPercentage :" + numberFormat.format(upperCaseLetterPercentage));
        System.out.println("percentage of lowerCaseLetterPercentage :" + numberFormat.format(lowerCaseLetterPercentage));
        System.out.println("percentage of digitsPercentage :" + numberFormat.format(digitsPercentage));
        System.out.println("percentage of otherCharPercentage :" + numberFormat.format(otherCharPercentage));


    }
}
