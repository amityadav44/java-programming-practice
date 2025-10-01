 class maximummunimum {
    public static void main(String[] args) {
        System.out.println("Welcome to array  MAX and MIN calculator");
        int[] arr=ArrayUtility.inputArray();
        int max=Max(arr);
        int Min=Min(arr);
        System.out.println("Maximum of the Array is " + max );
        System.out.println("Minimum of the ARRAY IS " + Min);
    }
    public static int Max(int[] arr)
    {
        if(arr.length==0) {
            return Integer.MIN_VALUE;
        }
         int max =arr[0];
        int i=0;
             while (i<arr.length) {
                if (max < arr[i]) {
                  max = arr[i];
                }
                i++;
             }
             return max;
    }
    public static int Min(int[] arr)
    {
        int min= Integer.MAX_VALUE;
        int i=0;
        while(i<arr.length)
        {
            if(min>arr[i])
            {
                min=arr[i];
            }
            i++;
        }
        return min;
    }
}
