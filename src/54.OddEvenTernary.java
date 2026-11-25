import java.util.Scanner;
 class OddEvenTernary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to OddEvenTernary");
        System.out.println("Please enter the number");
        int num=sc.nextInt();
        String number=num%2==0 ? " Even"  : "Odd";
        System.out.println("your number is:" + number);
    }
}
