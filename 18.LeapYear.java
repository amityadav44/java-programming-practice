import java.util.Scanner;

 class LeapYear {
    public static void main(String[] args) {
        System.out.println("The  the leap year or not");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please ! Enter the year");
        int year =sc.nextInt();
        if(year%4==0 || (year%4==0 && year%100!=0))
        {
            System.out.println("Your year is leap year ");
        } else if (year%4==0 && year%100!=0) {
            System.out.println("your year is leap year");
        } else
        {
            System.out.println("your year is not leap year");
        }
    }
}
