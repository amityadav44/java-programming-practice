import java.util.Scanner;
 class NoOfOccerence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Calculator");
        int[] arr = ArrayUtility.inputArray();
        System.out.println("Now enter the number you want too find:");
        int num = sc.nextInt();
       int occureences = noofoccerencence(arr,num);
        System.out.println("Your element was found " + occureences + "times in the array");
    }

    public static int noofoccerencence(int[] arr,int num){
        int occ=0;
        int i=0;
        while(i<arr.length) {
            if(arr[i]==num)
            {
                occ++;
            }
            i++;
        }
        return occ;
    }
}
