import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {
        int[] myArray ={5,4,3,2,1};
        System.out.println("original: "+Arrays.toString(myArray));
        reverse(myArray);
        System.out.println("reverse: "+Arrays.toString(myArray));
        int[] newArray ={5,4,3,2,1};
        System.out.println("original new Array: "+Arrays.toString(newArray));
        reverseArray(newArray);

        
    }
    public static void reverse(int[] array) {
        int firstIndex =0;
        int lastIndex = (array.length-1);
        int temp;
        while(firstIndex != lastIndex && firstIndex !=array.length/2){
            temp=array[firstIndex];
            array[firstIndex]=array[lastIndex];
            array[lastIndex] = temp;
            firstIndex++;
            lastIndex--;
             
        }
        System.out.println(Arrays.toString(array));
    }
    //by using forloop
    private static void reverseArray(int[] array) {
        int maxIndex= array.length-1;
        int midIndex = array.length/2;
        int temp;
        for(int i=0; i<midIndex; i++ ){
            temp=array[i];
            array[i]=array[maxIndex];
            array[maxIndex]=temp;

            
            maxIndex--;
        }
        System.out.println("for loop: "+Arrays.toString(array));
    }
}
