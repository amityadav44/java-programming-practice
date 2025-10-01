import java.util.Scanner;

 class AgeGroup {
    public static void main(String[] args) {
        System.out.println("Hello ! Guys hurry up now today finaly declear that  categorize a person into different age groups");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please ! enter your age ");
        int age = sc.nextInt();
        if (age >= 65) {
            System.out.println("Hello ! your are Senior citizen ");
        } else if (age >= 20) {
            System.out.println("Hello ! your are adult citizen");
        } else if (age >= 13) {
            System.out.println(" Hello ! your are teenager");
        } else {
            System.out.println("  Hello ! your are a child ");
        }
    }
}
