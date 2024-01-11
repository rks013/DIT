import javax.print.attribute.standard.QueuedJobCount;

public class digitsSum {
    public static void main(String[] args) {
        System.out.println(sumDigits(325));
        System.out.println(new_sumDigits(325));
        //LOGIC->325->325/1=325%10=5; 325/10=32%10=2; 325/100=3%10=3;
        
    }
    public static int sumDigits(int num) 
    {
        if(num <10 ){
            return -1;
        }
        int count= 1;
        int digit_sum = 0;
        while(true){
            int digit = num/(count);
            digit = digit % 10;
            digit_sum= digit_sum+digit;
            count=count*10;
            if(digit ==0){
                break;
            }
           // System.out.println("each step digit sum: "+digit_sum);

        }
        return digit_sum; 
    }
    public static int new_sumDigits(int num) {
        if(num <10 ){
            return -1;
        }

        int digit_sum = 0;
        while(num >0){
            //extract least significant digit.
            int digit= num%10;
            digit_sum= digit_sum+digit;
            //drop least significant digit.
            num= num/10;
        }
        return digit_sum;
        
    }
    
}
