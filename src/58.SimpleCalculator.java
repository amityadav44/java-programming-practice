import java.util.Scanner;
class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to simple calculator");
        System.out.println("1 for addition ");
        System.out.println("2 for substraction");
        System.out.println("3 for multiplication");
        System.out.println("4 for division");
        System.out.println("5 for flor division");
        System.out.println("Please selsect operation");
        int number=sc.nextInt();
        System.out.println("Please enter the first number");
        int num1=sc.nextInt();
        System.out.println("Please enter the second number");
        int num2= sc.nextInt();
        switch (number) {
            case 1:
                int sum=num1+num2;
                System.out.println("Addition " + sum);
                break;
            case 2:
                int sub= num1-num2;
                System.out.println("Substraction " +sub  );
                break;
            case 3:
                int mul=num1*num2;
                System.out.println("Multiplication " + mul);
                break;
            case 4:
                int divi= num1/num2;
                System.out.println("Division " + divi);
                break;
            case 5:
                int flordivi=num1%num2;
                System.out.println("FlorDivision " + flordivi);
                break;
            default:
                System.out.println("Invalid number ");
                break;
        }

    }
}
