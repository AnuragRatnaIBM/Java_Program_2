package com.stackroute.practice;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {

    private Factorial factorial;
    @Before
    public void setUp() throws Exception {
        factorial=new Factorial();

    }

    @After
    public void tearDown() throws Exception {
        factorial=null;
    }


    @Test
    public void getFactorial() {
        int expected=120;
        int actual=factorial.getFactorial(5);
        assertEquals(expected,actual);

    }
}