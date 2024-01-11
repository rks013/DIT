/**
 * code
 */
import java.util.*;
class Car {
    private int door;
    private String name;
    private String model;

    public void display(String model)
    {
        this.model = model;
        System.out.println(model);
    }
        
}

public class code {

   public static void main(String[] args) {
       int sum=11;
       double avg= 11.0/3.0;
       avg=Math.round(avg);
       //int average =(int) avg;
       System.out.println(avg);
       Car tata = new Car();
       tata.display("renault");
       
       
   } 
}