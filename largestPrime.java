public class largestPrime {
    public static void main(String[] args) {
       // System.out.println(isPrime(1));
        System.out.println(getLargestPrimeNo(45));
        
    }
    public static int getLargestPrime(int number)
    {
        if(number <0){
            return -1;
        }
        ;
        int checker=1;
        for(int i=1; i<(number+1); i++){
            if(number %i ==0){
                // i will be factor.
                if(isPrime(i)){
                    checker=i;
                }
            }
        }
        if(checker==1){
            return -1;
        }
        return checker;    
    }
    public static boolean isPrime(int num)
    {
        if(num <=1){
            return false;
        }
        for(int i=2 ; i<(num); i++)
        {
            if(num %i==0){
                return false;
            }
        }
        return true;   
    }
    public static int getLargestPrimeNo(int number)
    {
        if(number <2){
            return -1;
        }
        
        for(int i=2; i<(number); i++){
            if(number %i ==0){
                number =number/i;
                i--;
            }
        }
        return number;   
    }
    
}
