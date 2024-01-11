import java.util.Scanner;
 class binarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,21,22,23,24,25};

        Scanner sc = new Scanner(System.in);
        System.out.println("enter key element: ");
        int key = sc.nextInt();

        int index = binarySearch(arr,key);

        
        System.out.println("index of the key : "+index);
    }
    public static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length-1;

        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==key)
                return mid;
            else if(arr[mid]>key)
                high=mid-1;
            else if(arr[mid]<key)
                low = mid+1;
        }
        return -1;

        
    }
}
