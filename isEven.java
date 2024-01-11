public class isEven {
    public static void main(String[] args) {
        //System.out.println(isEven(12));//check
        int num_start=1;
        int num_end=10;
        int count=0;
        while(num_start <= num_end){
            if(isEven(num_start)){
                System.out.println("even: "+num_start);
                count++;
            }
            num_start++;
        }
        System.out.println("even count: "+count);

         num_start=1;
         num_end=10;
         count=0;
        while(num_start <= num_end){
            if(!isEven(num_start)){
                System.out.println("odd: "+num_start);
                count++;
            }
            num_start++;
        }
        System.out.println("odd count: "+count);

    }
    public static boolean isEven(int num)
    {
        if(num <=0){
            return false;
        }
        else if(num %2 ==0){
            return true;
        }
        return false;
        
    }
    
}
