public class pattern {
    public static void main(String[] args) {
        pattern();
    }
    public static void pattern()
    {   int count=0;
        for(int i=1; i<=12; i++){
            for(int j=11; j>=count; j--){
                System.out.print(j);
            }
            System.out.println();
            count++;
        }
        
    }
    
}
