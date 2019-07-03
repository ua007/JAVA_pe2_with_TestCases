package com.stackroute.pe2;
import org.junit.After;
import org.junit.Before;
import static org.junit.Assert.*;
import org.junit.Test;

public class EvenOddTest {
    
    EvenOdd number;

    @Before
    public void setUp() throws Exception
    {
        number=new EvenOdd();
    }

    @After
    public void tearDown() throws Exception {
        number=null;
    }
    //test case for even no.
    @Test
    public void givenIntegerIsEvenReturnBoolean(){
       
        Boolean result;
        result=number.isEven(4);
        assertEquals(true,result);
    }
    //test case for not an even no.
    @Test
    public void givenIntegerIsNotEvenReturnBoolean(){
        
        Boolean result;
        result=number.isEven(5);
        assertEquals(false,result);
    }

}
