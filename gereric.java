import java.util.Arrays;
public class gereric {
    public static void main(String[] args) {
        
        Object obj = new String("hello");
        //obj = new Integer(0);
        Object[] obj1 = new Object[3];//creating array of object.
        obj1[0]="hello";
        obj1[1]="india";
        obj1[2]=50;        //storing any type of data -->achieving generalisation via this.
        System.out.println(obj1.toString()); 
    }

    //ceate generic type array is recommended to store any type of data.
}
