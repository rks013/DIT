public class fabonaci {
    public static void main(String[] args) {
        int a =0;
        int b = 1;
        int num=15;//user input can also be  possible.
        System.out.print(a+",");
        System.out.print(b+",");
        for(int i=0;i<num-2;i++)
        {
           int c=a+b;
           System.out.print(c+",");
           a=b;
           b=c;
           
        }
       }
       
}
