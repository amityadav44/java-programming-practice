import java.util.Scanner;

class CountOccurrences {
    public static void main(String[] args) {
        int[] arr = {3, 5, 3, 2, 3, 8, 5, 3};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter element to count: ");
        int element = sc.nextInt();
        int count = 0;

        for (int x : arr) {
            if (x == element)
                count++;
        }

        System.out.println("Occurrences of " + element + " = " + count);
        sc.close();
    }
}
