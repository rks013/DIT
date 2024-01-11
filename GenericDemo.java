class GenericData<T>//generic class for storing object of any type.
{
    private T obj; //type is generic (T)
    //setters
    public void setData(T value){
        obj = value;
    }
    //getters
    public T getData(){
        return obj;
    }
}




 

public class GenericDemo<T> //classshould be made generic.

{
    //crete generic type array(gta).
    T[] data =(T[]) new Object[3]; 
    public static void main(String[] args) {
        
       //create object of the class-->specifying type.
       GenericDemo<String> gd = new GenericDemo<>(); //now gta data: is of type String.
       gd.data[0]="hello";
       gd.data[1]="india";
       gd.data[2]="only str type";
       for(int  i=0;i<3;i++){
            System.out.println(gd.data[i]);
       }
    }
}

