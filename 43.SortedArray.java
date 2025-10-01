class Sorted {
    public static void main(String[] args) {
        System.out.println("Welcome to sorting calculator");
        int[] arr = ArrayUtility.inputArray();
        boolean isInc=isIncreassingsort(arr);
        boolean isDec = isDecressingsort(arr);
        if(isInc || isDec)
        {
            System.out.println(" You array is sorted");
        }else
        {
            System.out.println("your array is not sorted");
        }
    }

    public static boolean isIncreassingsort(int[] arr) {
        int i = 1;
        while (i < arr.length) {
            if(arr[i]<arr[i-1])
            {
                return false;
            }
            i++;
        }
        return true;
    }

    public static boolean isDecressingsort(int[] arr)
    {
        int i = 1;
        while (i < arr.length) {
            if(arr[i]>arr[i-1])
            {
                return false;
            }
            i++;
        }
        return true;
    }

}


