public class barkingDog {
    public static void main(String[] args) {
        boolean result=shouldWakeUp(true, -1);//check
        System.out.println(result);
        
    }
    public static boolean shouldWakeUp(boolean barking, int hourOfDay)
    {
        if(barking==true)
        {
            if(hourOfDay<0 || hourOfDay>23)
            {
                return false;
            }
            else if(hourOfDay<8 || hourOfDay>22)
            {
                return true;
            }
            return false;
        }
        return false;

    }
    
}
