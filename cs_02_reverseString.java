import java.util.Scanner;

class reverseString {
    public static void main(String [] arg){
        /*str = GEEKS 
         * output = SKEEG
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("enter txt:");
        String txt = sc.nextLine();
        /**create function */
        reverseString(txt);//calling it.
    }
    public static void reverseString(String txt){
        int ptr =txt.length()-1;//create pointer that points to the last element of txt.
        String reverseTxt=" ";//creating null string.
        while(ptr>=0){
            reverseTxt += txt.charAt(ptr);
            ptr--;
        }
        System.out.println("reverse txt :"+reverseTxt);
    }

    //here:->PALLINDROME STRING can also be checked by simply adding one if-else statement in main method.
}
