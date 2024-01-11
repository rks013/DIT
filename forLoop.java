public class forLoop {
    public static void main(String[] args) 
    {
        for(int i=0; i<5; i++) //variable crearted in foor loop exists in that code block.
        {
            String variable= "bye bye variable";
            System.out.println(i+" Hello");  //java automatically delete variable once it exit foor loop.
            System.out.println(variable);
        }  //note: advised to USE Indexing(i.e i,j,k).

        System.out.println("**********************");
        for(int i=2; i<9 ; i++)
        {
            System.out.println(i+"% interest on 10,000$: "
            +calculateInterest(10000, i));
        }
        
    }
        
    
    public static double calculateInterest(double amount, double rate)
    {
        double interest = (amount*rate)/100;
        return interest;
    }
     
    //syntax
    /* for(init; termination; increment){
        code;
    } */
}
