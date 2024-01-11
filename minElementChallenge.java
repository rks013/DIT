import java.util.Scanner;

public class minElementChallenge {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("enter count: ");
        int count = scanner.nextInt();
        scanner.nextLine();
        int[] myArray = readInteger(count);
        Display(myArray);
        System.out.println("min: "+findMin(myArray));
    }
    public static int[] readInteger(int number) {
        int[] array = new int[number];
        System.out.println("enter "+number+" integer value:");
        for(int i=0; i< array.length; i++){
            int input = scanner.nextInt();
            
            scanner.nextLine();//handle enter key.
            array[i] = input;
        }
        scanner.close();
        return array;
    }
    //method to print array
    public static void Display(int[] array) {
        System.out.println("input numbers: ");
        for(int i =0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
    public static int findMin(int[] array) {
        int min = array[0];
        for(int i=0; i<array.length; i++){
            if(min>array[i]){
                min =array[i];
            }
        }
        return min;
    }
}
