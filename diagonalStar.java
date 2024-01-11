public class diagonalStar {
    public static void main(String[] args) {
        printSquareStar(8);
    }
    public static void printSquareStar(int number)
    {
        int column=number;
        int rowCount=0;
        for(int i=0; i<number; i++)
        {
            for(int j=0; j<column; j++)
            {
                rowCount++;
               if(i==0 || i==(number-1) || j==0 || j==(number-1) || i==j || i+j ==(number-1)|| j==(rowCount-i+1)){
                   System.out.print("*");
               }
               else{
                   System.out.print(" ");
               }
            }
            System.out.println("");
        }
        
    }
    
}
