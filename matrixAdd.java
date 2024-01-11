public class matrixAdd{
    //ADDITION AND MULTIPLICATION OF MATRIX....
    public static void main(String[] args) {
        int arrSum[][] = new int[3][3];//three array refrences and each containing 3 element.
        int arrMul[][]=new int [3][3];
        int arr2[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int arr3[][] = {{1,2,1},{2,4,6},{7,2,5}};

        for(int i=0;i<arrSum.length;i++)
        {
            for(int j=0; j<arrSum[i].length;j++)
            {
                arrSum[i][j]=arr2[i][j]+arr3[i][j];//ADDITION.
            }
        }

        for(int i=0;i<arrMul.length;i++)
        {
            for(int j=0; j<arrMul[i].length;j++)
            {
                arrMul[i][j]=0;
                for(int k=0;k<3;k++){
                    arrMul[i][j]=arrMul[i][j]+(arr2[i][k]*arr3[k][j]);//MULTIPLICATION
                }
                
            }
        }

        //display.
        for(int x[]: arrSum)
        {
            for(int y:x)
            {
                System.out.print(y+" ");
            }
            System.out.println("\n");
        }
        System.out.println("***************");
        for(int x[]: arrMul)
        {
            for(int y:x)
            {
                System.out.print(y+" ");
            }
            System.out.println("\n");
        }
    }
}