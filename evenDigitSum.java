public class evenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456));
        
    }
    public static int getEvenDigitSum(int number)
    {
        int sum=0;
        if(number <0){
            return -1;
        } 
        while(number >0)
        {
            int digit =number%10;
            if(digit %2== 0){
                sum=sum+digit;
            }
            number /=10;
        } 
        return sum; 
    }
    
}
