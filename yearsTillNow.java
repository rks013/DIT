import java.time.LocalDate;
import java.util.*;

public class yearsTillNow {
    public static void main(String[] args) {
        long millSec = System.currentTimeMillis();
        System.out.println(millSec);
        int yearsTillNow = (int)((((millSec/1000)/60)/60)/24)/365;//converting into years.
        System.out.println("years till now= "+yearsTillNow);

        //date class.
        Date d  = new Date();
        System.out.println("today's date: "+d);//print current date and time.
        //working based on : System.currentTimeMillis.
        System.out.println("********");
        System.out.println(new Date(System.currentTimeMillis()));
        //many method is present->check it out.
        

        //create object of any date: -> by passing into the constructor.
        Date any = new Date("13/8/1998");
        System.out.println("detail of any date: "+any);
        System.out.println(("***"));
        

    }
}
