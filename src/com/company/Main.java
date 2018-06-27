package com.company;

import javax.swing.*;

public class Main {
    //java is an object oriented programming language
    //it is class based and object oriented
    //classes are used to define objects in Java
    /*code written in Java can be run on
    any platform that supports it eg games
    */
    //public means this class is accessible from anywhere
    /*static means that when the program is executed,it will
    * automatically create a memory space for it*/
    /*void is a return type*/
    /*main is the function name*/
    public static void main(String[] args) {
	// write your code here
        System.out.println("My name is Allela");
        int y,x,z;
        x=13;
        y=23;
        z=x*y;
        System.out.println(z);
        //concatenation in Java uses plus sign
        JOptionPane.showMessageDialog(null
                ,"The result of z is "+z);
        if (z<49){
            System.out.println("False answer");
        }else {
            JOptionPane.showMessageDialog(null,
                    "Correct");

        }
    }
}
