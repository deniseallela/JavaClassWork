import javax.swing.*;
import java.util.jar.JarOutputStream;

public class MethodOverLLoading {
    public static void main(String[] args) {
        int a, b, result;
        double c, d, resultt;
        a = 30;
        b = 22;
        c = 22.5;
        d = 20.9;
        result = minimumfunctions(a,b);
        resultt = minimumfunctions(c,d);
        JOptionPane.showMessageDialog(null,
                "The Minimum is "+result);
        JOptionPane.showMessageDialog(null,
                "The minimum is "+resultt);

    }
    public  static  int minimumfunctions(int min1, int min2){
        int min;
        if (min1>min2)
            min=min2;
        else
            min=min1;
        return min;
    }


    public  static  double minimumfunctions(double min1, double min2){
        double min;
        if (min1>min2)
            min=min2;
        else
            min=min1;
        return min;
    }
}
