public class firstLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(-12345));
        
    }
    public static int sumFirstAndLastDigit(int num)
    {
        int sum=0;
        int lastDigit= num % 10;
        sum=sum+lastDigit;
        while(true){  
            int digit=num%10;
            num=num/10;
           // System.out.println(digit);
            if(num==0){
                sum=sum+digit;
                break;
            }
            
        }
        return sum;
        
    }
}
