class GenericData<T>//generic class for storing object of any type.
{
    private int val;
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
   
}

public class GenericDemoo
{
    @SuppressWarnings("unchecked")

    public static void main(String[] args) throws Exception {
        
       //create object of the class-->specifying type.
       GenericData<String> gd = new GenericData<>(); 
       gd.setData(123,"heloo");
       System.out.println(gd.getData());

      
    }
}
