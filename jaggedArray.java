public class jaggedArray {
    public static void main(String[] args) {
        int arr[][]; //array reference.
        arr = new int[3][];
        //arr->3 refrences , that is arr[0],arr[1],arr[2]
        arr[0] = new int[2];
        arr[1] = new int[5];
        arr[2] = new int[1];

        for(int i=0; i<arr[1].length;i++){
            arr[1][i]=i*5;
        }

        for(int x[]: arr)
        {
            for(int y:x)
            {
                System.out.print(y+" ");
            }
            System.out.println("\n");
        }
    }
}
