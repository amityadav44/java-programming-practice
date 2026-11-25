import java.util.Scanner;

 class BreakExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter something (type 'exit' to stop): ");
            String input = sc.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Exiting loop...");
                break;
            }

            System.out.println("You entered: " + input);
        }

        sc.close();
    }
}
