public class unicode {
   public static void main(String[] args) {
        //with the ascii value we can print the alphabet.
        
        for(char ch=65 ; ch<=90;ch++){
            System.out.print(ch+" ");

        }
        System.out.println("****");
        //unicode value
        for(char ch=0x0900 ; ch<=0x0970;ch++){
            System.out.print(ch+" ");

        }
   } 
}
