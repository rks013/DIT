import java.math.BigInteger;
import java.util.Scanner;

class bigInteger { //! Immutable classes:values can't be changed.
    public static void main(String[] args) {
        System.out.println("hello..BigInteger");
        BigInteger a = new BigInteger("33333333333333463465666464");//in this constructor :pass String that contain integer value.
        BigInteger b =  BigInteger.valueOf(32l);//in this constructor : pass long value(within range)
        //operations.
        BigInteger p = a.multiply(new BigInteger("2"));//here another object is created that needs to be referenced.
        System.out.println("a= "+a); 
        System.out.println("p="+p);
        //finding inverse modulas .
        BigInteger c = new BigInteger("27");
        BigInteger modInverseVariable = c.modInverse(new BigInteger("392"));
        System.out.println("modulas inverse :-> 27^-1 % 392 = "+modInverseVariable);
        System.out.println("next probable prime no:"+c.nextProbablePrime());//predefined method of this class.

        //factorial of a number using BigInteger.
        Scanner sc = new Scanner (System.in);
        System.out.println("finding Factorial.");
        System.out.println("enter num: ");
        int num = sc.nextInt();
        System.out.println("factorial = "+fact(num));


    }
    public static BigInteger fact(int num){
        BigInteger count = new BigInteger("1");
        for(int i=num; i>0;i--){
            count = count.multiply(BigInteger.valueOf(i));//valueOf() is static method so no new keyword required..
        }
        return count;
    }
}
