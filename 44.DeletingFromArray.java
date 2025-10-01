import java.util.Scanner;

class Deletingfromarray {
    public static void main(String[] args) {
        System.out.println("Welcome to Array Deletion Calculator");
        Scanner sc = new Scanner(System.in);

        // Take input from user
        int[] numArr = ArrayandUtility.inputArray();

        System.out.println("Now, enter the number you want to delete: ");
        int numToDelete = sc.nextInt();

        // Delete number
        int[] newArr = deleteNumber(numArr, numToDelete);

        System.out.println("Here is your new array:");
        ArrayandUtility.displayArray(newArr);
    }

    public static int[] deleteNumber(int[] numArr, int numToDelete) {
        int occ = OccurrencesArray.noOfOccurrence(numArr, numToDelete);

        if (occ == 0) {
            System.out.println("Number not found! Returning original array.");
            return numArr; // number not found, return original array
        }

        int newSize = numArr.length - occ;
        int[] newArr = new int[newSize];

        int i = 0, j = 0;
        while (i < numArr.length) {
            if (numArr[i] != numToDelete) {
                newArr[j] = numArr[i];
                j++;
            }
            i++;
        }
        return newArr;
    }
}

// Utility class for array input/output
class ArrayandUtility {
    public static int[] inputArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void displayArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

// Utility class for occurrences
class OccurrencesArray {
    public static int noOfOccurrence(int[] arr, int key) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                count++;
            }
        }
        return count;
    }
}
