import java.util.Scanner;

class PalindromNumber {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number: ");
            int number = sc.nextInt();
            if (isPalindrom(number)) {
                System.out.println(number + " is a Palindrom number.");
            } else {
                System.out.println(number + " is not a Palindrom number.");
            }
        }

        public static boolean isPalindrom(int number) {
            int original = number;
            int sum = 0;
            int digits = String.valueOf(number).length();  // Number of digits

            while (number > 0) {
                int digit = number % 10;
                sum = sum *10+digit;
                number /= 10;
            }

            return sum == original;
        }

}
