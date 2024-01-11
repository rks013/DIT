public class bonusChallenge {
    public static void main(String[] args) {
        System.out.println(getDurationString(65,45)); //check
        System.out.println(getDurationString(3945));
        
    }
    // changing the formate of the output.
    
    public static String getDurationString(int minutes, int second )
    {
        if(minutes <0 || (second <0 || second >59))  //validation of parameters
        {
            return "Invalid input";
        }
        
        int hour = minutes/60;
        int remaining_minutes=minutes %60;

        String hour_string = hour + "h";
        if(hour <10)
        {
            hour_string = "0"+hour+"h";
        }

        String minute_string = remaining_minutes + "m";
        if(remaining_minutes <10)
        {
            minute_string = "0"+remaining_minutes+"m";
        }

        String second_string = second + "s";
        if(second <10)
        {
            second_string = "0"+second+"s";
        }

        return hour_string +" "+minute_string+" "+second_string;
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
