public class sumOdd {
    public static void main(String[] args) {
        System.out.println(sumOdd(1, 1));
        
    }
    public static boolean isOdd(int number)
    {
        if(number<=0){
            return false;
        }
        else if(number %2 ==0){
            return false;
        }
        return true;   
    }
    public static int sumOdd(int start, int end)
    {
        int sum = 0;
        int count=0;
        if((end < start)||(end < 0)||(start <0)){
            return -1;
        }
        
        for(int i=start; i<(end+1); i++){
            if(isOdd(i)){
                sum=sum+i;
                count++;
            }
        }
        return sum;
       
    }
    
}
