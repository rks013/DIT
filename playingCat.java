public class playingCat {
    public static void main(String[] args) {
        System.out.println(isCatPlaying(false,35)); //check
        
    }
    public static boolean isCatPlaying(boolean summer , int temperature)
    {
        if(summer == true)
        {
            if(temperature <25 || temperature >45)
            {
                return false;
            }
            return true;
        }
        else if(summer == false)
        {
            if(temperature <25 || temperature >35)
            {
                return false;
            }
            return true;
        }
        return false;
    }
        
}
