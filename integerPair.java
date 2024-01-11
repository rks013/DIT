import java.util.Scanner;

public class integerPair {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for(int i= 0; i<5; i++){
            System.out.println("enter x= ");
            int x = scanner.nextInt();
            System.out.println("enter y= ");
            int y = scanner.nextInt();
            if(y==0){
                System.out.println("for y =0 division not allowed");
                continue;
            }
            System.out.println("x/y = "+x/y);
        }
        scanner.close();
    }
}
