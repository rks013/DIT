 import java.util.*;
 class Search{
       public static void main(String[] args) {
        int a[]=new int[] {5,6,7,8,9};
        Scanner s1=new Scanner(System.in);
        int count=0;
        System.out.println("Enter the Element is to be Searched");
        int key=s1.nextInt();
        Boolean flag = false;
        for(int i=0;i<a.length;i++){
            if(a[i]==key){
                System.out.println("element is at index"+i);
                //flag = true;
                count++;

            }

        }
        if (count ==0){
            System.out.println("element is not found");
        }
       

        
       }
}