public class sharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(95, 59));
        
    }
    public static boolean hasSharedDigit(int x, int y)
    {
        if((x <10 || x >99)||(y <10 || y >99)){
            return false;
        }
        int lastDigit_x = x%10;
        int lastDigit_y = y%10;
        int firstDigit_x = x/10;
        int firstDigit_y = y/10;
        if(firstDigit_x == firstDigit_y){
            return true;
        }
        else if(firstDigit_x == lastDigit_y){
            return true;
        }
        else if(lastDigit_x == firstDigit_y){
            return true; 
        }
        else if(lastDigit_x == lastDigit_y){
            return true;
        }
        return false;
    }
}
