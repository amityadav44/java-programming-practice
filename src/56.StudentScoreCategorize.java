import java.util.Scanner;
 class StudentScoreCategorize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Students score categorize");
        System.out.println("Please enter the your score");
        int score= sc.nextInt();
        String result =score > 80 ? "High" : ( score> 50  ? "Moderate": "Low") ;
        System.out.println("The categorize of student is  " + result);
    }
}
