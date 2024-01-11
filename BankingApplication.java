import java.util.ArrayList;
public class BankingApplication {
    public static void main(String[] args) {
        Bank bank = new Bank("national bank of india");
        bank.addBranch("Adelaide");
        bank.addCustomer("Adelaide", "tim", 58.25);
        bank.addCustomer("Adelaide", "mike", 175.34);
        bank.addCustomer("Adelaide", "percy", 220.12);

        bank.addBranch("sydney");
        bank.addCustomer("sydney", "bob", 150.24);

        bank.addCustomerTransaction("Adelaide", "tim", 44.22);
        bank.addCustomerTransaction("Adelaide", "tim", 12.56);
        bank.addCustomerTransaction("Adelaide", "mike", 1.65);

        bank.listcustomer("Adelaide", true);
    }
}


class Bank{
    private String name;
    private ArrayList<Branch> branchList ;

        //constructor
    public Bank(String name){
        this.name = name;
        this.branchList = new ArrayList<Branch>();
    }
    //add branch
    public  boolean addBranch(String branchName) {
        if(findBranch(branchName)!=null){
            System.out.println("Branch with name "+branchName+" exist");
            return false;
        }
        else{
            this.branchList.add(new Branch(branchName));
            System.out.println("branch successfully added:");
            return true;
        }
    }
    //find branch
    public Branch findBranch(String branchName) {
        for(int i =0; i<this.branchList.size(); i++){
            Branch branch = this.branchList.get(i);
            if(branch.getbranchName().equals(branchName)){
                return branch;
            }
        }
        return null;
    }
    
    
  
    public boolean addCustomer(String branchName , String customerName, double amount) {
        Branch branch =findBranch(branchName);
        if(branch!=null){
            return branch.newCustomer(customerName, amount);
        }
        return false;
    }
    //add transaction.
    public boolean addCustomerTransaction(String branchName , String customerName, double amount) {
        Branch branch =findBranch(branchName);

        if(branch!=null){
            return branch.addCustomerTransaction(customerName, amount);
        }
        return false;
    }
    public boolean listcustomer(String branchName, boolean showTransaction){
        Branch branch = findBranch(branchName);
        if(branch!=null){
            System.out.println("customer of branch"+branch.getbranchName());
            ArrayList<Customer> branchCustomers = branch.getCustomerList();
            for(int i =0; i< branchCustomers.size();i++){
                Customer customer =branchCustomers.get(i);
                System.out.println("["+(i+1)+" ]"+customer.getName());
                if(showTransaction){
                    System.out.println("transaction:");
                    ArrayList<Double> customerTransaction =customer.getTransaction();
                    for(int j=0; j<customerTransaction.size();j++){
                        double transaction = customerTransaction.get(j);
                        System.out.println("["+(j+1)+" ]"+transaction);
                        
                    }
                   
                }
            }
            return true;
        }
        else{
            return false;
        }
    }
    

}    
   
class Branch{
    private String name;
    private ArrayList<Customer> customerList ;
    //cuntructor.
    public Branch(String name) {
        this.name = name;
        this.customerList = new ArrayList<Customer>();
    }
    //getter
    public String getbranchName() {
        return this.name;
    }
    public ArrayList<Customer> getCustomerList(){
        return this.customerList;
    }
    //method to add customer object to customer ArrayList.
    public  boolean newCustomer(String customerName, double amount) {
        if(findCustomer(name)==null){
            this.customerList.add(new Customer(customerName, amount));
            return true;
        }
        return false;
    }
    //add transcation amount
    public boolean addCustomerTransaction(String customerName, double amount) {
        Customer existingCustomer = findCustomer(customerName);
        if(existingCustomer!= null){
            existingCustomer.addTranaction(amount);
            return true;
        }
        return false;
    }
   
  
    //find customer
    private int findCustomer(Customer customer) {
        return customerList.indexOf(customer);
    }
    private Customer findCustomer(String name){
        for(int i=0; i<this.customerList.size(); i++){
            Customer customer = this.customerList.get(i);
            if(customer.getName().equals(name)){
                return customer;
            }
        }
        return null;
    }
}
class Customer{
    private String customerName;
    private ArrayList<Double> transactionList;
    //constructor.
    public Customer(String customerName ,double amount){
        this.customerName = customerName;
        this.transactionList = new ArrayList<Double>();
        this.transactionList.add(amount);
    }
    //getters
    public String getName() {
        return this.customerName;
    }
    public ArrayList<Double> getTransaction() {
       return this.transactionList;
    }
    /* //create object.
    public static Customer createCustomer(String customerName,  double transaction) {
        return new Customer(customerName, transaction);
    } */
    //add transaction
    public void addTranaction(double amount) {
        this.transactionList.add(amount);
    }
}
