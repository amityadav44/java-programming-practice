import java.util.Scanner;
class ParameterOfRectanglre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Parameter Of Rectanglre");
        System.out.println(" Please enter all 4 sides in cms");
        double a= sc.nextDouble();
        double b= sc.nextDouble();
        double c= sc.nextDouble();
        double d= sc.nextDouble();

        System.out.println("Perimeter of your rectangle ");
        double Parameter = (a+b+c+d);
        System.out.println(" Parameter of rectangle is " +Parameter);

    }
}
