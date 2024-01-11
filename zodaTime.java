import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.*;
public class zodaTime {

    public static void main(String[] args) {
        //zoda time API.
        //contain immutable class object.
        //class: localDate.
        //this is the new API.
        LocalDate ld = LocalDate.now();
        System.out.println(ld);//print local date.
        LocalDate ld1 = LocalDate.now(Clock.systemDefaultZone());//create object by using LocalDate.now() method.
        //we don't use new keyword to create an object.
        System.out.println(ld1);//print local date.

        LocalDate ld2 = LocalDate.of(2000, Month.FEBRUARY, 29);//create date of specific value.
        System.out.println(ld2);

        LocalDate ld3 = ld2.plusMonths(6);
        System.out.println(ld3);//print new date 6 months added to it.

        //some other method
        System.out.println(ld3.isAfter(ld2));

        //local time class: ->it is also immutable.
        LocalTime lt = LocalTime.now();
        System.out.println(lt);//print local time.
        LocalTime lt1 = lt.minusHours(3);
        System.out.println(lt1);//print local time with 3 hour substracted fro it.

        //combine class: -> localDateTime.
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);//print local date & local time.


    
    }
}
