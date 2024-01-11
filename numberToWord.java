import javax.sound.sampled.SourceDataLine;

public class numberToWord {
    public static void main(String[] args) {
        numberToWords(10);
        System.out.println(reverse(1500));;
        System.out.println(getDigitCount(1500));
        
    }
    public static void numberToWords(int number)
    {
        if(number < 0){
            System.out.println("Invalid Value");
        }
        int test_num= number;
        int test_reverse_num = reverse(number);
        number= reverse(number);
        while(number >=0){
            int lastDigit= number%10;
            switch(lastDigit)
            {
                case 0:
                    System.out.println("ZERO");
                    break;
                case 1:
                    System.out.println("ONE");
                    break;
                case 2:
                    System.out.println("TWO");
                    break;
                case 3:
                    System.out.println("THREE");
                    break;
                case 4:
                    System.out.println("FOUR");
                    break;
                case 5:
                    System.out.println("FIVE");
                    break;
                case 6:
                    System.out.println("SIX");
                    break;
                case 7:
                    System.out.println("SEVEN");
                    break;
                case 8:
                    System.out.println("EIGHT");
                    break;
                case 9:
                    System.out.println("NINE");
                    break;    
            }
            number= number/10;
            if(number==0){
                break;
            }
        }
        int test1= getDigitCount(test_num);
        int test2= getDigitCount(test_reverse_num);
        int range=(test1- test2);
        if(test1 != test2)
        {
            for(int i=0; i<(range); i++){
                System.out.println("ZERO");
            }
        }
        
    }

    public static int reverse(int number)
    {
        int reverse=0;
        while(true)
        {
            int lastDigit= number%10;
            reverse=(reverse*10)+lastDigit;
            number = number/10;
            if(number ==0){
                break;
            }
        }
        return reverse;   
    }

    public static int getDigitCount(int number)
    {
        if(number < 0){
            return -1;
        }
        int count_digit=0;
        while(true)
        {
            int digit= number%10;
            count_digit++;
            number= number/10;
            if(number ==0){
                break;
            }
        }
        return count_digit;
        
    }
}
