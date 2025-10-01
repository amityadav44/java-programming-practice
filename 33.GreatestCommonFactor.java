import java.util.Scanner;

 class GCD {
        public static void main(String[] args) {
            System.out.println("Welcome to GCD calculator");
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter the first number");
            int first  = sc.nextInt();
            System.out.println("Please enter the second number");
            int second = sc.nextInt();
            int gcd = greatestcommonfactor(first , second);
            System.out.println("The gcd of the two  number is the " + gcd);
        }

        public static int  greatestcommonfactor(int first, int second) {
           int gcd = 1;
            int i=2;
            int least =least(first,second);
            while (i<=least){
                if(first%i==0&& second%i==0) {
                    gcd = i;
                }
                i++;
            }
            return gcd;
        }
            public static int least(int first,int second){
            if(first<second)
            {
                return first;
            }
            else {
                return second;
            }
        }

}
