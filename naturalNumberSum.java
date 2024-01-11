public class naturalNumberSum {
    public static void main(String[] args) {
        System.out.println(sumOfNaturalNumber(5));
        
    }
    public static int sumOfNaturalNumber(int n){
        if(n<0){
            return -1;
        }
        int sum=0;
        for(int i=n; i>0; i--){
           sum = sum+i;
        }
        return sum;
    }
}
