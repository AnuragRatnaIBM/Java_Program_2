package com.stackroute.practice;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenNumTestTest {

    private EvenNumTest evenNumTest;
    @Before
    public void setUp() throws Exception {
        evenNumTest=new EvenNumTest();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void isEvenSuccess() {
        boolean expected=true;
        boolean actual=evenNumTest.isEven(10);
        assertEquals(expected,actual);
    }

    @Test
    public void isEvenFailure() {
        boolean expected=false;
        boolean actual=evenNumTest.isEven(11);
        assertEquals(expected,actual);
    }
}