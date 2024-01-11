public class methodOverloading {
    public static void main(String[] args)
    {
        System.out.println(calFeetAndInchToCentimeter(-1562));//check
    }
    //method to convert when 2 parameter is given.
    public static double calFeetAndInchToCentimeter(double feet, double inch)
    {
        if((feet < 0) || ((inch < 0)  || (inch >12))) // validation of parameters.
        {
            System.out.println("Invalid number");
            return -1;
        }
        else if(true)
        {
            double cm= ((feet*12)+inch)*2.54;
           // int inCm= (int)cm;
            System.out.println(feet+" feet and "+inch+" inch = "+cm+" cm");
            return cm;
        }
        return -1;

    }
    //when inches is given.
    public static double calFeetAndInchToCentimeter(double inch)
    {
        if(inch <0)
        {
            return -1;
        }
        else if(true)
        {
            double feet = (int)inch / 12; //converting into feet and inches
            double remaining_inch = (int) inch % 12;
            double cm = calFeetAndInchToCentimeter(feet, remaining_inch); //calling above method.
            return cm;
        }
        return -1;
    }
    
}
