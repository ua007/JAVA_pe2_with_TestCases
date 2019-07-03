package com.stackroute.pe2;
import org.junit.After;
import org.junit.Before;
import static org.junit.Assert.*;
import org.junit.Test;

public class PowerOfFourTest {
    
    PowerOfFour number;

    @Before
    public void setUp() throws Exception
    {
        number=new PowerOfFour();
    }

    @After
    public void tearDown() throws Exception {
        number=null;
    }
        
    //success test case
    @Test
    public void givenIntegerIsPowerOfFourShouldReturnMessage()
    {
        String result;
        result=number.powerOfFourChecker(16);
        assertEquals("True",result);
    }
    //failure test case
    @Test
    public void givenIntegerIsNotPowerOfFourShouldReturnMessage()
    {
        
        String result;
        result=number.powerOfFourChecker(18);
        assertEquals("False",result);
    }
    @Test
    public void givenIntegerIsNotPowerOfFourShouldReturnMessage()
    {
        String result;
        result=number.powerOfFourChecker(-18);
        assertEquals("False",result);
    }

}
