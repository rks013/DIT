public class palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-222));
       // 121
    }
    public static boolean isPalindrome(int num)
    {
        int test_num=num;
        int reverse=0;
        if(num >0)
        {
            while(num> 0){
                int lastDigit= num%10;
                reverse= (reverse*10) +lastDigit;
                num=num/10; 
             }
             System.out.println(reverse);
             if(test_num == reverse){
                 return true;
             }
             return false; 
        }
        else{
            while(num <0){
                int lastDigit= num%10;
                reverse= (reverse*10) +lastDigit;
                num=num/10; 
             }
             System.out.println(reverse);
             if(test_num == reverse){
                 return true;
             }
             return false; 
        }
    }
}
