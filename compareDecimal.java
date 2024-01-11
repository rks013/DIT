public class compareDecimal {
    public static void main(String[] args)
    {
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176)); //check.
    }
    public static boolean areEqualByThreeDecimalPlaces(double x, double y)
    {
        double x1=x*1000;
        double y1=y*1000;
        int integet_x = (int) x1;  // use of casting.
        int integet_y = (int) y1;  //compairing  upto 3 places of decimal.
        if(integet_x==integet_y){
            return true;
        }
        return false;
        

    }
    
}
