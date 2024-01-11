import java.util.Arrays;

public class arrayInsert {
    public static void main(String[] args) {
        int[] arr = new int[6];
        for(int i=0; i<arr.length - 1; i++){
            arr[i]=i+1;
        }
        System.out.println(Arrays.toString(arr));
        insertArraay(arr, 5, 6, 1, 10);
        System.out.print(Arrays.toString(arr));

    }
    public static int insertArraay(int[] array , int element, int capacity, int position, int value){
        if(element == capacity){
            return -1;
        }
        int pos = position-1;
        for(int i =element-1; i>= pos; i--){
            array[i+1] = array[i];
        }
        array[pos]= value;
        return 1;
    }
}
