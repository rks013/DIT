import java.util.Scanner;

public class sumOfNatural {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a natural number:");
        int input = scanner.nextInt();
        int sum = 0;
        if(input >0){
            
            for(int i=1; i<=input; i++){
                sum=sum+i;
            }
            System.out.println("sum of "+input+" natural no. = "+sum);
        }
        else{
            System.out.println("invalid input");
        }
        scanner.close();
    }

    /*direct use formula
     * sum= (n*(n+1))/2;
     */
}
