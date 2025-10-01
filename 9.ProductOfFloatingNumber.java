import java.util.Scanner;
 class ProductOfFloatingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the floating point number ");
        System.out.println("Enter the first number");

        float a= sc.nextFloat();
        System.out.println("Enter the second number");

        float b= sc.nextFloat();

        float Mul = (a+b);
        System.out.println(" Mul is " + Mul);
    }

}
