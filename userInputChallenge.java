import java.util.Scanner;

public class userInputChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum=0;
        int order=1;

        while(true){
            System.out.println("enter number #"+order+":");
            boolean isAnInt = scanner.hasNextInt(); // this method return if it is int in console.
            if(isAnInt){
                int input = scanner.nextInt();//read input only it is int
                sum=sum+input;
                order++;
                if(order >10){
                    break;
                }
            }else{
                System.out.println("invalid number");
            }
           scanner.nextLine(); //to handle the enter key.
        }
        System.out.println(sum);

        scanner.close();
    }
       
    
}
