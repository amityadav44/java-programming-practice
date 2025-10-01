import java.util.Scanner;
class DiagonalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the square matrix
        System.out.print("Enter the size of the square matrix (n x n): ");
        int n = scanner.nextInt();

        int[][] matrix = new int[n][n];

        // Input matrix elements
        System.out.println("Enter the elements of the matrix:");
        int i = 0;
        while (i < n) {
            int j = 0;
            while (j < n) {
                matrix[i][j] = scanner.nextInt();
                j++;
            }
            i++;
        }

        // Call method to compute diagonal sums
        int totalDiagonalSum = sumOfDiagonals(matrix, n);

        System.out.println("Sum of both diagonals: " + totalDiagonalSum);

        scanner.close();
    }

    // Method to calculate the sum of both diagonals
    public static int sumOfDiagonals(int[][] matrix, int n) {
        int i = 0;
        int sum = 0;

        while (i < n) {
            // Primary diagonal: [i][i]
            sum += matrix[i][i];

            // Secondary diagonal: [i][n - 1 - i]
            if (i != n - 1 - i) { // Avoid double-counting the center in odd-sized matrix
                sum += matrix[i][n - 1 - i];
            }

            i++;
        }

        return sum;
    }
}