//check if the inputed number is power of four or not

package com.stackroute.pe2;

public class PowerOfFour {
    public static String powerOfFourChecker(int number)
    {
        if(number == 0)
            return "False";
        while(number != 1)
        {
            if(number % 4 != 0)
                return "False";
            number = number / 4;
        }
        return "True";
    }
}
