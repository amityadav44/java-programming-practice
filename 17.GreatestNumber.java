import java.util.Scanner;

class GreatestNumber {
    public static void main(String[] args) {
        System.out.println(" Hello ! Now we are check the greatest number");
        Scanner sc =new Scanner(System.in);
        System.out.println("! Please !Enter the first number");
        int number1= sc.nextInt();
        System.out.println("Please ! Enter the second number ");
        int number2= sc.nextInt();
        System.out.println("Please ! Enter the third number");
        int number3= sc.nextInt();
        if(number1 > number2 && number1 > number3)
        {
            System.out.println("Number 1  greatest number " + number1);
        } else if (number2 > number3 )
        {
            System.out.println("Number 2  greatest number " + number2);
        }
        else {
            System.out.println("Number3 is greatest number " + number3);
        }
    }
}
