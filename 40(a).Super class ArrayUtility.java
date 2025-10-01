import java.util.Scanner;

 class ArrayUtility {
    public static int[] inputArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter size of element ");
        int  size= sc.nextInt();
        int[] amit=new int[size];
        int i=0;
        System.out.println("Please enter element no "  + (i+1) + " elements are:");
        while(i<size)
        {
            amit[i]=sc.nextInt();
            i++;
        }
        return amit;
    }
}
