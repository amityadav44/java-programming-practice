import java.util.Scanner;

 class ContinueSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter number " + i + ": ");
            int num = sc.nextInt();

            if (num < 0)
                continue; // skip negative numbers

            sum += num;
        }

        System.out.println("Sum of positive numbers: " + sum);
        sc.close();
    }
}
