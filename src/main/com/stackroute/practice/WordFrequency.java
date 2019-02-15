//9. Write a program to calculate the frequency of the words in a given file,
//
//        Example: Create a file named FileDemo.txt with the following content
//        i am a man ,
//        i like to sleep ,
//        i have a home.
//
//        Output: i->3 times,
//        am-1,
//        like -1,
//        have -1,
//        a-2 etc.,


package com.stackroute.practice;

import java.io.BufferedReader;
import java.io.FileReader;

public class WordFrequency  {
    public int frequencyOfWords(String fileString) throws Exception
    {
        BufferedReader bufferedReader;
        bufferedReader = new BufferedReader(new FileReader("/home/anurag/Desktop/P2/src/test/com/stackroute/practice/FileDemo.txt"));
        StringBuilder getstring = new StringBuilder();
        String st;

        while ((st = bufferedReader.readLine()) != null) {
            getstring.append(st);
        }

        return getstring.toString().split(" ").length;


    }
}
