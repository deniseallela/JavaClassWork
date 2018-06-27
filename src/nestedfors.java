public class nestedfors {
    public static void main(String[] args) {
        int i,j,k;
        //outerloop will be used to print out rows
        //inner for loop will be used to print columns
        //a nested for loop is a for loop within a for loop
        for (i=5;i>=1;i--){
            for (j=5;j>1;j--)
            {
                System.out.print(" ");
            }
            for (k=1;k<(i*2);k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
