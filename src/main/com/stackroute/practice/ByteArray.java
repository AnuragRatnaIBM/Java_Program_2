package com.stackroute.practice;
import java.io.*;

public class ByteArray {

    public byte[] byteArray ( String folderName, String extensionName ) throws IOException {



        File[] files = new File("/home/anurag/Desktop/P2/src/test/com/stackroute/practice/TestFolder/").listFiles();
        File working=null;
        for (File file: files) {
            if(file.getName().contains(extensionName)){
                working=file;
            }
        }



        BufferedReader br = new BufferedReader(new FileReader(working));

        StringBuilder res=new StringBuilder("");
        String st;
        while ((st = br.readLine()) != null) {
            res.append(st);
        }
        return res.toString().getBytes();
    }


}