 import java.util.Scanner;
 class linearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        Scanner sc = new Scanner(System.in);
        System.out.println("enter key element: ");
        int key = sc.nextInt();

        int index = linearSearch(arr,key);

        
        System.out.println("index of the key : "+index);
    }
    public static int linearSearch(int[] arr, int key) {
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key )
                return i; //this will give u the index value of the key.
        }
        return -1;
    }
}
