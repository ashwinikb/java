package com.github.ashwinikb.code;

import java.util.HashSet;
import java.util.Set;

public class StringRotation {

    public static boolean rotation(String s1, String s2){

        Set<String> stringSet = new HashSet<String>();
        String[] str1 = s1.split(" ");
        String[] str2 = s2.split(" ");
        if(str1.length == str2.length){
            for(int i = 0; i < str1.length; i++){
                String word = str2[i];
                if(stringSet.contains(word)){
                    return true;
                }else{
                    return false;
                }
            }

        }

        return false;
    }
}
