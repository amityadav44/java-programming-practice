import java.util.*;
class GuessNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = (int) (Math.random() * 100) + 1;
        int guess = 0;

        System.out.println("Guess a number between 1 and 100!");

        for (int i = 1; i <= 5; i++) {
            System.out.print("Attempt " + i + ": ");
            guess = sc.nextInt();

            if (guess == number) {
                System.out.println("🎉 Correct! You guessed the number in " + i + " tries!");
                return;
            } else if (guess < number) {
                System.out.println("Too low!");
            } else {
                System.out.println("Too high!");
            }
        }

        System.out.println("❌ Game over! The correct number was: " + number);
    }
}
