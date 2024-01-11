
import java.io.*;
import java.io.IOException;
public class copyFile {
    public static void main(String[] args) throws Exception   {
        try{
            //reading a file
            FileInputStream fis = new FileInputStream("z:/source1.txt");
            byte b[]= new byte[fis.available()];
            fis.read(b);
            String str = new String(b);//content of source1.txt file
            System.out.println(str);
            fis.close();
            //copying from source1.txt to source2.txt
            String str_small = str.toLowerCase();
            System.out.println(str_small);

            FileOutputStream fos = new FileOutputStream("z:/sr2.txt");
            byte[] bt = str_small.getBytes();
            for(byte input :bt){
                    fos.write(input);
                }
            fos.close(); 
             
        }
        
        finally{
            System.out.println("\nbye");
        }
    }
}
