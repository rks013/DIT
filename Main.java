import java.lang.ProcessBuilder.Redirect.Type;

public class Main {
    public static void main(String[] args) {
        //System.out.println("hello");
        Car porsche = new Car(); //initialise type of object with help of new keyword.
        Car holden  = new Car(); // we are creating USER DEFINED DATA TYPE.


        holden = null;
        //holden.display(); //:-> gives error bcz-> variable is not initialise.
        //object is not created given on the templet.
        porsche.setModle("comodore");
        System.out.println(porsche.getModel());
        System.out.println(porsche.getClass());

    }
    
}
