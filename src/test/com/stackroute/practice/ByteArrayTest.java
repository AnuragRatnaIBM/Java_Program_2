package com.stackroute.practice;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class ByteArrayTest {

    ByteArray ba;

    @Before
    public void setUp() throws Exception {
        ba = new ByteArray();
    }

    @After
    public void tearDown() throws Exception {
        ba = null;
    }

    @Test
    public void byteArrayfile1() throws IOException {

        byte[] arr = {'a','p','p','l','e'};

        assertArrayEquals(arr,ba.byteArray("TestFolder","ax"));
        assertNotNull(ba.byteArray("testfolder","ax"));
        assertEquals(arr[0],ba.byteArray("testfolder","ax")[0]);

    }

    @Test
    public void byteArrayfile2() throws IOException {

        byte[] arr = {'b','a','n','a','n','a'};

        assertArrayEquals(arr,ba.byteArray("testfolder","bx"));
        assertNotNull(ba.byteArray("testfolder","bx"));
        assertEquals(arr[0],ba.byteArray("testfolder","bx")[0]);

    }

    @Test
    public void byteArrayfile3() throws IOException {

        byte[] arr = {'c','a','t'};

        assertArrayEquals(arr,ba.byteArray("testfolder","cx"));
        assertNotNull(ba.byteArray("testfolder","cx"));
        assertEquals(arr[0],ba.byteArray("testfolder","cx")[0]);

    }

    @Test
    public void byteArrayfile4() throws IOException {

        byte[] arr = {'d','o','g'};

        assertArrayEquals(arr,ba.byteArray("testfolder","dx"));
        assertNotNull(ba.byteArray("testfolder","dx"));
        assertEquals(arr[0],ba.byteArray("testfolder","dx")[0]);

    }

}