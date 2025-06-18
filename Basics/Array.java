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
        int[] arr2 = {1, 2, 3, 4, 5};
        
        int[][] mul = new int[arr1.length][arr2.length];
        for(int i=0; i<arr1.length; i++) {
            for(int j=0;j<arr2.length; j++) {
                mul[i][j]=arr1[i]*arr2[j];//to multiply array 1 and 2
            }
        }
        
        for(int i=0; i<mul.length; i++) {
            for(int j=0;j<mul.length; j++) {
                System.out.println(mul[i][j]);to print the multiplication matrix
            }
        }
    }
}

