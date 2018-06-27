import javax.swing.*;
import java.util.Scanner;

public class inputit {
    /*scanner is a class that enables you to receive
     input from user*/
    public static void main(String[]args){
        Scanner j=new Scanner(System.in);
        System.out.println("Enter Name");
        String name=j.next();
        System.out.println("Enter age");
        int age=j.nextInt();
        System.out.println("Enter ADMISSION NUMBER");
        int adm=j.nextInt();
        System.out.println("Name is \n"+name
                        +"\n"+"Age is \n"+age+
        "\n"+"Adm number is \n"+adm);
        //to help generate a dialogue box
       JOptionPane.showMessageDialog(null,
                "Name is"+name
                        +"Age is"+age+
                        "Adm number is"+adm);
if (age<18){
    System.out.println("Cannot get ID");
}
else{
    System.out.println("Permission granted");
}
    }
}
