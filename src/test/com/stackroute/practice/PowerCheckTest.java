package com.stackroute.practice;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PowerCheckTest {
    PowerCheck powerCheck;
    @Before
    public void setUp() throws Exception {
        powerCheck=new PowerCheck();

    }

    @After
    public void tearDown() throws Exception {
        powerCheck=null;
    }

    @Test
    public void isPowerOfFour() {
        boolean expected=true;
        boolean actual=powerCheck.isPowerOfFour(64);
        assertEquals(expected,actual);
    }

    @Test
    public void isPowerOfFourFail() {
        boolean expected=false;
        boolean actual=powerCheck.isPowerOfFour(63);
        assertEquals(expected,actual);
    }

    @Test
    public void isPowerOfFourFailure() {

        assertNotNull(powerCheck.isPowerOfFour(63));
    }

}