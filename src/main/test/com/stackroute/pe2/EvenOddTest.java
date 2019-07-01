package com.stackroute.pe2;

import static org.junit.Assert.*;
import org.junit.Test;

public class EvenOddTest {
    @Test
    public void givenIntegerIsEvenReturnBoolean(){
        EvenOdd number=new EvenOdd();
        Boolean result;
        result=number.isEven(4);
        assertEquals(true,result);
    }
    @Test
    public void givenIntegerIsNotEvenReturnBoolean(){
        EvenOdd number=new EvenOdd();
        Boolean result;
        result=number.isEven(5);
        assertEquals(false,result);
    }

}