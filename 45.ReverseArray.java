class ReverseArray {
    public static void main(String[] args) {
        System.out.println("Welcome to Reverse Array Calculator");

        int[] arr= ArrayUtility.inputArray(); // input array from user
        reverse(arr); // reverse the array
        System.out.println("Your reversed array is:");
        displayArray(arr); // display reversed array
    }

    // Method to reverse array
    public static void reverse(int[] arr) {
        int i = 0;
        while (i < arr.length / 2) {
            int swap = arr[i];
            arr[i] = arr[arr.length - 1 - i];   // FIXED here
            arr[arr.length - 1 - i] = swap;     // FIXED here
            i++;
        }
    }
    public static void displayArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

