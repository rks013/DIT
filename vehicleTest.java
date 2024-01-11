import javax.management.remote.SubjectDelegationPermission;

class Vehicle{ //base class.
    private String name;
    private int currentVelocity;
    private int curentDirection;
    //counstructor.
    public Vehicle(String name, int currentVelocity, int curentDirection){
        this.name = name;
        this.curentDirection = 0;
        this.currentVelocity = 0;
    }

    //getters and setters.
    public String getName() {
        return name;
    }
    public int getCurrentVelocity() {
        return currentVelocity;
    }
    public int getCurentDirection() {
        return curentDirection;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setCurrentVelocity(int currentVelocity) {
        this.currentVelocity = currentVelocity;
    }
    public void setCurentDirection(int curentDirection) {
        this.curentDirection = curentDirection;
    }

    //some methods.
    public void move(int speed, int direction) {
        this.currentVelocity = speed;
        this.curentDirection = direction;
        System.out.println("vechicle moving at "+speed+"kmph in the direction of "+direction+"degree.");
    }
    public void stop() {
        this.currentVelocity = 0;
    }
}
class Car extends Vehicle{
    private int gear;
    public Car(String name, int currentVelocity, int curentDirection, int gear){
        super(name,0,0);
        this.gear = 1; 
    }
    
    public void handSteering() {
        System.out.println("handSteerig() method called. Car have hand steering.");
    }
    public void changeGear(int gear) {
        this.gear = gear;
        System.out.println("changingGear() method called. This car is at "+gear+" gears.");
    }

}
class SpecialCar extends Car{
    public SpecialCar(){
        this("Q8",0,0);
    }
    public SpecialCar(String name, int currentVelocity, int curentDirection) {
        super(name,0,0,0);
    }
    public void accelerate(int rate) {
        int newSpeed = getCurrentVelocity() + rate;
        if(newSpeed == 0){
            stop();
        }
        else if(newSpeed >0 && newSpeed <=50){
            changeGear(1);
        }
        else if(newSpeed >50 && newSpeed <=100){
            changeGear(2);
        }
        else if(newSpeed >100 && newSpeed <=150){
            changeGear(3);
        }
        else if(newSpeed >150 && newSpeed <=200){
            changeGear(4);
        }
        else if(newSpeed >200 && newSpeed <=250){
            changeGear(5);
        }
        else if(newSpeed >250 ){
            changeGear(6);
        }
        if(newSpeed >0){
            move(newSpeed,getCurentDirection());
        }
        
    }
   
}

public class vehicleTest {  
    public static void main(String[] args) {
        SpecialCar audi = new SpecialCar();
        audi.changeGear(6);
        System.out.println(audi.getCurrentVelocity());
        //audi.move(150,90);
        //System.out.println(audi.getCurrentVelocity());
        audi.handSteering();
        audi.accelerate(70);
        System.out.println(audi.getCurrentVelocity());
        
    }




}
