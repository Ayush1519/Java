class Main{
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        System.out.println(arr[2]);//printing array element

        int[] arr2 = {1, 2, 3, 4, 5};
        int sum =0;
        for(int i=0; i<arr1.length; i++){
            sum += arr1[i] + arr2[i];
        }
        System.out.println("sum:"+sum);
    }
}

