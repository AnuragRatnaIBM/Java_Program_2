package com.stackroute.practice;

public class Member {
    private String name;
    private int age;
    private double salary;

    public Member(String name, int age, double salary) {
        // complete this section
        this.name=name;
        this.age=age;
        this.salary=salary;

    }

    public String details(){
        return String.format("Members Name: "+this.name+"\n" +
                "Members Age: "+this.age+"\n" +
                "Members Salary: %.1f",this.salary);
    }
}
