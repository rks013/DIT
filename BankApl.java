import java.util.ArrayList;
import java.util.Scanner;
public class BankApl{
    public static void main(String[] args) {
        Bank bank = new Bank("national bank of india");
        bank.addBranch("Adelaide");
        bank.addCustomer("Adelaide", "tim", 58.25);
        bank.addCustomer("Adelaide", "mike", 175.34);
        bank.addCustomer("Adelaide", "percy", 220.12);

        bank.addBranch("sydney");
        bank.addCustomer("sydney", "bob", 150.24);

        bank.addCustomerTran("Adelaide", "tim", 44.22);
        bank.addCustomerTran("Adelaide", "tim", 12.56);
        bank.addCustomerTran("Adelaide", "mike", 1.65);

        bank.print("Adelaide", true);
    }
}
 class Bank{
    private static Scanner scanner = new Scanner(System.in);
    private String bankname;
    private ArrayList<Branch> branchList ;

        //constructor
    public Bank(String bankname){
        this.bankname = bankname;
        this.branchList = new ArrayList<Branch>();
    }
    //add branch
    public  void addBranch(String branchName) {
        if(findBranch(branchName)!=null){
            System.out.println("Branch with name "+branchName+" exist");
        }
        else{
            this.branchList.add(new Branch(branchName));
            System.out.println("branch successfully added:");

        }
    }
    //print
    public void printBranch() {
        for(int i =0; i<this.branchList.size(); i++){
            Branch branch = this.branchList.get(i);
            System.out.println("name:"+branch.getbranchName());
            branch.printCustomer();
        }
    }
    //find branch
    public Branch findBranch(String branchName) {
        for(int i =0; i<this.branchList.size(); i++){
            Branch branch = this.branchList.get(i);
            if(branch.getbranchName().equals(branchName)){
                return this.branchList.get(i);
            }
        }
        return null;
    }
    
    //add
    public void addCustomer() {
        System.out.println("enter branch name");
        String inputBranch = scanner.nextLine();
        System.out.print("enter name: ");
        String input = scanner.nextLine();
        System.out.print("enter tran: ");
        double inputTran =scanner.nextDouble();
        scanner.nextLine();
        Customer customer = Customer.createCustomer(input, inputTran);
        Branch newbranch = new Branch(inputBranch);
        newbranch.addCust(customer);
    }
    //overloaded method.
    public void addCustomer(String branchName , String customerName, double transaction) {
        Customer customer = Customer.createCustomer(customerName, transaction);
        Branch newbranch = new Branch(branchName);
        newbranch.addCust(customer);
    }
    //add transaction.
    public void addCustomerTran(String branchName , String customerName, double transaction) {
        if(findBranch(branchName)!=null){
            int indexOfBranch  = this.branchList.indexOf(branchName);
            Customer customer = this.branchList.get(indexOfBranch).queryCustomer(customerName);
            if(customer !=null){
                customer.addTran(transaction);
            }
        }
        else{
            System.out.println("error generated...");
        }
    }
    public void addCustomerTran() {
        System.out.print("enter branch name:");
        String inputBranchName= scanner.nextLine();
        if(findBranch(inputBranchName)!=null){
            int indexOfBranch  = this.branchList.indexOf(inputBranchName);
            System.out.print("enter name: ");
            String inputName = scanner.nextLine();
            Customer customer = this.branchList.get(indexOfBranch).queryCustomer(inputName);
            if(customer !=null){
                System.out.println("enter new transaction:");
                Double newTran = scanner.nextDouble();
                scanner.nextLine();
                customer.addTran(newTran);
            }
        }
        else{
            System.out.println("error generated...");
        }
    }
    //print
    public void print(String branchName ,boolean check) {
        if(check){
            Branch branch = findBranch(branchName);
            if(branch!=null){
                branch.printCustomer();
            }
            else{
                System.out.println("enter valid branch name:");
            }
        }
        return;
    }
}
class Branch{
    private String branchName;
    private ArrayList<Customer> customerList ;
    //cuntructor.
    public Branch(String branchName) {
        this.branchName = branchName;
        this.customerList = new ArrayList<Customer>();
    }
    //getter
    public String getbranchName() {
        return this.branchName;
    }
    public ArrayList<Customer> getCustomerList(){
        return this.customerList;
    }
    //method to add customer object to customer ArrayList.
    public  void addCust(Customer customer) {
        this.customerList.add(customer);
    }
    //print
    public void printCustomer() {
        for(int i =0; i<this.customerList.size(); i++){
            Customer customer = customerList.get(i);
            System.out.println(customer.getName()+" -->"+customer.gettran().toString());
        }
    }
    //query
    public String queryCustomer(Customer customer) {
        int indexPosition =findCustomer(customer);
        if(indexPosition>=0){
            return customer.getName();
        }
        return null;
    }
    //query
    public Customer queryCustomer(String name) {
        int indexPosition =findCustomer(name);
        if(indexPosition>=0){
            return this.customerList.get(indexPosition);
        }
        return null;
    }
    //find customer
    private int findCustomer(Customer customer) {
        return customerList.indexOf(customer);
    }
    private int findCustomer(String name){
        for(int i=0; i<this.customerList.size(); i++){
            Customer customer = this.customerList.get(i);
            if(customer.getName().equals(name)){
                return i;
            }
        }
        return -1;
    }
}
class Customer{
    private String customerName;
    private ArrayList<Double> transactionList;
    //constructor.
    public Customer(String customerName ,double transaction){
        this.customerName = customerName;
        this.transactionList = new ArrayList<Double>();
        this.transactionList.add(transaction);
    }
    //getters
    public String getName() {
        return this.customerName;
    }
    public Double[] gettran() {
        Double[] tranSlip = new Double[this.transactionList.size()];
        for(int i=0; i<this.transactionList.size(); i++){ 
            tranSlip[i]=this.transactionList.get(i);
        }
        return tranSlip;
    }
    //create object.
    public static Customer createCustomer(String customerName,  double transaction) {
        return new Customer(customerName, transaction);
    }
    //add transaction
    public void addTran(double transaction) {
        this.transactionList.add(transaction);
    }
}