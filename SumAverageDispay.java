import java.util.Scanner;

public class SumAverageDispay {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] intArray = getInteger(5);
        
        System.out.println("sum : "+sum(intArray));
        System.out.println("average : "+average(intArray));
        findAverage(intArray);
    }
    public static int sum(int[] array) {
        int sum = 0;
        for(int i =0; i<array.length; i++){
            sum= sum+array[i];
        }
        return sum;
    }
    public static double average(int[] array) {
        double totalSum = sum(array);
        double avg = totalSum/array.length;
        return avg;
    }
    //get array.
    public static int[] getInteger(int number) {
        System.out.println("enter "+number+" integer values\r");//\r--->for next line
        int[] myArray = new int[number];
        for(int i =0; i<myArray.length; i++){
            System.out.print("No: "+(i+1)+" --> ");
            boolean check = scanner.hasNextInt();
            if(check){
                int input = scanner.nextInt();
                myArray[i]=input;
            }
            
           
            scanner.nextLine();
        }
        return myArray;
    }
    public static double findAverage(int[] array) {
        int sum=0;
        for(int i =0; i<array.length; i++){
            sum+=array[i];
        }
        double average = (double)sum/(double)array.length;
        System.out.println("average :"+average);
        return average;
    }

    
}
