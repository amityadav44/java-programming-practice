import java.util.Scanner;

 class SumAllOddNumber {
    public static void main(String[] args) {
        System.out.println("WELOCOME TO MY CALCULATOR");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your number");
        int num = sc.nextInt();
        int sum=oddsum(num);
        System.out.println("odd sum till " + num + " is " + sum );
    }

    public static int oddsum(int num) {
        int i = 1;
        int sum = 0;
        while (i <= num) {
            sum += i;
            i += 2;
        }
            return sum;
    }
}
