public class daysInMonth {
    public static void main(String[] args) {
        System.out.println(isLeapYear(2020)); //check
        System.out.println(getDaysInMonth(2, 2020)); //check
        
    }
    //method to check LEAP YEAR.
    public static boolean isLeapYear(int year) 
    {
        if(year <1 || year >9999)
        {
            return false;
        }
        else if (true)
        {
            if(year %4== 0 && year %100 !=0)
            {
                return true;
            }
            else if(year %400==0)
                {
                    return true;
                }
            return false;    

        }
        return false;
    }    
        
      //method to return no. of days  

    public static int getDaysInMonth(int month , int year) {
        if((month <1 || month >12) || (year <1 || year >9999))
        {
            return -1;
        }
        
        else if(true)
        {
            boolean check_leap_year = isLeapYear(year);
            if(check_leap_year)
            {
                switch(month)
                {
                    case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                        return 31;
                        
                    case 4: case 6: case 9: case 11: 
                        return 30; 
                    case 2:
                        return 29;    
                }
            }
            else if(check_leap_year == false)
            {
                switch(month)
                {
                    case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                        return 31;
                        
                    case 4: case 6: case 9: case 11: 
                        return 30; 
                    case 2:
                        return 28;    
                }
            }
            return -1;
        }
        return -1;
        
    }
    
}
