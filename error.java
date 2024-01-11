

public class error {
    public static void main(String[] args)throws NegativeDimensionException {
        System.out.println("Hello, World!");
        
        int area= area(50,-5);
        System.out.println("answer:"+area);
    }
    public static int area(int l, int b)throws NegativeDimensionException
    {
        if(l<0||b<0){
            throw new NegativeDimensionException();
        }
        int  area = l*b;
        return area;
    } 
     
}
class  NegativeDimensionException extends Exception{
    public String toString(){
       return "dimension cannot be NEGATIVE............"; 
    }
}