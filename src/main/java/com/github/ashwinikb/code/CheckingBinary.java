package com.github.ashwinikb.code;

public class CheckingBinary {

    public static boolean binary(int num){
        int number;
        while(num != 0){
            number = num %10;
            if(number > 1){
                return false;
            }else {
                num = num / 10;
            }
        }
        return true;
    }
}
