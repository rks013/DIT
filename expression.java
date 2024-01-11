public class expression {
    public static void main(String args[]) {
        int num=50*78+10 ;//statement.
        // ; ->its a terminator. Tells java that "it is end of the line"
        
        // multiple statement possible in java
        int num2=50;System.out.println("num is "+ num2);

        //whitespace
        int   space_num
        =
        100
        ;       //java ignore whitespace.

        /**identation
         * to look code more effective.(to easily verify the flow)
         */

         //code block
         int score=51;
         int level_completed=8
         int bonus=100;
         boolean game_over=true;
         if(game_over){
             int final_score = score+(level_completed*bonus);//final_score can't be accessed outside this code block.
             System.out.println("final score is "+ final_score);
         }
         //once code block is executed, java automatically delete the variable inside code block.
         int final_score=987654321;//creating variable with same name outside the code block.
         System.out.println("same variable name but outside the scope of if statement:"+ final_score);
         
         
    }
    
}
