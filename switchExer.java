
import java.util.*;
public class switchExer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int x,y,choice;
            int result;
            System.out.println("enter two number:");
            x= sc.nextInt();
            y= sc.nextInt();
            sc.nextLine();
            printInstruction();
            choice= sc.nextInt();
            switch(choice)
            {
                case 0: 
                    result=x+y;   
                    System.out.println("addtion:"+result);
                    break;
                case 1:
                    result=x-y;   
                    System.out.println("subtraction:"+result);
                    break;
                case 2:
                    result=x*y;   
                    System.out.println("multiplication:"+result);
                    break;
                case 3:
                    result=x/y;   
                    System.out.println("division:"+result);
                    break;
                case 4:
                    break;
                default:
                    break;    
            }
            sc.close();
        }
    public static void printInstruction() {
        System.out.println("\n press");
        System.out.println("0: to add ");
        System.out.println("1: to subtract ");
        System.out.println("2: to multiply");
        System.out.println("3: to divide");
        System.out.println("4: to quit");

    }
}
