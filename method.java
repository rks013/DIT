public class method {
    public static void main(String args[]) {  //main method
        boolean game_over=true;
        int score=50;
        int level_completed=8;
        int bonus=100;
        
        //calling of a method
       calculated_score(game_over, score, level_completed, bonus);//Actual argument.
        
        //Just write values of formal parameters.(other formate) 
        
         calculated_score(true, 500, 8,100);
    }
    //defining method with return type
    public static int calculated_score(boolean game_over, int score, int level_completed, int bonus)// formal parameter define.
    {
        //JAVA automatically create variables which are in parameter.
        // It deletes afterward.
        if(game_over){
            int final_score = score+(level_completed*bonus);
            System.out.println("final score : "+ final_score);
            return final_score;
        }
        return -1;
        // 0R , WITH help of else statement.
       /**
        * else{
            return -1;
        }
        */
        

        //we need to address all components of program, else it will give error.
        
    } 
       
}
