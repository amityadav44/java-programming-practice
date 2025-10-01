import java.util.Scanner;
 class CheckNo {
    public static void main(String[] args) {
        System.out.println("Please Welcome to identifer or checker  calculater ");
        Scanner sc =  new Scanner(System.in);
        System.out.println("Please  enter the your choice number");
        int number = sc.nextInt();

        if(number == 0)
        {
            System.out.println(" Number is Zero👌");
        }
       else if(number > 0)
        {
            System.out.println("Number is Postive😍😍");
        }
       else
        {
            System.out.println("Number is negative😒");
        }

    }
}
