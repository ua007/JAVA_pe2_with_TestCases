package com.stackroute.pe2;

import static org.junit.Assert.*;
import org.junit.Test;

public class PalindromeTest {
    @Test
    public void givenStringIsPalindromeShouldReturnMessage()
    {
        Palindrome p1=new Palindrome();
        String result;
        result=p1.palindromeChecker("1221");
        assertEquals("True",result);
    }
    @Test
    public void givenStringIsNotPalindromeShouldReturnMessage()
    {
        Palindrome p1=new Palindrome();
        String result;
        result=p1.palindromeChecker("abcb");
        assertEquals("False",result);
    }
    @Test
    public void givenStringIsSpacePalindromeShouldReturnMessage()
    {
        Palindrome p1=new Palindrome();
        String result;
        result=p1.palindromeChecker(" ");
        assertEquals("False",result);
    }

}