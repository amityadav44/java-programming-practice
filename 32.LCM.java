import java.util.Scanner;
 class LCM {
    public static void main(String[] args) {
        System.out.println("Welcome to LCM calculator");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the first number");
        int num1 = sc.nextInt();
        System.out.println("Please enter the second number");
        int num2 = sc.nextInt();
        int factor = leastcommofactor(num1, num2);
        System.out.println("The LCM of the two  number is the " + factor);
    }

    public static int leastcommofactor(int num1, int num2) {
        int i = 1;
        while (true) {
            int factor = num1 * i;
            if (factor % num2 == 0) {
                return factor;
            }
            i++;
        }
    }
}
