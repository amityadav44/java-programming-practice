import java.util.Scanner;

 class PrimeNo {
    public static void main(String[] args) {
            System.out.println("Welcome to checker  calculater prime or not");
            Scanner sc =  new Scanner(System.in);
            System.out.println("Please  enter the your choice number");
            int number = sc.nextInt();
            boolean isPrime = isPrime(number);
            if(isPrime)
            {
                System.out.println("your number is prime");
            }
            else {
                System.out.println("Number is not prime");
            }

    }
    public static boolean isPrime(int number){
        int i=2;
        while (i<number){
            if(number%i==0)
            {
                return false;
            }
            i++;
        }

                return true;
    }
}
