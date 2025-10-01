import java.util.Scanner;

class inputArray
{
    public static void main(String[] args)
    {
        System.out.println("Welcome To Array sum and Avergae ");
        Scanner  sc =new Scanner(System.in);
        System.out.println("Please enter the array element one by one ");
       int  size= sc.nextInt();
       int[] amit=new int[size];
       int i=0;
       System.out.println("Please enter element no "  + size + " elements are:");
       while(i<size)
       {
           amit[i]=sc.nextInt();
           i++;
       }
       i=0;
        System.out.println(" Array elements are:");
        while(i<size)
        {
            System.out.println(amit[i] + " ");
            i++;
        }

    }
}
