 class bubbleSort {
    public static void main (String[] args){
        int[] arr = {1,2,31,4,51,6,7,81,9,101};
        int[] newarr = {95,6,52,89,56,45,78,21};

        bubbleSort(arr);
        bubbleSortOptimise(newarr);

        printArray(arr);
        printArray(newarr);



    }
    public static void bubbleSort(int[] arr) {
        for(int i =0; i<arr.length-1;i++){
            for(int j =0 ; j<arr.length-1; j++){
                if(arr[j]>arr[j+1])
                    //swap(arr[j] , arr[j+1]);
                    {
                        int temp = arr[j];
                        arr[j]= arr[j+1];
                        arr[j+1] = temp;
                    }
            }
        }
    }
    public static void bubbleSortOptimise(int[] arr) {
        for(int i =0; i<arr.length-1;i++){
            for(int j =0 ; j<arr.length-i-1; j++){
                if(arr[j]>arr[j+1])
                    //swap(arr[j] , arr[j+1]);
                    {
                        int temp = arr[j];
                        arr[j]= arr[j+1];
                        arr[j+1] = temp;
                    }
            }
        }
    }
    public static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

}
