import java.util.*;
public class calenderDemo {
    public static void main(String[] args) {
        GregorianCalendar gc = new GregorianCalendar();
        System.out.println(gc.get(Calendar.DATE));
        System.out.println(gc.get(Calendar.DAY_OF_WEEK));

        //class timezone.
        TimeZone tz = gc.getTimeZone();//with the help of GregorianCalendar class we can create it.
        System.out.println("timezone: "+tz); 
        System.out.println("DisplayName:"+tz.getDisplayName());   
        
        
    }
}
