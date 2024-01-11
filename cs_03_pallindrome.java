import java.util.Scanner;
class pallindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter txt:");
        String txt = sc.nextLine();
        /*creating method */
        System.out.println(checkPallindrome(txt));
    }
    public static boolean checkPallindrome(String txt){
        int startPtr = 0;
        int lastPtr = txt.length()-1;
        while( startPtr < lastPtr){
            if(txt.charAt(startPtr)!=txt.charAt(lastPtr)){
                return false;
            }
            startPtr++;
            lastPtr--;
        }
        return true;
    }
}
