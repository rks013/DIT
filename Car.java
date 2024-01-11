
import java.util.*;
//nOTE:String is also a class.
public class Car { // its a blueprint.
    private int door;
    private String name;
    private String model;// these  are templets.

    public void setModle(String model){ //SETTERS.
         //benifits :->can do validation.
         String validModel = model.toLowerCase();
         if(validModel.equals("carrera")|| validModel.equals("911")){
             this.model = model;
         }
         else{
             this.model = "unknown";
         }
    }
    public String getModel(){ //GETTERS.
        return this.model;
    }


    public void display()
    {
        System.out.println(this.model);
    }
        
}

/* public class Car {

   public static void main(String[] args) {
       Suv tata = new Suv(); //object is created based on the templets.
       tata.display("renault");
       System.out.println("hi");
   } 
} */