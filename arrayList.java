import java.util.ArrayList;
//code will not run.
//some basic understanding.

public class arrayList {
    //arrayList is a class that can hold object.
    private int[] array= new int[5] ;

    public static ArrayList<String> variableName = new ArrayList<String>(); //type of object to store.
    //                                        !empty constructor.

    //method to add items
    public static void addItem(String item){
        //call a method that is apart of a arrayList class.
        variableName.add(item);}

    public static void printItem(){
        //a call to predefined method.:  variableName.size()
        System.out.println("total item:"+ variableName.size());//--->gives length.
        for(int i =0; i<variableName.size(); i++){
            System.out.println("item:"+variableName.get(i));
                //call to predefined method :variableName.get(index)---> get value.
        }
    }                
        
    public static void replaceItem(int index, String item) {
        //call a predefined method: variableName.set(index, element)---->set at that index.
        variableName.set(index, item);
    }
    public static void removeItem(int index) {
        //call a predefined method:
        String item = variableName.get(index);//--->fetch value
        variableName.remove(index);//--->remove item.
    }
    public static void searchItem(String  item) {
        //call a predefined method:
        boolean exits = variableName.contains(item);//--->check for item & return boolean value.
        int index = variableName.indexOf(item);//--->gives index.
        if(exits ){
            System.out.println("present");
        }
        else{
            System.out.println("absent");
        }
    }
    public static void main(String[] args) {

        variableName.addItem("milk");
        /* variableName.addItem("bread");
        variableName.addItem("eggs");
        variableName.printItem();
        variableName.searchItem("eggs"); */


    }
    
}
