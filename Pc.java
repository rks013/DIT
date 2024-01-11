class Motherboard{
    private String model;
    private String manufacture;
    private int ramSlot;
    private int cardSlot;
    //cunstructor
    public Motherboard(String model, String manufacture, int ramSlot,int cardSlot){
        this.model = model;
        this.manufacture = manufacture;
        this.ramSlot = ramSlot;
        this.cardSlot = cardSlot;
    }
    public void loadprogram(String program) {
        System.out.println(program+" program is loaded");
    }
    //geters
    
    public String getModel() {
        return this.model;
    }
   
    public String getManufacture() {
        return this.manufacture;
    }

    public int getRamSlot() {
        return this.ramSlot;
    }

    public int getCardSlot() {
        return this.cardSlot;
    }
    
    
}
class Monitor{ //MONITOR HAS A RESOLUTION.--->composition 
    private String model;
    private String manufacture;
    private int size;
    private Resolution nativeResolution; //Resolution is a class.
    //constructor.
    public Monitor(String model, String manufacture, int size,Resolution nativeResolution){
        this.model = model;
        this.manufacture = manufacture;
        this.size = size;
        this.nativeResolution = nativeResolution;
    }
    //a public method.
    public void drawPixelAt(int x, int y, String Color) {
        System.out.println("draw pixel at "+x+" ,"+y+" position in color "+Color);
        
    }
    //!getters.

    public String getModel() {
        return this.model;
    }
   
    public String getManufacture() {
        return this.manufacture;
    }
    public int getSize() {
        return this.size;
    }
    public Resolution getNativeResolution() {
        return this.nativeResolution;
    }   
}
class Resolution{
    private int width;
    private int height;
    private int depth;
    //constructor.
    public Resolution(int width, int height, int depth){
        this.width = width;
        this.height = height;
        this.depth= depth;
    }
    //!getters
    public int getWidth() {
        return this.width;
    }
    public int getHeight() {
        return this.height;
    }
    public int getDepth() {
        return this.depth;
    }
}
class Case{ //case has dimension.
    private String model;
    private String powerSuply;
    private Dimension dimension;
    //cunstructors.
    public Case(String model,  String powerSuply, Dimension dimension ){
        this.model = model;
        this.powerSuply = powerSuply;
        this.dimension = dimension;
    }
    public void pressPowerButtom() {
        System.out.println("power buttom pressed");
    }
    //!getters
    public String getModel() {
        return this.model;
    }
    public String getPowerSuply() {
        return this.powerSuply;
    }
   

}
class Dimension{
    private int width;
    private int height;
    //constructor.
    public  Dimension(int width, int height){
        this.width = width;
        this.height = height;
    }
    //!getters
    public int getWidth() {
        return this.width;
    }
    public int getHeight() {
        return this.height;
    }
   
}
//create a class comprise of motherboard, monitor, & case.
//composition.-> Has-A relationship.
//pc has a case,motherboard, monitor.
public class Pc {
    private Motherboard motherboard;
    private Monitor monitor;
    private Case thecase;
    //constructor.
    public Pc( Motherboard motherboard,  Monitor monitor, Case thecase){//!accept 3 diff. objects.
        this.motherboard = motherboard;
        this.monitor = monitor;
        this.thecase = thecase;
    }
    //!getters
    public Motherboard getMotherboard() {
        return this.motherboard; //motherboard is a object.
    }
    public Monitor getMonitor(){
        return this.monitor;
    }
    public Case getCase() {
        return this.thecase;
    }
    public void PowerUp(){
        thecase.pressPowerButtom();
        motherboard.loadprogram("linux");
        monitor.drawPixelAt(1500, 30, "Yellow");
    }

    
    //!main method.
    public static void main(String[] args) {
        //create a new variable of  Dimension class.
          Dimension dimension = new Dimension(12, 16);
        Case thecase = new Case("2280E", "220", dimension);

        //create a new variable of Resolution class.
          Resolution nativeResolution = new Resolution(14, 16, 2);
        Monitor theMonitor = new Monitor("221T", "Dell", 16, nativeResolution);
        Motherboard theMotherboard = new Motherboard("4596fz", "asus", 4, 6);

        Pc thePc = new Pc(theMotherboard, theMonitor, thecase);//object of Pc class.
        //accessing method.
        thePc.getMonitor().drawPixelAt(500, 60, "Red");
        thePc.getMotherboard().loadprogram("windows");
        thePc.getCase().pressPowerButtom();
        System.out.println(thePc.getMonitor().getManufacture());
        
        thePc.PowerUp();


    }
}
