import java.util.Scanner;
import java.util.*;
public class pureString{
    public static void main(String[] args) {
        String a ="abcd";
        String b ="cdef";
        String sum = a+b;
        char check;
        System.out.println(sum);
        int count ;
         for(int i=0; i<sum.length();i++){
            check = sum.charAt(i);
            count=0;
            for(int j=0; j<sum.length(); j++){
                
                if(check== sum.charAt(j));
                count++;
            }
            if(count>1 && check!=2){
                System.out.println(check);
            }
            
        } 
    }
}