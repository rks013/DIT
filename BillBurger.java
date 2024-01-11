
class  Hamburger{//base class
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String addition1Name;
    private String addition2Name;
    private String addition3Name;
    private String addition4Name;

    private double addition1Price;
    private double addition2Price;
    private double addition3Price;
    private double addition4Price;
    
    //cunstructor
    public Hamburger(String name, String meat, double price, String breadRollType ){
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
        System.out.println(name+" hamburger on a "+breadRollType+" roll with "+meat+", price is "+price);

    }
    

    public void addHamburgerAddition1(String name1, double price1){
        System.out.println("Added "+name1+" for an extra "+price1);
        this.addition1Name = name1;
        this.addition1Price = price1;
    }
    public void addHamburgerAddition2(String name2, double price2){
        System.out.println("Added "+name2+" for an extra "+price2);
        this.addition2Name = name2;
        this.addition2Price = price2;
    }
    public void addHamburgerAddition3(String name3, double price3){
        System.out.println("Added "+name3+" for an extra "+price3);
        this.addition3Name = name3;
        this.addition3Price = price3;
    }
    public void addHamburgerAddition4(String name4, double price4){
        System.out.println("Added "+name4+" for an extra "+price4);
        this.addition4Name = name4;
        this.addition4Price = price4;
    }
    //method for calculating price.
    public double itemizeHamburger(){
        return  this.price+this.addition1Price+this.addition2Price+this.addition3Price+this.addition4Price;
        
    }
    
}  

class DeluxeBurger extends Hamburger{
    public DeluxeBurger(){
        super("Deluxe", "Sausage & Bacon", 14.54 , "White");
        super.addHamburgerAddition1("Chips", 2.75);
        super.addHamburgerAddition2("Drink", 1.81);
    }
    @Override
    public void addHamburgerAddition1(String addition1Name, double addition1Price){
        System.out.println("Cannot not add additional items to a deluxe burger ");
    }
    @Override

    public void addHamburgerAddition2(String addition2Name, double addition2Price){
        System.out.println("Cannot not add additional items to a deluxe burger ");
    }
    @Override

    public void addHamburgerAddition3(String addition3Name, double addition3Price){
        System.out.println("Cannot not add additional items to a deluxe burger ");
    }
    @Override

    public void addHamburgerAddition4(String addition4Name, double addition4Price){
        System.out.println("Cannot not add additional items to a deluxe burger ");
    }
    

}   

 class HealthyBurger extends Hamburger{
    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;
    public HealthyBurger(String meat, double price){
        super("HealthyBurger",meat, price, "white");
    }
    public void addHealthyAddition1(String name1, double  price1){
        System.out.println("Added "+name1+" for an extra "+ price1);
        this.healthyExtra1Name = name1;
        this.healthyExtra1Price = price1;

    }
    public void addHealthyAddition2(String name2, double  price2){
        System.out.println("Added "+name2+" for an extra "+ price2);
        this.healthyExtra2Name = name2;
        this.healthyExtra2Price = price2;

    }
   @Override
   public double itemizeHamburger(){
    return  super.itemizeHamburger()+ this.healthyExtra1Price+this.healthyExtra2Price;
    }

 }


public class BillBurger {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition3("Cheese", 1.13);
        System.out.println("Total Burger price is " + hamburger.itemizeHamburger());
        
        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addHamburgerAddition1("Egg", 5.43);
        healthyBurger.addHealthyAddition1("Lentils", 3.41);
        System.out.println("Total Healthy Burger price is  " + healthyBurger.itemizeHamburger());
        
        DeluxeBurger db = new DeluxeBurger();
        db.addHamburgerAddition3("Should not do this", 50.53);
        System.out.println("Total Deluxe Burger price is " + db.itemizeHamburger());
    }
}
