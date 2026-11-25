import java.util.Scanner;

 class UsingdowhileMultiplicationTable {
    public static void main(String[] args) {
        System.out.println("Welcome to Multiplication table");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to print the table");
        int num= sc.nextInt();
        int i=1;
        do {
            System.out.printf("%d X %d = %d\n", num,i ,num*i);
            i++;
        }
        while (i<=10);
        sc.close();
    }
}
