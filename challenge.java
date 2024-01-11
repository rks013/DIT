public class challenge {
    
    public static void main(String args[]){
       // 1. QUES. ON OPERATOR CHALLENGE
       double x1 = 20d;
       double x2 = 80d;
       double x3=(x1+x2)*100.00;//operator precidence 
       double x4= x3%40.00;
       System.out.println("ans: "+ x4);
       boolean isCheck= x4==0? true:false;
       System.out.println(isCheck);
       if(!isCheck){
           System.out.println("got some remainder");
       }  

       // Q2. ON METHOD
       int score, position;
        score=1500;
        position=calculateHighScorePosition(score);
        displayHighScorePosition("Bolt", position);

        score=900;
        position=calculateHighScorePosition(score);
        displayHighScorePosition("Don", position);

        score=400;
        position=calculateHighScorePosition(score);
        displayHighScorePosition("Lee", position);

        score=40;
        position=calculateHighScorePosition(score);
        displayHighScorePosition("Adam", position);

    }
    public static void displayHighScorePosition(String name, int position) {
        System.out.println( name+ " managed to get into position "+ position+ " on the high score table.");
        
    }
    public static int calculateHighScorePosition(int score) {
       /*  
        if(score>=1000){
            return 1;
        }
        else if(score>=500){
            return 2;
        }
        else if(score>=100 ){
            return 3;
        }
       return 4;
         */
         
        int position=4; // assuming position is 4.
        if(score>=1000){
            position= 1;
        }
        else if(score>=500){
            position= 2;
        }
        else if(score>=100 ){
            position= 3;
        }
        
         return position;
        

    }
   
}
