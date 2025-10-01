import java.util.Scanner;

 class CompoundInterrest {
        public static void main(String[] args)
        {
            System.out.println(" Please Welcome  to Compound intrest Calculator");
            Scanner sc =new Scanner(System.in);
            System.out.println("Please Enter your Principle amount in Rs ");
            double Principle= sc.nextDouble();
            System.out.println("Now ! Tell me for how many years are you ");
            double year =sc.nextDouble();
            System.out.println("Now !  tell me your rate of intrest");
            double rate=  sc.nextDouble();
            double Compound_Intrest = Principle*Math.pow((1+rate/100),year);
            System.out.println("Compound intrest is " + Compound_Intrest);
        }
}
