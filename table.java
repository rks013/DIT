import java.util.*;
public class table {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int num; 
       System.out.println("enter a number");
       num = sc.nextInt();
       for(int i =1;i<=20;i++){
            System.out.println(num+"x"+i+"="+num*i);
       }
    }
}
