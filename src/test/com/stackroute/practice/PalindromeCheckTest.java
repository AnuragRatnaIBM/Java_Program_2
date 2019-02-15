package com.stackroute.practice;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeCheckTest {

    private static PalindromeCheck palindromeCheck;
    @Before
    public void setUp() throws Exception {
        palindromeCheck=new PalindromeCheck();
    }

    @After
    public void tearDown() throws Exception {
        palindromeCheck=null;
    }

    @Test
    public void palindrome() {
        boolean expected=true;
        boolean actual=palindromeCheck.palindrome("123454321");
        assertEquals(expected,actual);
    }
    @Test
    public void palindromeFail() {
        boolean expected=false;
        boolean actual=palindromeCheck.palindrome("london");
        assertEquals(expected,actual);
    }
    @Test
    public void palindromeFailure() {
        assertNotNull(palindromeCheck.palindrome("sdsf"));
    }
}