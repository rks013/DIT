import java.util.Scanner;

public class inputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();

        
    }
    public static void inputThenPrintSumAndAverage()
    {
        int sum=0;
        double count=0;
        double avg;
        Scanner scanner = new Scanner(System.in);
        while(true){
            //System.out.println("enter number: ");
            boolean isAnInt = scanner.hasNextInt();
            if(isAnInt){
                int input = scanner.nextInt();
                sum =sum+input;
                count++;
            }
            else{
                break;
            }
            scanner.nextLine();
        }
        scanner.close();
        if(count !=0){
            avg=sum/(count);
            avg=Math.round(avg);
            int average = (int) avg;
            System.out.println("SUM = "+sum+" AVG = "+average);
        }
        else{
            System.out.println("SUM = 0 AVG = 0");
        }
    }
    
}
