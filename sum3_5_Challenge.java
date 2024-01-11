public class sum3_5_Challenge {
    // to find sum of numbers divisible by 3 & 5 in given range:
    public static void main(String[] args) {
        int sum=0;
        int count=0;
        for(int i=1; i<=1000; i++)
        {
            if(i %3 ==0 && i %5 ==0){
                sum=sum+i;
                count++;
                //System.out.println("divisible by 3 & 5: "+i);
            }
           /*  if(count==5){ //to get 5 such number IF is USED.
                break;
            } */
        }
        System.out.println("sum in given range: "+sum);
        System.out.println("count= "+count);
    }
    
}
