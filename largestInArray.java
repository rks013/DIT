public class largestInArray {
    public static void main(String[] args) {
        int[] arr = {10,5,20,8};
        int[] arr1 ={40,8,50,100,35};
        System.out.println(lagestElementInArray(arr1));
    }
    //method
    public static int lagestElementInArray(int[] array) {
        if(array == null){
            return -1;
        }
        int index = 0;
        int largest = array[index];
        for(int i =0; i<array.length ; i++){
            if(largest < array[i]){
                largest = array[i];
                index = i;
            }
        }
        return largest;
    }
}
