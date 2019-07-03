package com.stackroute.pe2;
import org.junit.After;
import org.junit.Before;
import static org.junit.Assert.*;
import org.junit.Test;

public class PalindromeTest {
    
    Palindrome p1;

    @Before
    public void setUp() throws Exception
    {
        p1=new Palindrome();
    }

    @After
    public void tearDown() throws Exception {
        p1=null;
    }
    //success test case
    @Test
    public void givenStringIsPalindromeShouldReturnMessage()
    {
        
        String result;
        result=p1.palindromeChecker("1221");
        assertEquals("True",result);
    }
    //failure test case
    @Test
    public void givenStringIsNotPalindromeShouldReturnMessage()
    {
        
        String result;
        result=p1.palindromeChecker("abcb");
        assertEquals("False",result);
    }
    //no input test case
    @Test
    public void givenStringIsSpacePalindromeShouldReturnMessage()
    {
       
        String result;
        result=p1.palindromeChecker(" ");
        assertEquals("False",result);
    }

}
