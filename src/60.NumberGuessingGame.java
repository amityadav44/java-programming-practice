
import java.util.Random;
import java.util.Scanner;

class NumberGuessingGame
{
     public static void main(String[] args)
     {
         System.out.println("Welcome to Number Guessing Game");
         Scanner sc =new Scanner(System.in);
         Random input= new Random();
         int computer= input.nextInt(100)+1;
         int user=0;
         do {
             System.out.println("Enter you guess (1 to 100)");
             user = sc.nextInt();
             if (user < computer) {
                 System.out.println("TO much low ! try again");
             } else if (user > computer) {
                 System.out.println("TO much high ! try again");
             } else {
                 System.out.println("Congratulation ! you guess the number");
             }
         }
                 while (user != computer);

         sc.close();
     }
}
