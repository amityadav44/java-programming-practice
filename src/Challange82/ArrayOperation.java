package Challange82;

import java.util.Arrays;

public class ArrayOperation {
    private int[] numbers;

    public ArrayOperation(int[] numbers) {
        this.numbers = numbers;
    }

    // Static Nested Class
    public static class Statistics {

        // Mean
        public static double mean(int[] numbers) {
            double sum = 0;
            for (int number : numbers) {
                sum += number;
            }
            return sum / numbers.length;
        }

        // Median
        public static double median(int[] numbers) {
            int[] temp = Arrays.copyOf(numbers, numbers.length);
            Arrays.sort(temp);

            int n = temp.length;
            if (n % 2 == 0) {
                return (temp[n / 2 - 1] + temp[n / 2]) / 2.0;
            } else {
                return temp[n / 2];
            }
        }
    }

    // Testing
    public static void main(String[] args) {
        int[] data = {10, 40, 20, 30, 50};

        System.out.println("Mean: " + Statistics.mean(data));
        System.out.println("Median: " + Statistics.median(data));
    }
}
