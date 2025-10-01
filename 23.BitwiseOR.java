import java.util.Scanner;

class BitwiseOR {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         // Input two integers
         System.out.print("Enter the first number: ");
         int num1 = scanner.nextInt();

         System.out.print("Enter the second number: ");
         int num2 = scanner.nextInt();

         // Bitwise OR operation
         int result = num1 | num2;

         // Output the result
         System.out.println("Bitwise OR of " + num1 + " and " + num2 + " is: " + result);

         // Optional: display binary representations
         System.out.println("Binary of " + num1 + ": " + Integer.toBinaryString(num1));
         System.out.println("Binary of " + num2 + ": " + Integer.toBinaryString(num2));
         System.out.println("Binary of result: " + Integer.toBinaryString(result));

         scanner.close();
     }
 }