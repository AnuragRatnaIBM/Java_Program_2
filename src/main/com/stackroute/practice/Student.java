package com.stackroute.practice;

public class Student {
    public String gradeOfStudents(int numberOfStudent, int [] grades){
        int min=grades[0];
        int max=grades[0];
        int sum=0;
        double avg=0;
        System.out.println(numberOfStudent);
        if(grades.length!=0 && numberOfStudent!=0) {
            for(int i=0;i<grades.length;i++)
            {
                if(min>grades[i])
                {
                    min=grades[i];
                }
            }
            for(int i=0;i<grades.length;i++)
            {
                if(max<grades[i])
                {
                    max=grades[i];
                }
            }
            for(int i=0;i<grades.length;i++)
            {
                sum=sum+grades[i];
            }
            System.out.println("nssns");

            avg = sum / (numberOfStudent * 1.0);

            return String.format("The average is %.2f", avg) + "\n" +
                    "The minimum is " + min + "\n" +
                    "The maximum is " + max;
        }
        else {
            return null;
        }

    }
}
