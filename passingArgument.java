public class passingArgument {
    public static void main(String[] args) {
        int x= 5;
        fun(x);
        System.out.println("x ="+x);
    }
    public static void fun(int x) {
        x=x+5;
    }
}
