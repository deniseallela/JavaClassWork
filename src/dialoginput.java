import javax.swing.*;

public class dialoginput {
    public static void main(String[] args) {
        String math=JOptionPane.showInputDialog("Enter Math");
        String eng=JOptionPane.showInputDialog("Enter English");
        String swa=JOptionPane.showInputDialog("Enter Swahili");
        //convert the input strings to be integers
        int m=Integer.parseInt(math);
        int e=Integer.parseInt(eng);
        int s=Integer.parseInt(swa);
         int k=(m+e+s)/3;
        JOptionPane.showMessageDialog(null,
                "The grade is " +k);
        if (k<29 && k>0){
            JOptionPane.showMessageDialog(null,
                    "E");
        }
        else if(k>29 && k<40){
            JOptionPane.showMessageDialog(null,
                    "D");
        }
        else if(k>=40 && k<60){
            JOptionPane.showMessageDialog(null,
                    "C");
        }
        else if (k>=60 && k <75){
            JOptionPane.showMessageDialog(null,
                    "B");
        }
        else if (k>=75 && k<=100){
            JOptionPane.showMessageDialog(null,
                    "A");
        }
        else {
            JOptionPane.showMessageDialog(null,
                    "Invalid Grade");
        }
        //classes are used to define object
        //import means referring to the classes in a different package
        //an object is an instance of a class
    }
}
