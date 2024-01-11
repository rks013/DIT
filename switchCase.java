import java.util.*;
public class switchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter website url");
        String url = sc.nextLine();
        int pos1 = url.indexOf(":");
        String protocol = url.substring(0,pos1);
        System.out.println("protocol :"+protocol);
        int pos2 = url.lastIndexOf(".");
        String extension = url.substring(pos2+1);
        switch(extension){
            case "com":
                System.out.println("commercial website.");
                break;
            case "gov":
                System.out.println("governement website.");
                break;
            case "org":
                System.out.println("organisational website.");
                break;
            case "net":
                System.out.println("network website.");
                break;
            default:
                System.out.println("extension of website: "+extension);
        }
        
    }
}
