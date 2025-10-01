import java.util.Scanner;

 class ArithmeticOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Calculate the Arithmetic Operators");

        System.out.println("Enter the first number");

        double a= sc.nextDouble();
        System.out.println("Enter the second number");

        double b= sc.nextDouble();
       double Sum =(a+b) ;
        double Sub = (a-b);
        double Mul = (a*b);
        double divi =(a/b);
        double Mod = (a%b);

        System.out.println("Sum is " + Sum);

        System.out.println("Sub is " + Sub);

        System.out.println("Mul is " +  Mul);

        System.out.println("divi is " + divi);

        System.out.println("Mod is " + Mod);
    }
}
