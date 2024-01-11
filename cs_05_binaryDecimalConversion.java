 import java.util.Scanner;
 class binaryDecimalConversion {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter binary Number:");
    String binaryNum = sc.nextLine();
    /*creating method */
    binaryToDecimalConversion(binaryNum);
 }   
 public static void binaryToDecimalConversion(String binaryNum){
    int count =1;
    int decimalNum =0;
    for(int i=binaryNum.length()-1; i>=0; i--){
        decimalNum = decimalNum+(((binaryNum.charAt(i)) - '0')*count);
        count = count*2;
        /* converting last character into integer then multiplying with 2's power 
           and then performing addition. 
        */
    }
    System.out.println("decimal number: "+ decimalNum);
 }
}
