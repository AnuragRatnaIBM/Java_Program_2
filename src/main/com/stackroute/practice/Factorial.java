package com.stackroute.practice;

public class Factorial {
    public int getFactorial(int number){
        int fact=1;
        for(int i=number;i>1;i--)
        {
            fact=fact*i;
        }
        return fact;
    }
}
