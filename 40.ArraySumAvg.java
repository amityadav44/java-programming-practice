import java.util.Scanner;
 class ArraySumAvg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to array calculator");
        //  System.out.println("Please Enter the size of array");
        //   int size = sc.nextInt();
        int[] arr = ArrayUtility.inputArray();
        int sum =sum(arr);
        int avg=avg(arr);
        System.out.println("Sum of the number is  : " + sum);
        System.out.println("Average of the number : " + avg);
    }
    public static int sum(int[] arr) {
        int i = 0;
        int sum = 0;
        while (i < arr.length) {
            sum += arr[i]; // calculate sum while taking input
            i++;
        }
        return sum;
    }
    public static int avg(int[] arr){
        int sum=sum(arr);
        return (int) (sum / arr.length);
    }
}
