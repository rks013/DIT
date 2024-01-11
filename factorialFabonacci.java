public class factorialFabonacci {
    public static void main(String[] args) {
        fabonacci(10);
        System.out.println(factorial(5));
        
    }
    public static int factorial(int number) {
        if(number<0){
            return -1;
        }
        else if(number == 0){
            return 1;
        }
        int counter = 1;
        for(int i=number; i>1; i--){
           counter = counter*i;
        }
        return counter;
    }
    public static void fabonacci(int number) {
        int counter = 2;
        int x1 = 0;
        int x2 = 1;
        int x3;
        System.out.println(x1);
        System.out.println(x2);
        while(true){
            counter++;
            x3=x2+x1;
            System.out.println(x3);
            x1 = x2;
            x2=x3;
            if(counter>number){
                break;
            }
        }
    }        
          
        
        
}
    

