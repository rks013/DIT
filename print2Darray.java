public class print2Darray {
    public static void main(String[] args) {
        
        int arr[][] = new int [3][4];
        int arr1[][] = {{1,2,3,4},{4,5,6,7},{89,5,8,11}};
        for(int i=0; i<arr1.length;i++)
        {
            for(int j=0; j<arr1[0].length;j++)
            {
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println("\n");
        }
        System.out.println("printing through for each loop");
        for(int x[]: arr1)
        {
            for(int y:x)
            {
                System.out.print(y+" ");
            }
            System.out.println("\n");
        }
    }
}
