import java.util.Scanner;

class SumOAfDigits {
    public static void main(String[] args) {
        System.out.println("Welcome to sum of digits calculator");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the any number ");
        int num = sc.nextInt();
        int sum=sumofdigits(num);
        System.out.println("Sum of Digits is :"  + sum);

    }

    public static int sumofdigits(int num) {
        int sum =0 ;
        int rem=0;
        while(num>0) {
            rem=num % 10;
            sum=sum + rem;
            num=num/ 10;
        }
        return sum;
    }
}
