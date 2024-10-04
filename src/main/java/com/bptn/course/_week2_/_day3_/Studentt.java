package com.bptn.course._week2_._day3_;

public class Studentt {
    // Declare the variables (instance and static)
    private String name;
    private int grade;
    private static String principalName = "Ms. McKoy";
    private String studentID;
    private static int nextID = 100;

    // Create Constructor 
    public Studentt(String name, int grade){
        this.name = name;
        this.grade = grade;
        studentID = Character.toUpperCase((name.charAt(0))) + "" + nextID; // Got the first character of name and made it uppercase by using Character.toUpperCase
        nextID++; //increment nextID by 1

    }
    // Create static method newPrincipal
    public static void newPrincipal(String name){
        principalName = name; //change the principals name 
    }
    // Create static method resetID 
    public static void resetID(){
        nextID = 100; //reset the ID to 100
    }
    // Create toString() method 
    @Override
    public String toString(){
        return (name + " " + studentID ); //@Override the toString method to return the name and student ID
    }
    
    // Do not modify the code below:
    public static void main(String[] args) {
        Studentt s1 = new Studentt("Muhammed", 11);
        Studentt s2 = new Studentt("Alan", 11);
        Studentt s3 = new Studentt("Sophie", 11);

        System.out.println("Principal Name for student 1: " + Studentt.principalName);
        System.out.println("Student ID for student 1: " + s1.studentID);
        System.out.println("Student ID for student 2: " + s2.studentID);
        System.out.println("Student ID for student 3: " + s3.studentID);

        Studentt.newPrincipal("Mr. McKoy");
        System.out.println("New principal name: " + Studentt.principalName);

        Studentt.resetID();
        Studentt s4 = new Studentt("kevin", 11);
        System.out.println("Student ID for student 4: " + s4.studentID);
        System.out.println("String representation of student 4: " + s4.toString());
    }
}

/*

For me a new task when working on this problem was the use of Character.toUpperCase() to get the uppercase
of a Char. One issue I had when creating this problem was on line 13 where I would get the error 
"int cannot be converted to string". This is because adding a char and int together 
actually adds their unicode values and returns an integer. One way I solved this problem was by 
adding an empty string "". One take away that I will have from this lesson is how to use Character.toUpperCase()
and how to solve for the error "int cannot be converted to string".

*/
