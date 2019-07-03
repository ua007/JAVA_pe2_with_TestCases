package com.stackroute.pe2;

import static org.junit.Assert.*;
import org.junit.Test;

public class GradeComputingTest {
    //test case for grade between 1 to 100
    @Test
    public void givenGradeIntegerArrayShouldReturnMessage()
    {
        GradeComputing grd=new GradeComputing();
        String result;
        result=grd.GradeComputingFunction(new int[]{56,67,45});
        assertEquals("The average is "+grd.checkAverage(new int[]{56,67,45})+"\n"+ "The minimum is "+grd.checkMin(new int[]{56,67,45})+ "\nThe maximum is "+grd.checkMax(new int[]{56,67,45}),result);
    }

    //test case for grade not between 1 to 100
    @Test
    public void givenGradeIntegerArrayOutOfBoundShouldReturnErrorMessage()
    {
        GradeComputing grd=new GradeComputing();
        String result;
        result=grd.GradeComputingFunction(new int[]{56,167,45});
        assertEquals("Grades out of bound",result);
    }

}