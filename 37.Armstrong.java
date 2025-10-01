import java.util.Scanner;
 class Armstrongnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }

    public static boolean isArmstrong(int number) {
        int original = number;
        int sum = 0;
        int digits = String.valueOf(number).length();  // Number of digits

        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, digits);  // digit^digits
            number /= 10;
        }

        return sum == original;
    }
}
