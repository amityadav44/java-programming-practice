import java.util.Scanner;
 class ShiftOperatorsDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input an integer and number of positions to shift
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.print("Enter number of positions to shift: ");
        int positions = scanner.nextInt();

        // Left Shift Operation
        int leftShiftResult = number << positions;

        // Right Shift Operation (Arithmetic right shift)
        int rightShiftResult = number >> positions;

        // Display results
        System.out.println("\n--- Shift Operations ---");
        System.out.println("Original number: " + number);
        System.out.println("Binary:           " + Integer.toBinaryString(number));

        System.out.println("\nLeft Shift (number << " + positions + "): " + leftShiftResult);
        System.out.println("Binary:           " + Integer.toBinaryString(leftShiftResult));

        System.out.println("\nRight Shift (number >> " + positions + "): " + rightShiftResult);
        System.out.println("Binary:           " + Integer.toBinaryString(rightShiftResult));

        scanner.close();
    }
}