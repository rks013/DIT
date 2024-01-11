import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class fileOutput{
    public static void main(String[] args) {
        try{
            FileOutputStream fos = new FileOutputStream("z:/jp.txt");
            String str = "java programming .............after appending";
            //fos.write(str.getBytes());
            //for each loop
            byte[] b = str.getBytes();
            for(byte input :b){
                fos.write(input);
                
            }
            fos.write(b, 4, str.length()-4);
            
        }
        catch(FileNotFoundException e){
            System.out.println(e);
        }
        catch(IOException e){
            System.out.println(e);
        }
        
    }
} 