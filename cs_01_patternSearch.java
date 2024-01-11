import java.util.Scanner;

class patternSearch {
    public static void main(String[] args) {
        /*str =12.5318 */
        /*str ="geeks for geeks" */
        Scanner sc = new Scanner(System.in);
        System.out.println("enter txt");
        String txt = sc.nextLine();
        System.out.println("enter pattern to be searched:");
        String pattern = sc.nextLine();
        patternSearching(txt, pattern);
        
        System.out.println("enter a floating point number");
        String decimaTxt = sc.nextLine();
        patternAfterDecimal(decimaTxt);
        System.out.println("good bye...");

    }
    public static void patternSearching(String txt, String pattern ){
        int position = txt.indexOf(pattern);
        while(position>=0){
            System.out.println("pattern pos:"+position);
            position =txt.indexOf(pattern, position+1);
        }
    }
    public static void patternAfterDecimal(String decimalTxt){
        int position = decimalTxt.indexOf(".");
        System.out.println("Number after decimal: "+decimalTxt.substring(position+1));
    }
}