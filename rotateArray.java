public class rotateArray {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        //printing second maximum.
        int arr[] = new int[5];
        int arr2[]={1,2,3,4,51,6};
        int first_max = arr2[0];
        int second_max = first_max;
        for(int i=0;i<arr2.length;i++)
        {
            if(arr2[i]>first_max){
                second_max =first_max;
                first_max=arr2[i];
            }
            else if(arr2[i]>second_max){
                second_max=arr2[i]; 
            }
        }
        System.out.println("first max: "+first_max);
        System.out.println("first max: "+second_max);

        System.out.println("**************************");

        //rotating an array.
        int[] rot = {1,3,5,7,9,11,13,15};
        int temp = rot[0];
        for(int i=0;i<rot.length-1;i++){
            rot[i]=rot[i+1];
        }
        rot[rot.length-1]=temp;
        System.out.println("rotated array:");
        for(int x: rot){
            System.out.print(x+" ");
        }
    }
}
