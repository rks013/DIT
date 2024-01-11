public class dayOfWeek {
    public static void main(String[] args) {
        printDayOfWeek(-1);
        
    }
    public static void printDayOfWeek(int day)
    {
        //int switch_value = (int)day;
        switch(day)
        {
            case 0:
                System.out.println("SUNDAY");
                break;
            case 1:
                System.out.println("MONDAY");
                break;
            case 2:
                System.out.println("TUESDAY");
                break;
            case 3:
                System.out.println("WEDNESDAY");
                break;
            case 4:
                System.out.println("THRUSDAY");
                break;
            case 5:
                System.out.println("FRIDAY");
                break;
            case 6:
                System.out.println("SATURDAY");
                break; 
            default:
                System.out.println("Invalid day");    
         
          //IF-ELSE statement can also be USED

        }
    }
    
}
