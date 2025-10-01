import java.util.Scanner;

class AddTwoNo {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Please enter the number");
         System.out.println("enter the first number");
         int first = sc.nextInt();
         System.out.println("Enter the second number ");
         int second = sc.nextInt();
         int sum = first+second;
         System.out.println("Addition of two number is : "  + sum);
     }
}
