public class  flourPack {
    public static void main(String[] args) {
        System.out.println(canPack(0,5,4));
        
    }
    
    public static boolean canPack(int bigCount, int smallCount, int goal)
    {
        if(bigCount <0 || smallCount <0){
            return false;
        }
        //LOGIC-> (5kg bag* its count)+(1kg bag*its count) (SHOOULD BE EQUAL TO)==GOAL. 

        for(int i=0; i<=(bigCount); i++){ 
            for(int j=0; j<=(smallCount); j++){
                if((5*i)+j == goal){
                    return true;
                }
            }
        }
        return false;
    }
}
