import java.util.Scanner;

 class FahrenheitToCelsius {
    public static void main(String[] args) {
        System.out.println("Welcom to Unique Temperature Converter");
        Scanner sc =new Scanner(System.in);
        System.out.println("Please enter the temp in  Fahh");
        double Fah= sc.nextDouble();
        double Celsius =  ( Fah -  32 ) * 5 / 9;
        System.out.println(" the temp is  in celsius  " + Celsius + " c ");
    }
}
