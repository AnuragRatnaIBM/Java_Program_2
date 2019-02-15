package com.stackroute.practice;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import static org.junit.Assert.*;

public class WordFrequencyTest {

    private static WordFrequency wordFrequency;
    BufferedReader bufferedReader;

    @Before
    public void setUp() throws Exception {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        wordFrequency = new WordFrequency();
        bufferedReader = new BufferedReader(new FileReader("/home/anurag/Desktop/P2/src/test/com/stackroute/practice/FileDemo.txt"));
    }

    @After
    public void tearDown() throws Exception {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        wordFrequency = null;


    }

    @Test
    public void testFrequencyOfWords() throws Exception {

        StringBuilder fileString = new StringBuilder();
        String st;

        while ((st = bufferedReader.readLine()) != null) {
            fileString.append(st).append("\n");
        }
        int expexted =12;
        assertEquals(expexted, wordFrequency.frequencyOfWords(fileString.toString()));
    }

    @Test
    public void testFrequencyOfWordsFailure() throws Exception {
        StringBuilder fileString = new StringBuilder();
        String st;

        while ((st = bufferedReader.readLine()) != null) {
            fileString.append(st).append("\n");
        }
        assertNotNull(wordFrequency.frequencyOfWords(fileString.toString()));
    }
}