package com.github.ashwinikb.code;

public class ReverseStringWithSpaces {

    public static String reverse(String s) {
        char[] ch = s.toCharArray();
        char[] c = new char[ch.length];
        int j = c.length - 1;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == ' ') {
                c[i] = ' ';
            } else {
                if (ch[i] != ' ') {
                    if (c[j] == ' ') {
                        j--;
                    }
                    c[j] = ch[i];
                    j--;
                }
            }

        }
        System.out.println(s+" -- "+String.valueOf(c));
        return String.valueOf(c);
    }
}


