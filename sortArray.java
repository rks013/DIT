import java.util.Arrays;
import java.util.Scanner;

import java.util.Scanner;
public class sortArray {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] myArray = getInterger(2);
        System.out.println("sorted:"+ Arrays.toString(sortArray(myArray)));
    }
    public static int[] getInterger(int number) {
        int[] array = new int[number];
        for(int i=0; i<array.length; i++){
            System.out.println("number: ");
            int input = scanner.nextInt();
            array[i]= input;
            scanner.nextLine();
        }
        return array;
    }
    public static int[] sortArray(int[] array) {
        int[] newArray = new int[array.length];
        //copy array
        for(int i=0; i<array.length;i++){
            newArray[i]= array[i];
        }
        //now sorting decending.
        boolean flag =true;
        int temp;
        while(flag){
            flag =false;
            for(int i=0; i<newArray.length-1;i++){
                if(newArray[i]<newArray[i+1]){
                    temp = newArray[i];
                    newArray[i]=newArray[i+1];
                    newArray[i+1]=temp;
                    flag = true;
                }
            }
        }
        return newArray;
    }
    public static void diaplay(int[] array) {
        for(int i=0; i<array.length;i++){
            System.out.println("number:"+array[i]);
        }
    }
}
