public class methods{
        /* a method refers to a collection of
        statements that are grouped together
        * to perform an operation*/
        public static void main(String[] args) {
            int a=10;
            int b=12;
            int c=minFunction(a,b);
            System.out.println("Minimum value is "+c);
        }
        public static int minFunction(int n1,int n2){
            int min;
            if (n1 > n2)
                min = n2;
            else
                min = n1;

            return min;
        }
    }

