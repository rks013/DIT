public class minuteYearConvertor {
    public static void main(String[] args) {
        printYearsAndDays(561600);
        
    }
    public static void printYearsAndDays(long minute)
    {
        if(minute <0)
        {
            System.out.println("Invalid Value");
        }
        long hour = minute/60; 
        //to get minute then we use remiainig_minute and store remainder in it for above operation.
        long days = hour/(24);
        long year = days/365;
        long remaining_days = days%365;
       // System.out.println("hour: "+hour);
       // System.out.println("days: "+days);
        
        
        System.out.println(minute+" min = "+year+" y and "+remaining_days+" d");
    }
}
