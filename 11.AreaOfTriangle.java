import java.util.Scanner;

class AreaofTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Area of triangle ");
        System.out.println("Enter the value of B");
        double B= sc.nextDouble();
        System.out.println("Enter the value of H");
        double H=sc.nextDouble();
        double area =(B*H*0.5);
        System.out.println("Area of Triangle of " + area);
    }
}
