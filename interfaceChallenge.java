import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.text.html.ListView;

public class interfaceChallenge {
   public static Scanner scanner = new Scanner(System.in); 
    public static void main(String[] args) {
        ISavable player;
        player = new player("bolt", 20, 100);
        savedObject(player);
        System.out.println(player.toString());
        loadObject(player);
        System.out.println(player.toString());;

    }
    //read value method.
    public static ArrayList<String> readValue(){
        ArrayList<String> values = new ArrayList<String>();
        boolean quit =false;
        int index= 0;
        System.out.println("0: to quit\n1: to enter values");
        while(!quit){
            System.out.println("enter choice:");
            int action = scanner.nextInt();
            scanner.nextLine();
            switch(action){
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("enter value:");
                    String input = scanner.nextLine();
                    
                    values.add(index, input);        //adding with index number.
                    index++;
                    break;
                default:
                    quit =true;
                    break;
            }
        }
        return values;
    }
    //passing interface as parameter.

    public static void savedObject(ISavable objectTOSave){
        //to show object is saving.
        for(int i =0; i<objectTOSave.write().size(); i++){
            System.out.println("saving :"+objectTOSave.write().get(i)+" to storage.");
        }
    }
    public static void loadObject(ISavable objectTOLoad){
        ArrayList<String> values = readValue();
        objectTOLoad.read(values);
    }

} 

interface ISavable{
    //to allow object to be store.
     List<String> write();
     void read(List<String> values);
} 
class player implements ISavable{
    private String name;
    private int hitPoint;
    private int health;
    //cunstructor.
    public player(String name, int hitPoint, int health){
        this.name = name ; 
        this.hitPoint =hitPoint;
        this.health = health;
    }
    //getters.
    public String getName(){
        return this.name;
    }
    public int getHitPiont(){
        return this.hitPoint;
    }
    public int getHealth(){
        return this.health;
    }
    //setters
    public void setName(String newName){
        this.name = newName;
    }
    public void setHitPiont(int hitPoint){
        this.hitPoint = hitPoint;
    }
    public void setHealth(int health){
         this.health =health ;
    }
    @Override
    public String toString() {
        return "player name:"+this.name+" Hit Points="+this.hitPoint+" Health= "+this.health;
    }


    public List<String> write(){
        List<String> values = new ArrayList<String>();
        values.add(0, this.name);
        values.add(1, ""+this.hitPoint);//convert to String
        values.add(2, ""+this.health);
        return values;
    }
    public void read(List<String> savedValue){
        //check codition for list. and saving current value for fields.
        if(savedValue!= null && savedValue.size()>0){
            this.name = savedValue.get(0);
            this.hitPoint = Integer.parseInt(savedValue.get(1));
            this.health = Integer.parseInt(savedValue.get(2));

        }
    }
}
