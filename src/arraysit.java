public class arraysit {
    public static void main(String[] args) {
        double[] rais={1.2,1.3,2.5,3.1};
        //a simple for loop to print out all elements
        for (int b=0;b<rais.length;b++){
            System.out.println(rais[b] + " ");
        }
        //adding up all eleements in this array
        double addme=0;
        for (int b=0;b<rais.length;b++){
            addme +=rais[b];
        }
        System.out.println("The sum is  "+addme);
        //finding largest item in the array
        double max=rais[0];
        for (int b=1;b<rais.length;b++)
        {
            if (rais[b]>max)max=rais[b];
        }
        System.out.println("Maximum value is  "+max);
    }
}
