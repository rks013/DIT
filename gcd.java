public class gcd {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(26,13));
        
    }
    public static int getGreatestCommonDivisor(int first, int second)
    {
        if(first <10 || second <10){
            return -1;
        }
       int common_factor=1; 
       int min= Math.min(first, second);
       for(int i=2; i<(min+1); i++)
       {
           if(first %i==0 && second %i==0)
           {
             common_factor=i; 
           }
       } 
       return common_factor;
    }
    
}
