public class factorPrinter {
    public static void main(String[] args) {
        printFactors(10);
    }
    public static void printFactors(int num) {
        if(num < 1){
            System.out.println("Invalid value");
        }
        for(int i=1; i< (num+1); i++)
        {
            if(num %i ==0){
                System.out.println(i);
            }
        }
    }
    
}
