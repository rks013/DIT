class MethodDemo{
    static void add(int a, int b){
        System.out.println(a+"+"+b+"="+(a+b));
    }
    static void sub(int a ,int b){
        System.out.println(a+"-"+b+"="+(a-b));
    }
    public static void main(String []args){
        add(10,20);
        sub(10,20);
    }
}