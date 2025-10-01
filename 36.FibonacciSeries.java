import java.util.Scanner;

 class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Welcome to Fibonacci Series");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of terms you want: ");
        int number = sc.nextInt();
        System.out.println("Your Fibonacci series is: ");
        fibonacciseries(number);
    }

    public static void fibonacciseries(int number) {
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        int first = 0;
        int second = 1;
        int count = 1;

        while (count <= number) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;

            count++;
        }

        System.out.println(); // For a new line after printing the series
    }
}