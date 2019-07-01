package com.stackroute.pe2;

import static org.junit.Assert.*;
import org.junit.Test;

public class PowerOfFourTest {
    @Test
    public void givenIntegerIsPowerOfFourShouldReturnMessage()
    {
        PowerOfFour number=new PowerOfFour();
        String result;
        result=number.powerOfFourChecker(16);
        assertEquals("True",result);
    }
    @Test
    public void givenIntegerIsNotPowerOfFourShouldReturnMessage()
    {
        PowerOfFour number=new PowerOfFour();
        String result;
        result=number.powerOfFourChecker(18);
        assertEquals("False",result);
    }

}