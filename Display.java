import java.util.Scanner;

public class Display {
    public static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        int[] myIntArray = getInteger(5); //return array of 5 variable.
        System.out.println("average is: "+average(myIntArray));
    }
    //method to return array with user input in it.
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
    public static double average(int[] array){
        int sum= 0;
        for(int i=0; i<array.length; i++){
            sum +=array[i];
        }
        return (double)sum /(double)array.length; //typecasting.
    }

    

}
