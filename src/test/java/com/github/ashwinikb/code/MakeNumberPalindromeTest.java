package com.github.ashwinikb.code;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class MakeNumberPalindromeTest {
    @Test
    public void test(){
        int number = 7325;
        boolean palindrome = MakeNumberPalindrome.palindrome(number);
        if(palindrome){
            assertTrue(palindrome);
        }else{
          boolean answer = MakeNumberPalindrome.reverseAndAdd(number);
          assertTrue(answer);
        }
    }
}
