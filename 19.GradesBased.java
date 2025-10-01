import java.util.Scanner;

 class GradesBased {
    public static void main(String[] args) {
        System.out.println("Hello ! Guys hurry up now today decleare your grade");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please ! enter our marks ");
        int marks = sc.nextInt();
        if(marks >90 )
        {
            System.out.println(" Congreats! Your Grade is ❤️❤️A❤️❤️");
        }
        else if(marks>75 && marks<=90)
        {
            System.out.println("  Congreats !Your Grade is ❤️❤️B❤️❤️");
        }
        else if(marks>60 && marks<=75)
        {
            System.out.println("  Congreats !Your Grade is ❤️❤️C❤️❤️");
        }
        else if(marks>30 && marks<=60)
        {
            System.out.println("  Congreats !Your Grade is ❤️❤️D❤️❤️");
        }
        else if(marks<=30)
        {
            System.out.println("  Bak Bhasdike  ! Fail ho hgya 👄👄👄👄🫦🫦🫦");
        }
    }
}
