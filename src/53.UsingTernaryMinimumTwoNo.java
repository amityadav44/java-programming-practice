import java.util.Scanner;

class UsingTernaryMinimumTwoNo {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Welcome to Ternary calculator");
         System.out.println("Please enter the first number");
         int num1 = sc.nextInt();
         System.out.println("Please enter the second number");
         int num2 = sc.nextInt();
         UsingTernaryMinimumTwoNo ternary=new UsingTernaryMinimumTwoNo();
         int min=ternary.min(num1,num2);
         System.out.println("Minimum number is " + min);
     }


         public int  min(int num1,int num2)
         {
             return num1 < num2 ? num1 : num2;

         }

}
