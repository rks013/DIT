public class sumChecker {
    public static void main(String[] args) {
     System.out.println(hasEqualSum(1, 1, 2));   //check
    }
    // pararmeert sum checker
    public static boolean hasEqualSum(int p1, int p2, int p3)
    {
        if((p1+p2)==p3)
        {
            return true;
        }
        return false;
    }
    
}
