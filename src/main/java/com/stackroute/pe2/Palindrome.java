//method to Reverse the given input & Check if it is a Palindrome.

package com.stackroute.pe2;

public class Palindrome {
    public static String palindromeChecker(String inputString)
    {
        String inputStringReverse="";
        for(int i=inputString.length()-1;i>=0;i--)
        {
            inputStringReverse+=inputString.charAt(i);
        }
        if(inputString.equals(inputStringReverse))
            return "True";
        else
            return "False";
    }
}
