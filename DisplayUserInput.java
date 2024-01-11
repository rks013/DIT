import java.util.Scanner;

public class DisplayUserInput {
    public static void main(String[] args) {
        int[] myArray; //initializing variable of array of type int.
        //we can use for any primitive type + string class.
        

        int[] myIntArray = new int[10]; //initializing array of space 10.
        int length = myIntArray.length;
        //System.out.println(length);
        String[] nameArray = new String[5];//of typr String class.
        int nameLength = nameArray.length;
        //calling method.
        DisplayNumber(myIntArray);

        Scanner scanner = new Scanner(System.in);

        for(int i =0; i<nameLength; i++){
            System.out.println("enter name: ");
            String input = scanner.nextLine();
            //scanner.nextLine();//handel enter key.
            nameArray[i] = input;
            
        }
        scanner.close();
        for(int i =0; i<nameLength; i++){
            System.out.println("input name : "+nameArray[i]);
        }
    }
    //array pased as parameter .
    public static void DisplayNumber(int[] array) {
        for(int i=0; i< array.length ; i++){ //traversing till length.
            array[i]= i*10;//storing at space of array.
            System.out.println("number:"+array[i]);
        }
        
    }
}
