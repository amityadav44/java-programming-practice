import java.util.Scanner;

 class Search2DArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array dimensions
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = scanner.nextInt();

        int[][] array = new int[rows][cols];

        // Input elements
        System.out.println("Enter elements of the 2D array:");
        int i = 0;
        while (i < rows) {
            int j = 0;
            while (j < cols) {
                array[i][j] = scanner.nextInt();
                j++;
            }
            i++;
        }

        // Input the element to search
        System.out.print("Enter the element to search: ");
        int target = scanner.nextInt();

        // Call the search method
        searchElement(array, rows, cols, target);

        scanner.close();
    }

    // Method to search an element in a 2D array using while loop
    public static void searchElement(int[][] array, int rows, int cols, int target) {
        int i = 0;
        boolean found = false;

        while (i < rows) {
            int j = 0;
            while (j < cols) {
                if (array[i][j] == target) {
                    System.out.println("Element " + target + " found at position: (" + i + ", " + j + ")");
                    found = true;
                    break;
                }
                j++;
            }
            if (found) {
                break;
            }
            i++;
        }

        if (!found) {
            System.out.println("Element " + target + " not found in the array.");
        }
    }
}