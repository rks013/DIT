import java.util.ArrayList;
import java.util.ListIterator;
public class linkedList {
    public static void main(String[] args) {
        Customer customer = new Customer("rahul",12.560 );
        Customer anotherCustomer;//pointing to the same class in memory.
        anotherCustomer = customer;
        anotherCustomer.setBalance(56.325);
        System.out.println(customer.getName()+" -->balance:"+customer.getBalance());

        //creating arraylist. 
        ArrayList<Integer> intList = new ArrayList<Integer>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);
        for(int i=0; i< intList.size(); i++){
            System.out.print(intList.get(i)+"  ");
        }
        System.out.println("");

        intList.add(1,5 );
        for(int i=0; i< intList.size(); i++){
            System.out.print(intList.get(i)+"  ");
        }
        //in order to insert value in arrayList , all the remaining value has to move down .
        //it can slow down the processin time in acse of million record-->bcz-->java has to alter larger number of record.
        //lly--> for removing item-->remaining item has to be moved up.
        //!here use oF LINKED LIST IS USEFUL.(alternative to arrays)
        //!linkedList--> each item hold the actual value as well as store the link of next item in the list.

        //creating linkList
        //!-->another file
    }

    public ListIterator<Song> listIterator() {
        return null;
    }


}        
class Customer{
    private String name;
    private double balance;
    //cunstructor
    public Customer(String name, double balance){
        this.balance = balance;
        this.name = name;
    }
    //getters

    public String getName() {
        return this.name;
    }

  
    public void setName(String name) {
        this.name = name;
    }

   
    public double getBalance() {
        return this.balance;
    }

   
    public void setBalance(double balance) {
        this.balance = balance;
    }
    

}