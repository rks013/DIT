import java.util.Arrays;

public class array{
    public static void main(String[] args) {
        //array is reference type.:-> as new is used.
        //primitive type is value type.
        int number = 5;
        int otherNumbr = number;
        System.out.println("number: "+number+"  other:"+otherNumbr);
        otherNumbr +=5;
        System.out.println("number: "+number+"  other:"+otherNumbr);

        int[] array = new int[5];
        int[] otherArray = array;
        //2 reference pointing to one array.
        System.out.println("array: "+Arrays.toString(array));
        System.out.println("otherArray: "+Arrays.toString(otherArray));

        otherArray[0]=10;
        System.out.println("array: "+Arrays.toString(array));
        System.out.println("otherArray: "+Arrays.toString(otherArray));
        //both are affected as there is one array in memory.

        update(array);
        System.out.println("array: "+Arrays.toString(array));
        System.out.println("otherArray: "+Arrays.toString(otherArray));

        //pointing otherArray to new array in memory.
        otherArray = new int[]{10,20,30,40,50};
        //now calling update will not affect otherArray.
        update(array);
        System.out.println("array: "+Arrays.toString(array));
        System.out.println("otherArray: "+Arrays.toString(otherArray)); 

    }
    //passing reference as parameter 
    public static void update(int[] array) {
        array[0]=45;
        //creating new array.
        array = new int[]{4,5,6,7,8,9};
    }
}