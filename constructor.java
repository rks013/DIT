class Bank{
    private String accountNumber;
    private int balance;
    private String name;
    //contructor :-> to initialize object.
    public Bank( ){
        //special use of this.
        this("99", 0 , "Default");//this keyword :->calling another constructor inside a contructor.
        System.out.println("Bank constructor is called.");
    }
    public Bank(String accountNumber, int balance, String name){
        System.out.println("Bank constructor with parameter is called.");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
    }
    
    public void setAccountNumber(String number) {
        this.accountNumber = number;
    }
    public void setBalance(int number) {
        this.balance = number;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }
    public int getBalance() {
        return this.balance ;
    }
    public String getName() {
        return this.name;
    }

    public void depositFund(int number){
        System.out.println("deposited amount: "+number);
        this.balance = this.balance+number;
        System.out.println("New Balance is: "+this.balance+" $");
    }
    public void deductFund(int number){
        if(number > this.balance){
            System.out.print("withdrawal amount: "+number+" $");
            System.out.println(" only "+this.balance+"is available. No withdrawal possible.");
            
        }
        else{
            System.out.println("withdrawal amount: "+number);
            this.balance = (this.balance - number);
            System.out.println("New balance is: "+this.balance );
        }
    }
    
}
//challenge.*******creating a class as per given in chllenge*********

class VipCustomer{
    private String name;
    private double creditLimit;
    private String email;

    public VipCustomer(){
        this("default", 5000.0, "default@email.com");
    }
    public VipCustomer(String name, double creditLimit){
        this(name, creditLimit, "unknown@email.com");
    }

    public VipCustomer(String name, double creditLimit, String email){
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName(){
        return this.name;
    }
    public double getCreditLimit(){
        return this.creditLimit;
    }
    public String getEmail(){
        return this.email;
    }


}

public class constructor {
    public static void main(String[] args) {
        Bank person1 = new Bank();
        Bank person2 = new Bank("456987", 5000, "tom" );
        //System.out.println(person1.getBalance());
       // person1.deductFund(500);
        System.out.println(person2.getBalance());
        System.out.println(person2.getName());
        System.out.println(person1.getName());

        VipCustomer person3 = new VipCustomer("adam", 500000);
        System.out.println(person3.getEmail());
    }
    
}
