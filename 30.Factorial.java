import java.util.Scanner;

class Factoriall {
    public static void main(String[] args) {
        System.out.println("Welcome to  Calculator");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter  any number you calculate factorial");
        int num = sc.nextInt();
        long fact=calculatefactorial(num);
        System.out.println("Factorial of a number is " + fact );
    }

    public static long calculatefactorial(int num) {
   int i=1;
   int fact=1;
   while(i<=num)
   {
       fact =fact*i;
       i++;
   }
   return fact;
    }
}
