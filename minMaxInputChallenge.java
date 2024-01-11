import java.util.Scanner;

public class minMaxInputChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE ;
        int max = Integer.MIN_VALUE ;
        
        while(true){
            System.out.println("enter number: ");
            boolean isAnInt = scanner.hasNextInt();//check int
            if(isAnInt){
                //read input.
                int input = scanner.nextInt();
                if(input < min){
                    min = input;
                }
                 if(input > max){
                    max = input;
                }
            }
            else{
                break;
            }
            scanner.nextLine();
        }
        System.out.println("minimum : "+min+" and maximum : "+max);

        scanner.close();
    }
    
}
