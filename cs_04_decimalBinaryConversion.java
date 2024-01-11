import java.util.Scanner;

class decimalBinaryConversion {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter Decimal Number:");
        int num = sc.nextInt();
        /*creating method */
        System.out.println("Binary formate :"+decimalToBinaryConversion(num));

    }
    public static String decimalToBinaryConversion(int num){
        String decimalTxt = " ";
        if(num==0){
            return "000";
        }
        while(num>0){
            int remainder = num%2;
            decimalTxt = remainder+decimalTxt;//adding everytime remainder in front of  decimalTxt variables.
            num=num/2;
        }
        return decimalTxt;
        
    }
}
