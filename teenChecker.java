public class teenChecker {
    public static void main(String[] args) {
        System.out.println(hasTeen(9,99,19)); //check
        
    }
    public static boolean hasTeen(int p1, int p2, int p3)
    {
        if((p1 >=13 && p1 <=19)|| (p2 >=13 && p2 <=19) || (p3 >=13 && p3 <=19))
        {
            return true;
        }
        return false;
    
    }
    public static boolean isTeen(int age)
    {
        if(age >=13 && age <=19)
        {
            return true;
        }
        return false;
    }
}
