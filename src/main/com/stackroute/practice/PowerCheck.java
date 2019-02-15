package com.stackroute.practice;

public class PowerCheck {
    public Boolean isPowerOfFour(int inputNumber){
        if(inputNumber==0||inputNumber==1)
            return false;
        else
        {
            while (inputNumber!=1)
            {
                if(inputNumber%4!=0)
                {
                    return false;
                }
                inputNumber=inputNumber/4;
            }
        }
        return true;
    }
}
