import java.util.Scanner;

 class PrintPattern {
    public static void main(String[] args) {
        System.out.println("Welcome to pattern");
        System.out.println("We are here to print pattern\n");
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the number of rows");
        int rows= sc.nextInt();
        printfirstpatterns(rows);
        printSecondpatterns(rows);
        printThirdPattern(rows);
    }
    public static void printfirstpatterns(int maxRows)
    {
        System.out.println("Here is right half pyramid");
        int rows=0;
        while (rows<maxRows) {
            System.out.print("*");
            int i=0;
            while (i<rows)
            {
                System.out.print(" *");
                i++;
            }
            System.out.println();
            rows++;
        }
    }
    public static void printSecondpatterns(int maxRows) {
        System.out.println("Here is reverse right half pyramid ");
        int rows =maxRows;
        while (rows >0) {
            System.out.print("*");
            int i = 1;
            while (i < rows) {
                System.out.print(" *");
                i++;
            }
            System.out.println();
            rows--;
        }
    }
        public static void printThirdPattern(int maxRows) {
            System.out.println("Here is left half pyramid:");

            int rows = maxRows;

            while (rows > 0) {
                // Print spaces
                int j = 0;
                while (j < rows - 1) {
                    System.out.print("  ");
                    j++;
                }

                // Print stars
                int i = 0;
                while (i <= (maxRows - rows)) {
                    System.out.print("* ");
                    i++;
                }

                System.out.println(); // Move to next line
                rows--;
            }
        }

}
