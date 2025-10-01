import java.util.Scanner;

class SwapNumber {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = SC.nextInt();
        System.out.println("Enter the second number");
        int b = SC.nextInt();
        System.out.println("Before swapping");
        System.out.println("value of a " + a);
        System.out.println("value of b " + b);
        int c=a;
        a=b;
        b=c;
        System.out.println("After swapping");
        System.out.println("value of a " + a);
        System.out.println("value of b " + b);
    }
}
