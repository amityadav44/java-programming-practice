 class MaxInArray {
    public static void main(String[] args) {
        int[] numbers = {12, 45, 67, 89, 23, 56};
        int max = numbers[0];

        for (int n : numbers) {
            if (n > max) {
                max = n;
            }
        }

        System.out.println("Maximum value: " + max);
    }
}
