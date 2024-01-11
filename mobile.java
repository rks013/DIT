import java.util.ArrayList;
import java.util.Scanner;

public class mobile {
    public static void main(String[] args) {
        MobilePhone moto = new MobilePhone();
        moto.addcontact();
        System.out.println("---------");
        moto.print();
        System.out.println("---------");

        moto.addcontact();
        System.out.println("---------");

        moto.print();
        System.out.println("---------");

        moto.removeContact();
        System.out.println("---------");
        
        moto.print();
        System.out.println("---------");

        moto.addcontact();
        System.out.println("---------");

        moto.modifyContact();
        System.out.println("---------");

        moto.print();
        
    }
    
}
class MobilePhone{
    private static Scanner scanner =new Scanner(System.in);
    private static Contacts contactInfo = new Contacts();
    //print
    public static void print() {
        contactInfo.printContact();
    }
    //add
    public static void addcontact(){
        System.out.print("enter name: ");
        String inputName = scanner.nextLine();
        System.out.print("enter phone number: ");
        String inputPhoneNo = scanner.nextLine();
        contactInfo.addContact(inputName, inputPhoneNo);
    }
    //remove
    public static void removeContact() {
        System.out.print("enter contact name or contact phone number to be removed: ");
        String inputInfo = scanner.nextLine();
        contactInfo.removeContact(inputInfo);
    }
    //modify
    public static void modifyContact() {
        System.out.println("enter current name to be replaced :");
        String currentName = scanner.nextLine();
        System.out.println("enter new name to be replaced :");
        String newName = scanner.nextLine();
        contactInfo.modifyName(currentName, newName);

        System.out.println("enter current phone number to be replaced :");
        String currentPhoneNo = scanner.nextLine();
        System.out.println("enter new phone number to be replaced :");
        String newPhoneNo = scanner.nextLine();
        contactInfo.modifyPhoneNo(currentPhoneNo, newPhoneNo);

    }
}
class Contacts{
    private ArrayList<String> contactName =new ArrayList<String>();
    private ArrayList<String> contactPhoneNo =new ArrayList<String>();

    private String name;
    private String phoneNo;
    //print
    public void printContact() {
        System.out.println("total contacts: "+contactName.size());
        for(int i=0; i<contactName.size(); i++){
            System.out.print("  "+contactName.get(i));
        }
        for(int i=0; i<contactPhoneNo.size(); i++){
            System.out.print("  "+contactPhoneNo.get(i));
        }
        System.out.println("");
    }

    //add contacts.
    public void addContact(String name, String phoneNo) {
        contactName.add(name);
        contactPhoneNo.add(phoneNo);
        System.out.println("contact successfully added:");
    }
    //remove contacts.
    public void removeContact(String info ) {
       // user has freedom to give either name or phone number so as to delete contacts.
        int indexName =findName(info);
        int indexPhone = findphoneNo(info);
        if(indexName>=0 || indexPhone>=0){
            removeContacts(indexName, indexPhone);
            System.out.println("contacts deleted: ");
        }
        else{
            System.out.println("contacts not found");
        }
    }
    private void removeContacts(int index1, int index2){
        //if index1 is +ve then cosider it for removal else consider index2.
        if(index1>=0 ){
            contactName.remove(index1);
            contactPhoneNo.remove(index1);

        }
        else if(index2>=0){
            contactName.remove(index2);
            contactPhoneNo.remove(index2);

        }
    }
    //modify contacts.
    public void modifyName(String currentName, String newName){
        int indexName =findName(currentName);
        if(indexName>=0 ){
            modifyName(indexName,newName);
            System.out.println("contacts name updated: ");
        }
        else{
            System.out.println("contacts not found: ");
        }
    }
    public void modifyPhoneNo(String currentPhoneNo, String newPhoneNo){
        int indexPhone = findphoneNo(currentPhoneNo);
        if( indexPhone>=0){
            modifyPhoneNo(indexPhone, newPhoneNo);
            System.out.println("contacts phone number updated: ");
        }
        else{
            System.out.println("contacts not found: ");
        }
    }
    private void modifyName(int index, String element){
        contactName.set(index, element);
    }
    private void modifyPhoneNo(int index, String element){
        contactPhoneNo.set(index, element);
    }
    private int findName(String name) {
        return contactName.indexOf(name);
    }
    private int findphoneNo(String phoneNo) {
        return contactPhoneNo.indexOf(phoneNo);
    }


}