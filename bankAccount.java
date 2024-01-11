class Bank{
    private String accountNumber;
    private int balance;
    private String name;
    private String phoneNumber;
    private String email;
    
    public void setaccountNumber(String number) {
        this.accountNumber = number;
    }
    public void setBalance(int number) {
        this.balance = number;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPhoneNumber(String number) {
        this.phoneNumber = number;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getaccountNumber() {
        return this.accountNumber;
    }
    public int getBalance() {
        return this.balance ;
    }
    public String getName(String name) {
        return this.name;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }
    public String getEmail() {
        return this.email ;
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

public class bankAccount {
    public static void main(String[] args) {
        Bank person1 = new Bank();
        //person1.setBalance(1000); 
       // System.out.println(person1.getBalance()); 
        //person1.deductFund(500);
        System.out.println(person1.getBalance());
        person1.deductFund(500);
        person1.getBalance();

    }
    
}
