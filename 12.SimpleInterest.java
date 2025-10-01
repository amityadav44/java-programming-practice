
import java.util.Scanner;

 class Simmpleinterest {
    public static void main(String[] args) {
        System.out.println(" Please Welcome  Simple Intrest Calculator ");
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your principle amount Rs");
        double Principle= sc.nextDouble();
        System.out.println("Now ! Tell me for how many years are you ");
        double time =sc.nextDouble();
        System.out.println("Now !  telll me your rate of intrest");
        double rate=  sc.nextDouble();
        double Simple_Intrest =(Principle*time*rate)/ 100;
        System.out.println("Simple intrest is " + Simple_Intrest);
    }
}
