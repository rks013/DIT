
import java.util.Scanner;
 class binarySearchRecursive {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10, 51,52,53,54,55};

        Scanner sc = new Scanner(System.in);
        System.out.println("enter key element: ");
        int key = sc.nextInt();

        int low = 0, high = arr.length-1;
        int index = binarySearch(arr, low , high, key);

        
        System.out.println("index of the key : "+index);
    }
    public static int binarySearch(int[] arr,int low,int high ,int key) {
    
        if (low>high)
            return -1;

        int mid = (low+high)/2;
        if(arr[mid]==key)
            return mid;

        else if(arr[mid]>key)
            return binarySearch(arr,low , (mid-1), key );

        else //(arr[mid]<key)
            return binarySearch(arr, (mid+1), high, key);
       
      

        
    }
}
