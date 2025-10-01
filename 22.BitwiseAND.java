import java.util.Scanner;

 class BitwiseAndExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two integers
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        // Perform bitwise AND
        int result = num1 & num2;

        // Display the result
        System.out.println("\nBitwise AND Result:");
        System.out.println(num1 + " & " + num2 + " = " + result);

        // Optionally, show binary representation
        System.out.println("\nBinary Representation:");
        System.out.println(num1 + " = " + Integer.toBinaryString(num1));
        System.out.println(num2 + " = " + Integer.toBinaryString(num2));
        System.out.println(result + " = " + Integer.toBinaryString(result));

        scanner.close();
    }
}