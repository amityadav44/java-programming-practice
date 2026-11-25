package Challenge87;

import java.util.Scanner;

public class ArithmeticExceptionHandling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Division Calculator\n");
        System.out.println("Please enter your first  numbers: ");
        int first = input.nextInt();
        System.out.println("Now , enter the second number:");
        int second = input.nextInt();
        try {
            int result = first / second;
            System.out.printf("Result is %d", result);
        }catch (ArithmeticException exception){
            if (exception.getMessage()
                    .equals("/ by zero ")) {
                System.out.println("Divide by Zero occurred.");
            } else{
                    throw exception;
                }

        }
    }
}
