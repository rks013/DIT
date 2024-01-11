public  class sumChallenge{
    public static void main(String[] args) {
        int sum=0;
        for(int i=1; i<=100; i++)
        {
            if(i %3 ==0 && i %5 ==0){
                sum=sum+i;
                System.out.println("divisible by 3 & 5: "+i);
            }
        }
        System.out.println("sum of numbers divisible by 3 & 5 in given range: "+sum);
    }
}