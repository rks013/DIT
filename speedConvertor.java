public class speedConvertor {
    public static void main(String[] args) {
           
            
        
    }
    public static long toMilesPerHour(double kilometersPerHour)
    {
    
        if(kilometersPerHour>=0){
            double milesPerHour =  ( kilometersPerHour/1.609); 
            long converted_value =(long) Math.round( milesPerHour);
            return  converted_value;
        }
       
        return -1;
    }
    public static void printConversion(double kilometersPerHour)
    {
                if(kilometersPerHour >=0){
                 System.out.println(kilometersPerHour + " km/h = "+ toMilesPerHour(kilometersPerHour)+ " mi/h" );
                }
                else{
                    System.out.println("Invalid Value");
                }
    }
    
}
