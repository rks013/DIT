public class switchStatement {
    public static void main(String[] args) {
        char switchValue= 'z';
        String name = "bolt";
        switch(switchValue)
        {
            case 'a':    //use COLON(:)
                System.out.println("its "+switchValue);
                break;
            case 'b':
                System.out.println("its "+switchValue);
                break;
            case 'c':
                System.out.println("its "+switchValue);
                break;
            case 'd':
                System.out.println("its "+switchValue);
                break;
            case 'e':
                System.out.println("its "+switchValue);
                break;
            default:
                System.out.println("its "+switchValue);    

        }
        switch(name) //uper and lower case should be condidered. For that use methods found in string class in swith expression.
        {
            case "Bolt":
                System.out.println(name+" is a good player.");
                break;
            default:
                System.out.println(name+" is a good player."); 
                System.out.println("BYE");   
        }
    }
    
    
}
