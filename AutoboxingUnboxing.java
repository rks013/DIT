import java.util.ArrayList;
import java.util.Arrays;
public class AutoboxingUnboxing {
    public static void main(String[] args) {
        //creating arraylist of string class.
         ArrayList<String> strList = new ArrayList<String>();

         //for primitive type---> use autoBoxing and unboxing  OR create a class.
        
         Integer intVal = new Integer(54);//intVal-->object of Integer class.
         Double doubleVal = new Double(20.1);

         //autoBoxing-->for iteger value.
         ArrayList<Integer> intList =new ArrayList<Integer>();
            //add int value;
        for(int i=0; i<10;i++){
            intList.add(Integer.valueOf(i));//!---> auto boxing
           //convert int value to object of Integer class(object wrapper)
        } 
        
        //unBoxing--->
            //print
        for(int i=0; i<intList.size();i++){
            System.out.println("value:"+intList.get(i).intValue());//!--->un boxing
            //line24-->getting wrapper object-> convert to base primitive int value. 
        }




        //but java internally impliment this concept.
        Integer newIntVal = 56;//-->java convert internally-->Integer.valueOf(56) 
        int intValue = newIntVal.intValue();
        int intVal2 = newIntVal;
        ArrayList<Integer> newIntList =new ArrayList<Integer>();
        for(int i=0; i<10;i++){
            newIntList.add(i);
         } 
    
        for(int i=0; i<newIntList.size();i++){
            System.out.println("value:"+intList.get(i));
        }
    }
}
