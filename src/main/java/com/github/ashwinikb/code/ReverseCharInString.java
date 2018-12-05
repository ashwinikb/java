package com.github.ashwinikb.code;

public class ReverseCharInString {

    public static String reverse(String s){

        String[] str = s.split(" ");
        String rev = null;
        for(int i = 0; i < str.length; i++){
            String word = str[i];
            String reverse = "";
            for(int j = word.length()-1; j >= 0; j--){
                reverse = reverse + word.charAt(j);
            }
            if(rev != null) {
                rev = rev + " " + reverse;
            }else{
                rev = reverse;
            }
        }
        return rev;
    }
}
