public class whileLoop {
    public static void main(String[] args) {
        //insteed of looping to certain no. of times, we loop till certain expression evaluates false. 
        //while loop is  good to use in such cases.
        // cases such as-> which we don't know how many times we need to loop.
        
        //syntax:
        int count=1;
        while(count != 5){ // enter while code block until expression is true.
            System.out.println(count);
            count++;
        }
        System.out.println("********************"); 
        //OR
        count=1;
        while(true){
            if(count==5){
                break;
            }
            System.out.println(count);
            count++;
        }
        System.out.println("*************** ");

        // do while ststement;
        // do while guarentee to execute  one time.

        //syntax
        count=1;
        do{
            System.out.println(count);
            count++;
        }while(count !=5);
    }
    
}
