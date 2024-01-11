public class checkSorted {
    public static void main(String[] args) {
        int[] arr = {3,5,5,9,11,15};
        System.out.println(checkSorted(arr));

    }
    public static boolean checkSorted(int[] array){
        if(array == null){
            return false;
        }
        for(int i =0; i< array.length-1; i++){
            if(array[i]>array[i+1]){
                return false;
            }
        }
        return true;
    }
}
