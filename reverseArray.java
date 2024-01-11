public class reverseArray {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int[] arr1 ={1,2,3,4,5,6,7,8,9};
        for(int i=0;i<arr1.length;i++)
        {
          System.out.print(arr1[i]+" ");  
        }
        int len = arr1.length-1;
        System.out.println("");
        int arr2[]= new int[arr1.length];
        for(int i=0;i<=arr1.length-1;i++)
        {
            arr2[i]=arr1[len];
            len--;
        }
        for(int i=0;i<arr1.length;i++)
        {
          System.out.print(arr2[i]+" ");  
        }
    } 
}
