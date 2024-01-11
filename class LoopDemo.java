class LoopDemo{
    public static void main(String [] args) {

         int var = 2;

         for ( int i=1; i<=10; i++){
            System.out.println(var +"*"+i+"="+(var*i) );
         }
         for ( int i=1; i<=20; i++){
            System.out.println("printing table of " +i);
            for ( int j=1;j<10;j++){
                System.out.println(i +"*"+j+"="+(i*j) );
            }
            System.out.println("***********************" );
         }

    }
}

       for(i=1;i<=10;i++){
        for (j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println("");    
       } 

