import java.util.Arrays;
import java.util.Scanner;

public class printArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] myArray = new int[5];
        //input number to array
        for(int i =0; i<5;i++){
            System.out.println("enter number");
            int input = scanner.nextInt();
            myArray[i]=input;
        }
        //print array:-> Arrays.toString(array) method helps.
        System.out.println("array:"+Arrays.toString(myArray));


        
    }
    
}
