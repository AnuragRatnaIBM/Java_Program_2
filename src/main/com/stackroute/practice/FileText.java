package com.stackroute.practice;

import java.io.File;
import java.io.FileInputStream;

public class FileText {
    public String textToUpperCase(File file){
        File f;
        FileInputStream fis = null;
        String out = "";
        byte[] b = null;

        try {
            f = new File("/home/anurag/Desktop/P2/src/test/com/stackroute/practice/TextDemo.txt");
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }


        try {
            fis = new FileInputStream(f);
            b = new byte[(int) f.length()];
            fis.read(b);
        } catch (Exception e) {
            System.out.println(e);
        }

        out = new String(b);
        System.out.println(out);
        System.out.println(out.length());

        return out.toUpperCase()+"\n"+out.length();


    }
}
