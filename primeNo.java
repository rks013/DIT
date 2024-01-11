public class primeNo {
    public static void main(String[] args) {
        //With the help of METHODS ONLY.
        System.out.println(countPrimeNumber(10, 50));   //check;
        
        //DIRRECT APPORACH
        int count= 0;
        for(int i=10 ; i<50; i++){
            if(isPrime(i)){
                count++;
            }
        }
        System.out.println("no. of prime no is "+count);    
    }
    public static boolean isPrime(int num) // method for prime no.
    {
        if(num==1){ //validation
            return false;
        }
        else if(num>0){
            for(int i=2; i<(num-1); i++)
            {
                if(num % i==0) {
                    return false;
                }
            }
            return true;
        }
        return false;
        
    }
    
    public static int countPrimeNumber(int first, int last)//range via parameters
    {
        int count=0;
        for(int i=first; i<(last+1); i++)
        {
            boolean result= isPrime(i);
            if(result){
                count+=1;
            }
        }
        return count;        
    }
    
}
