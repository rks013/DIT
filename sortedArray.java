

import java.util.Scanner;
public class sortedArray {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String args[]) {
        int[] myIntArray = getInteger(5);
        Display(myIntArray);
        int[] sorted=sortArray(myIntArray);
        System.out.println("****************");
        Display(sorted);
    }
    //method to get integer.
    public static int[] getInteger(int number) {
        int[] array = new int[number];//local variable for assigning length.
        for(int i=0; i< array.length; i++){
            System.out.println("enter number:");
            int input = scanner.nextInt();
            
            scanner.nextLine();//handle enter key.
            array[i] = input;
        }
        scanner.close();
        return array;
    }
    //method to print array
    public static void Display(int[] array) {
        for(int i =0; i<array.length; i++){
            System.out.println("number: "+array[i]);
        }
    }
    //method to sorted array.
    public static int[] sortArray(int[] array) {
        //define new array.
        int[] sortArray = new int[array.length];
        //storing values of array.
        for(int i =0; i<array.length; i++){
            sortArray[i]= array[i];
        }
        int temp;
        boolean flag= true;
        while(flag){
            flag = false;
            for(int i =0; i<sortArray.length-1; i++){
                if(sortArray[i]< sortArray[i+1]){
                    temp = sortArray[i];
                    sortArray[i]=sortArray[i+1];
                    sortArray[i+1]=temp;
                    flag = true;
                }
            }
        }
       
        return sortArray;
    }
}
