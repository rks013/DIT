import java.util.Arrays;

public class deleteInArray {
    public static void main(String[] args) {
        int[] arr = {3,5,7,9,11};
        int[] arr1 = {2,4,6,8,10,12,14};
        System.out.println(Arrays.toString(arr1));
        deleteInArray(arr, 1);
        System.out.println(Arrays.toString(deleteInArray(arr1, 4)));
    }
    //return size of array.
    public static int[] deleteInArray(int[] array, int index){
        if(index>array.length || index<0 ){
            return array;
        }
        // copy to another array
        int[] anotherArray = new int[array.length-1];
        for(int i =0, k=0; i<array.length; i++){
           if(i==index){
            continue;// not inserting the index value in another array:-hence -deleted.
           }
           anotherArray[k] =array[i];
           k++;
        }
       return anotherArray;
    }
}
