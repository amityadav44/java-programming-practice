import java.util.Scanner;

class CircleCalc {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the radius : ");
         double r = sc.nextDouble();
         double area = Math.PI*r*r;
         double circumference = 2*Math.PI*r;
         System.out.println("Area :" + area);
         System.out.println("Circumference :"+ circumference);
     }
}
