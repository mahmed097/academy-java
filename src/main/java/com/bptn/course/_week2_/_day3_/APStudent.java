package com.bptn.course._week2_._day3_;

//Complete building up this class
public class APStudent extends Student {

private int apScore;

public APStudent(String name, int id, int apScore){
 super(name,id);
 this.apScore = apScore;
}

@Override
public String toString() {
     return super.toString() + " " + apScore;
  }

}