import java.util.*;

public class demoLinkedList {
   public static void main(String[] args) {
      //defining Linkedlist
      LinkedList<String> visitPlaces= new LinkedList<String>();//similar to Arraylist.
      addInOder(visitPlaces, "banhalore");
      addInOder(visitPlaces, "kerela");
      addInOder(visitPlaces, "dehradun");
      addInOder(visitPlaces, "gujrat");
      addInOder(visitPlaces, "bihar");


      visit(visitPlaces);

      //visitPlaces.add("Hp");
      //visitPlaces.add("kerela");
      print(visitPlaces);
      System.out.println(".......");

   }   
   //print 
    private static void print(LinkedList<String> linkedList) {
      Iterator<String> i = linkedList.iterator();//similar to for loop
      while(i.hasNext()){  //is there another entry.
         String place = i.next();  //moving to the next entry.
         System.out.println(place);
      }
   }
   private static boolean addInOder(LinkedList<String> linkedList, String newPlace){
      ListIterator<String> i = linkedList.listIterator();
      while(i.hasNext()){
         int comparison = i.next().compareTo(newPlace);
         if(comparison==0){
            // item ==new item-->eg-->america==america.
            //not add
            System.out.println(newPlace+" is alredy in list.");
            return false;
         }
         else if(comparison>0){
            //new item< item-->eg-->bihar-->andra pradesh(currently at bihar)
            //add it before.
            i.previous();//go back to privious record
            i.add(newPlace);
            return true;
         }
         else if(comparison>0){
            //move to next item
            //.next is done
         
         }

      }
      i.add(newPlace);
         return true;
   }

   private static void visit(LinkedList<String> visitPlaces) {
      ListIterator<String> i = visitPlaces.listIterator();
      boolean goingForward =true;
      Scanner scanner = new Scanner(System.in);
      printInstruction();
      boolean quit = false;
      while(!quit){
         
         System.out.println("enter choice:");
         int choice = scanner.nextInt();
         switch(choice){
            case 0:
               quit= true;
               break;
            case 1 :
               if(!goingForward){
                  if(i.hasNext()){
                     //if moving backward-->want to go next
                     //navigate forward.
                     i.next();
                  }
                  goingForward =true;
               }
               if(i.hasNext()){
                  System.out.println("next city: "+ i.next());
                  break;
               }
               else{
                  System.out.println("At the end of list");
                  goingForward=false;
                  break;
               }
            case 2:
               if(goingForward){
                  if(i.hasPrevious()){
                     //if going forward-->want to go back
                     //navigate backward
                     i.previous();
                  }
                  goingForward =false;
               }
               if(i.hasPrevious()){
                  System.out.println("previous city: "+i.previous());
                  break;
               }
               else{
                  System.out.println("At the start of city");
                  goingForward =true;
                  break;
               }
            case 3:
               printInstruction();
               break;
            default:
               quit=true;
               break;
         }
      }

   }
   private static void printInstruction() {
      System.out.println("\n press");
      System.out.println("0: holiday over");
      System.out.println("1: next city");
      System.out.println("2: previous city");
      System.out.println("3: instruction");

   }
   
}
