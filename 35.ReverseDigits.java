import java.util.Scanner;

 class Reversethedigits
{
    public static void main(String[] args)
     {
        System.out.println("Welcome to Reverse the  digits");
        Scanner sc =  new Scanner(System.in);
        System.out.println("Please  enter the your choice number");
        int number = sc.nextInt();
        int reverse = reverseofnumber(number);
         System.out.println("Reverse of your number is " + reverse);
     }
     public static int reverseofnumber(int number){
         int newnumber=0;
         while(number>0)
         {
             int digit=number%10;
             newnumber=newnumber*10+digit;
             number=number/10;
         }
         return newnumber;
     }
}
