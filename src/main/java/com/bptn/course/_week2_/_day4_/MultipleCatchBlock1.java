package com.bptn.course._week2_._day4_;

public class MultipleCatchBlock1 {  
	  
    public static void main(String[] args) {  
        try {    
            int a[]=new int[5];    
            a[5]=30/a[6];    
        } catch(ArithmeticException e) {  
            System.out.println("An Arithmetic Exception occurred.");  
        } catch(ArrayIndexOutOfBoundsException e) {  
            System.out.println("An ArrayIndexOutOfBounds Exception occurs");  
        } catch(Exception e) {  
            System.out.println("An Exception somewhere in the parent object occurs");  
        }             
        System.out.println("The rest of our code can continue as usual");
    }  
}  
