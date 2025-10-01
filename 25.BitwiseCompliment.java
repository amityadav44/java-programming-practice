import java.util.Scanner;

 class BitwiseComplement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input an integer
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Bitwise complement operation
        int complement = ~number;

        // Output the result
        System.out.println("Bitwise complement of " + number + " is: " + complement);

        // Optional: Binary representation
        System.out.println("Binary of original:   " + Integer.toBinaryString(number));
        System.out.println("Binary of complement: " + Integer.toBinaryString(complement));

        scanner.close();
    }
}