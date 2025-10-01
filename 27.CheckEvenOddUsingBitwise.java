import java.util.Scanner;
class BitwiseEvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input an integer
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check even or odd using bitwise AND
        if ((number & 1) == 0) {
            System.out.println(number + " is EVEN.");
        } else {
            System.out.println(number + " is ODD.");
        }

        // Optional: Show binary representation
        System.out.println("Binary of " + number + ": " + Integer.toBinaryString(number));

        scanner.close();
    }
}