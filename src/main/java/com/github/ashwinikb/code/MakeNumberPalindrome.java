package com.github.ashwinikb.code;

public class MakeNumberPalindrome {

    public static int reverse(int number){
        int reverse = 0;
        while(number != 0){
            reverse = reverse*10 + number % 10;
            number = number / 10;
        }
        return reverse;
    }

    public static boolean palindrome(int number){
        int num = reverse(number);
        if(num == number)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static boolean reverseAndAdd(int number) {
            while (!palindrome(number)) {
                int reverse = reverse(number);
                int sum = number + reverse;
                System.out.println(number+" + "+reverse+" = "+sum);
                number = sum;
            }
        return true;
    }
}
