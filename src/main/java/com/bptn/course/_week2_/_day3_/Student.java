package com.bptn.course._week2_._day3_;

public class Student extends Person {
    private int id;
    public Student(String name, int id) {
       super(name);
       this.id = id;
    }
    public String toString() {
       return super.toString() + " " + id;
    }
}
