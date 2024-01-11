public class secondMinutes {
    public static void main(String[] args) {
        //nOTE: advised to USE LONG datatype.
        
        System.out.println(getDurationString(65,45)); //check
        System.out.println(getDurationString(3945));
    }
    public static String getDurationString(int minutes, int second )
    {
        if(minutes <0 || (second <0 || second >59))  //validation of parameters
        {
            return "Invalid input";
        }
        //maths behind.
        /* int Tot_second= (minutes*60)+second; 
        int hour = Tot_second/3600;
        int remaining_minutes = (Tot_second %3600)/60; 
        int remaining_second = (Tot_second %3600)%60;
        return hour+"h "+remaining_minutes+"m "+remaining_second+"s" ; */
        int hour = minutes/60;
        int remaining_minutes=minutes %60;
        return hour+"h "+remaining_minutes+"m "+second+"s";

    }
    public static String getDurationString(int second )
    {
        if(second <0)
        {
            return "Invalid value" ;
        }
        int minutes=second/60;
        int remaining_second=second%60;
        return getDurationString(minutes, remaining_second);

    }

    
    
}
