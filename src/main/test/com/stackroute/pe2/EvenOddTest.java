package com.stackroute.pe2;

import static org.junit.Assert.*;
import org.junit.Test;

public class EvenOddTest {
    //test case for even no.
    @Test
    public void givenIntegerIsEvenReturnBoolean(){
        EvenOdd number=new EvenOdd();
        Boolean result;
        result=number.isEven(4);
        assertEquals(true,result);
    }
    //test case for not an even no.
    @Test
    public void givenIntegerIsNotEvenReturnBoolean(){
        EvenOdd number=new EvenOdd();
        Boolean result;
        result=number.isEven(5);
        assertEquals(false,result);
    }

}