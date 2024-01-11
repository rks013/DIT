import java.util.Scanner;

public class test{
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        
        int[] myArray = getInteger(5);
        int[] intAray ={1,3,5,7,8};
       //display(myArray);
        //varify(myArray, 8);
        System.out.println("**************");
        //int[] sorted = sortArray(myArray);
        //display(sorted);
        System.out.println(binarySearch(myArray, 8));

    }
    //linear search.
    public static int lineraSearch(int[] array, int target){
        for(int i =0; i<array.length; i++){
            if(array[i]== target){
                return i;
            }
        }
        return -1;

    }

    //binary search
    public static int binarySearch(int[] array, int target) {
        int[] sorted=sortArray(array);
        display(sorted);
        int first =0;
        int last = sorted.length-1;
        //for loop gives unreachable code;
        while(first <=last){

            int mid_point = first+last/2;

            if(sorted[mid_point]==target){
                return mid_point;
            }
            else if(sorted[mid_point]< target){
                    first = mid_point+1;
                }
            else {
                    last = mid_point;
                }
            }
        return -1;
    }
    //method to varify.
    public static void varify(int[] array, int target) {
        int result = lineraSearch(array, target);
        if(result ==-1){
            System.out.println("value not found");
        }
        else{
            System.out.println("found value at:"+ result);
        }
    }
    public static int[] getInteger(int number) {
        int[] array =new int[number];
        for(int i=0; i<number; i++){
            System.out.println("enter number:");
            int input = scanner.nextInt();
            scanner.nextLine();
            array[i] = input;
        }
        return array;    
    }
    public static int[] sortArray(int[] arrary){
        //copy array
        int[] sortArray = new int[arrary.length];
        for(int i =0; i<arrary.length; i++ ){
            sortArray[i] = arrary[i];
        }

        boolean flag =true;
        int temp;
        while(flag){
            flag = false;
            for(int i =0; i<sortArray.length-1; i++){
                if(sortArray[i]> sortArray[i+1]){
                    temp = sortArray[i];
                    sortArray[i]=sortArray[i+1];
                    sortArray[i+1]=temp;
                    flag = true;
                }
            }
            
        }
        return sortArray;
    }
    
    public static void display(int[] array) {
        for(int i =0; i<array.length; i++){
            System.out.println("number:"+array[i]);
        }
    }
}
   /*  public static int getLargestPrime(int number)
    {
        if(number <2){
            return -1;
        }
        
        for(int i=2; i<(number); i++){
            if(number %i ==0){
                number =number/i;
                i--;
            }
        }
        return number;   
    } */


    
   /*  public static boolean isEven(int num)
    {
        if(num <=0){
            return false;
        }
        else if(num %2 ==0){
            return true;
        }
        return false;
        
    } */
   
  
