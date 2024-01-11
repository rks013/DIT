public class leapYearConvertor {
    public static void main(String[] args) {
        System.out.println(isLeapYear(1700)); //check
        
    }
    public static boolean isLeapYear(int year)
        {
            if(year<1 || year >9999){
                 return false;
            }
            else if(year%4==0)
            {
                if(year%100==0)// if divisible by 100 it must be divisible by 400.
                {
                    if(year%400==0)
                    {
                        return true;
                    }
                }
                else{
                    return true;
                }
            }
            return false;
    
        }
    
    
}
