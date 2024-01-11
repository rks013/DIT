
class MyArray<T>
{
 /*    private int val;
    private T obj; //type is generic (T)
    //setters
    public void setData(int val,T value){
        this.val = val;
        obj = value;
    }
    //getters
    public T getData(){
        return obj;
    }
    */

    T Arr[] =(T[]) new Object[10];
    int len = 0;
    public void append(T val){
        Arr[len] = val;
        len++;
    } 

    public void display(){
        for(int  i=0;i<len;i++){
            System.out.println(Arr[i]);
       }
    }

    
}


public class GenericDemo_1 {
    public static void main(String[] args) {
        @SuppressWarnings("unchecked")
        MyArray<String> ma =  new MyArray();
        ma.append("hello");
        ma.append("java");
        ma.append("bye...");

        ma.display();
        System.out.println("****");
        show(ma);
    }
    public static void show(MyArray<?> obj){ //it is wild card.-->any type.
        //same as passing MyArray as a argument.
        obj.display();
    }
}
