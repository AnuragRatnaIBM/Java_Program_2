package com.stackroute.practice;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {
    private Student student;
    @Before
    public void setUp() throws Exception {
        student=new Student();
    }

    @After
    public void tearDown() throws Exception {
        student=null;
    }

    @Test
    public void gradeOfStudents() {
        String expected="The average is 81.50\n" +
                "The minimum is 65\n" +
                "The maximum is 98";
        int [] array={86,65,98,77};
        String actual=student.gradeOfStudents(4,array);
        assertEquals(expected,actual);
    }
    @Test
    public void gradeOfStudentsFailure() {
        int []array={};
        assertNull(student.gradeOfStudents(0,array));
    }

}