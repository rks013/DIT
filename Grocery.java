import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Grocery {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();
    public static void main(String[] args) {
        
        int choice =0;
        boolean quit = false;
        printInstruction();
        while(!quit){
            System.out.print("enter choice :");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice){
                case 0:
                    printInstruction();
                    break;
                case 1:
                    groceryList.printGroceryItem();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    processArrayList();
                    break;
                case 7:
                    quit =true;
                    break;

            }
        }
        
    }
    public static void printInstruction(){
        System.out.println("\nPress");
        System.out.println("press 0: instruction");
        System.out.println("press 1: to print grocery list");
        System.out.println("press 2: to add item");
        System.out.println("press 3: to modify item");
        System.out.println("press 4: to remove item");
        System.out.println("press 5: to search item");
        System.out.println("press 6: to close applicatiion");
    }
    //add item
    public static void addItem(){
        System.out.print("enter the grocery item:");
        String newItem = scanner.nextLine();
        groceryList.addGroceryItem(newItem);
    }
    // modify Item
    public static void modifyItem() {
       /*  System.out.print("enter item number:");
        int itemNo = scanner.nextInt();
        scanner.nextLine(); */
        System.out.print("enter  item to be replace: ");
        String item =scanner.nextLine();
        System.out.print("enter   new item to be added: ");
        String newItem =scanner.nextLine();
        groceryList.modifyGroceryItem(item, newItem);
    }
    //remove Item
    public static void removeItem() {
       /*  System.out.print("enter item number: ");
        int itemNo = scanner.nextInt();
        scanner.nextLine(); */
        System.out.print("enter  item to be removed: ");
        String item =scanner.nextLine();
        groceryList.removeGroceryItem(item);
        
    }
    //search For Item
    public static void searchForItem() {
        System.out.print("enter item to be searched: ");
        String item =scanner.nextLine();
        if(groceryList.searchItem(item) != null){
            System.out.println(item+" : is present in shopping list");

        }
        else{
            System.out.println(item+" : not present in shopping list");

        }
    }
    //Array list
    public static void processArrayList() {
        //copy array list.
        ArrayList<String> newArray = new ArrayList<String>();
        //instead of for loop and fetching ech value use predifined method.
        newArray.addAll(groceryList.getGroceryList());

        //or
        ArrayList<String> nextArray = new ArrayList<String>(groceryList.getGroceryList());
        
        //coverting arraylist to array.
        String[] myArray = new String[groceryList.getGroceryList().size()];
        myArray = groceryList.getGroceryList().toArray(myArray);
        System.out.println("items: "+Arrays.toString(myArray));
    }

}
class GroceryList{
    //creating arrayList.
    private  ArrayList<String> groceryList = new ArrayList<String>();
    //getter
    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    //add items.
    public  void addGroceryItem(String item){
        groceryList.add(item);
    } 
    //print items
    public void printGroceryItem(){
        System.out.println("total item:"+ groceryList.size());//--->gives length.
        for(int i =0; i<groceryList.size(); i++){
            System.out.println("item:"+groceryList.get(i));//---> get value.
        }
    }
    // replace/modify Item
    public  void modifyGroceryItem(String currentItem, String newItem){
        int position = findItem(currentItem);
        if(position >=0){
            modifyGroceryItem(position, newItem);
        }
        else{
            System.out.println("item not found:");
        }


    }
    private  void modifyGroceryItem(int index, String item) {
        groceryList.set(index, item);//---->set at that index.
        System.out.println("grocery item "+(index+1) +" has been modified.");
    }
    // remove Item
    public  void removeGroceryItem(String item){
        int position = findItem(item);
        if(position >=0){
            removeGroceryItem(position);
        }
        else{
            System.out.println("item not found:");
        }
    }
    private  void removeGroceryItem(int index) {
        //String theItem = groceryList.get(index);//--->fetch value
        groceryList.remove(index);//--->remove item.
    }
    //search item.
    public  String searchItem(String  searchItem) {
        boolean exits = groceryList.contains(searchItem);//--->check for item .
        int index = findItem(searchItem);//--->gives index.
        if(index>=0 ){
            return groceryList.get(index); 
        }
        else{
            return null;

        }
    } 
    private  int findItem(String item) {
        return groceryList.indexOf(item);
    }

}