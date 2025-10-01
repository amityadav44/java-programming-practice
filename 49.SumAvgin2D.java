import java.util.Scanner;
class SumAverage2DArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array dimensions
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = scanner.nextInt();

        int[][] array = new int[rows][cols];

        // Input array elements using while loop
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

        // Call method to compute sum and average
        calculateSumAndAverage(array, rows, cols);

        scanner.close();
    }

    // Method to calculate and print sum and average using while loop
    public static void calculateSumAndAverage(int[][] array, int rows, int cols) {
        int i = 0;
        int sum = 0;
        int count = 0;

        while (i < rows) {
            int j = 0;
            while (j < cols) {
                sum += array[i][j];
                count++;
                j++;
            }
            i++;
        }

        double average = (double) sum / count;

        System.out.println("Sum of all elements: " + sum);
        System.out.println("Average of all elements: " + average);
    }
}