import java.util.Scanner;

class PasswordChecker {
     public static void main(String[] args) {
         System.out.println("Welcome to password checker calculator");
         Scanner sc =new Scanner(System.in);
         String password;
         do{
             System.out.println("Please enter your password");
             password=sc.next();
         }while (isValidPassword(password));
         System.out.println("Thanks for entering a valid password");
     }
     public static boolean isValidPassword(String password){
         return password.length() > 6;
     }
}
