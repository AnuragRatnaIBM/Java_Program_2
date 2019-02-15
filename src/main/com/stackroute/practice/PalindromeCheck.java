//1. Write a Java method to Reverse the given input & Check if it is a Palindrome.
//
package com.stackroute.practice;


public class PalindromeCheck {
    public Boolean palindrome(String inputString) {
        int n=inputString.length();
        for(int i=0;i<n/2;i++)
        {
            if(inputString.charAt(i)!=inputString.charAt(n-1-i))
            {
                return false;
            }
        }

        return true;
    }
}
