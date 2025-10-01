import java.util.Scanner;

 class Multiplication {
    public static void main(String[] args) {
        System.out.println("Welcome Multiplication Table ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the any number you want to print table");
        int num = sc.nextByte();
        multiplicationtable(num);
    }
    public static void multiplicationtable(int num) {
        int i=1;
        while(i<=10)
        {
            System.out.println(num  + " X " + i + " = " + (num * i));
            i++;
        }

    }
}
