import java.util.ArrayList;
import java.util.Scanner;
public class challengeMobile {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone moto = new MobilePhone("g6");
    public static void main(String[] args) {
        mobileSytemOn();
        printInstruction();
        boolean quit = false;
        while(!quit){
            System.out.println("enter choice");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice){
                case 0:
                    printInstruction();
                    break;
                case 1:
                    add();
                    break;
                case 2:
                    print();
                    break;
                case 3:
                    delete();
                    break;
                case 4:
                    update();
                    break;
                case 5:
                    quit =true;
                    break;
                default:
                    quit=true;

            }
        }

        
    }
    //extra method
    private static void mobileSytemOn() {
        System.out.println("PROCESSING");
        System.out.println("Good to Go----->");
    }
    private static void printInstruction(){
        System.out.println("\nPress");
        System.out.println("press 0: instruction");
        System.out.println("press 1: to add contact");
        System.out.println("press 2: to print contact");
        System.out.println("press 3: to delete contact");
        System.out.println("press 4: to modify contact");
        System.out.println("press 5: to close applicatiion");
    } 
    //add contact
    private static void add() {
        System.out.print("enter name:  ");
        String inputName= scanner.nextLine();
        System.out.print("enter phone no:  ");
        String inputphone= scanner.nextLine();
        //creating object of contact class
        //creating object of contact class
        Contact newContact = Contact.createContact(inputName, inputphone);
        
        moto.addContact(newContact);
    }
    //delete
    private static void delete() {
        System.out.print("enter name:  ");
        String inputName= scanner.nextLine();
        Contact presentContact = moto.queryContact(inputName);
        if(presentContact !=null){
            moto.delete(presentContact);
        }
        else{
            System.out.println("error in deletion . Enter correct name: ");
        }
    }
    // modify
    private static void update() {
        System.out.print("enter existing contact name:  ");
        String inputName= scanner.nextLine();
        Contact oldContact = moto.queryContact(inputName);
        if(oldContact !=null){
            System.out.print("enter new name:  ");
            String inputNewName= scanner.nextLine();
            System.out.print("enter phone no:  ");
            String inputNewPhone= scanner.nextLine();
            Contact newContact = Contact.createContact(inputNewName, inputNewPhone);
            moto.modify(oldContact, newContact);
        }
        else{
            System.out.println("error in updation");
        }

    }
    //print
    private static void print() {
        moto.print();
    }
    

}
class MobilePhone{
    private String model;
    private ArrayList<Contact> myContact; //arraylist holding object of Contact class.
    //cunstructor.--->object of String class and Contact class.
    public MobilePhone(String model) {
        this.model = model;
        this.myContact = new ArrayList<Contact>();
    }
    //add
    public void addContact(Contact contact) {
        if(findContact(contact.getName())>=0){
            System.out.println("contact already exist: ");
            return;
        }
        this.myContact.add(contact);
        System.out.println("succesfully added:");

    }
    //delete
    public void delete(Contact contact) {
        String name = contact.getName();
        int indexPosition = findContact(contact);
        if(indexPosition<0){
            System.out.println(name+" was not find:");
 
        }
        else{
            this.myContact.remove(indexPosition);
            System.out.println(contact.getName()+" was deleted.");
        }

    }
    //modify
    public void modify(Contact oldContact, Contact newContact) {
        //getting index of Contact object to be replaced
        int indexPosition = findContact(oldContact);//if Contact object  present in arraylist.--> set function is used for arraylist

        
        if(indexPosition<0){
            System.out.println(oldContact.getName()+" was not find:");
        }
        else{
            this.myContact.set(indexPosition, newContact);
            System.out.println("contact updated:");
        }
    }
    //print
    public void print() {
        for(int i =0; i< this.myContact.size(); i++){
            Contact contact = this.myContact.get(i);
            System.out.println(contact.getName()+"  -->  "+contact.getPhoneNo());
        }
    }
    //query---->method to return contact name attribute when Contact object is passed as parameter.
    public String queryContact(Contact contact) {
        int index =findContact(contact);
        if(index>=0){    //means contact object is [present in arrayList.
            return contact.getName();
        }
        return null;

    }//query---->method to return Contact object when name attribute is [passed].
    public Contact queryContact(String checkName) {
        int index = findContact(checkName);
        if(index>=0){ //means checkName is present in arrayList.
            return this.myContact.get(index);
        }
        return null;
    }
    //find
    private int findContact(Contact contact) {
        //gives index value in arraylist.
        int index = this.myContact.indexOf(contact);
        return index;
    }
    //find with given name.
    
        
    private int findContact(String contactName) {
        //traversal in arrayList
        for(int i=0; i<this.myContact.size(); i++){
            Contact contact = this.myContact.get(i);//storing 1 contact each time
            if(contact.getName().equals(contactName) ){
                return i;
            }
        }
        return -1;
    }

}
class Contact{
    private String name;
    private String phoneNo;
    //cunstructor
    public Contact(String name, String phoneNo){
        this.name = name;
        this.phoneNo = phoneNo;
    }
    //getters
    public  String getName() {
        return this.name;
    }
    public String getPhoneNo() {
        return this.phoneNo;
    }

    public static Contact createContact(String name, String phoneNo) {
        //ca;lling cuntructor to create object.
        return new Contact(name, phoneNo);
    }
}
