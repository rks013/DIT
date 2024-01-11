import java.io.*;

public class fileInput {


    public static void main(String[] args)  throws Exception  {
        try{
            FileInputStream fis = new FileInputStream("z:/jp.txt");
            //how to read from a file.
            byte b[] = new byte[fis.available()];
            fis.read(b); 
            String str = new String(b);
            System.out.println(str); 

            //other way
            int x;
            do{
                 x= fis.read();
                 if(x!=-1)
                    System.out.print((char)x);
            }while(x!=-1);
        }
        catch(IOException e){
            System.out.println(e);
        }
        finally{
            System.out.println(" **");
        }
        
    }
}
