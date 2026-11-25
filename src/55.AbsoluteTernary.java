import java.util.Scanner;

class AbsoluteTernary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to absolute value");
        int num= sc.nextInt();
        int result= num>=0 ? num : -num;
        System.out.println("Absolute value is " + result);
    }
}
