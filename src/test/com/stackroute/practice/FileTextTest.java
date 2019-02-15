package com.stackroute.practice;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.*;

public class FileTextTest {

    private  FileText fileText;
    @Before
    public void setUp() throws Exception {
        fileText=new FileText();

    }

    @After
    public void tearDown() throws Exception {
        fileText=null;
    }

    @Test
    public void textToUpperCase() {
        String expected="CONVERT THE CONTENT IN UPPER CASE\n" +
                "AND PRINT THE SAME IN CONSOLE ALONG WITH THE LENGTH OF THE FILE.\n" +
                "98";
        File file=new File("src/test/com/stackroute/practice/TextDemo.txt");
        assertEquals(expected,fileText.textToUpperCase(file));
    }
}