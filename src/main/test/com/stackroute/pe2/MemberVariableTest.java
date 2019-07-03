package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MemberVariableTest {

    //creating the reference of the object
    MemberVariable ob = null;

    @Before
    public void setUp() throws Exception {

        ob = new MemberVariable();

    }

    //assigning null to object
    @After
    public void tearDown() throws Exception {

        ob = null;

    }

    //test cases

    @Test
    public void displayDetails() {

        ob.initializeData("Harry Potter", 30, 2500.3);
        String res = ob.displayData();
        assertEquals("Members Name: Harry Potter Members age: 30 Members salary: 2500.3", res);

    }

    @Test
    public void displayDetailsAgain() {

        ob.initializeData("Utkarsh Anand", 22, 27000.7674);
        String res = ob.displayData();
        assertEquals("Members Name: Utkarsh Anand Members age: 22 Members salary: 27000.7674", res);

    }

}