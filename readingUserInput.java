import java.util.Scanner;

public class readingUserInput {
    // Scanner is java built in class that allows to read user input.
    public static void main(String[] args) {
        System.out.println("hello");
        
        Scanner scanner = new Scanner(System.in); 
        // new keyword: to create instance (i.e a object) of scanner class.
        //S is cap^
        // creating a variable scanner of Scanner class.
        
       
        System.out.println("enter name: ");
        String name = scanner.nextLine(); //calling nextline method.
        // next line method:-> read a line of input from consol.
        //storing in  variable name defined in line 13.

        System.out.println("enter year of birth:");
        String yearBirth = scanner.nextLine();
        int yearOfBirth = Integer.parseInt(yearBirth);//parsing string into int.

        //another aproach: help of nextInt METHOD.

        System.out.println("enter college passing year: ");
        int passYear = scanner.nextInt();
        scanner.nextLine(); //->to handle next line character (i.e enter key).
        
        int age = 2022-yearOfBirth; 
        int experience= 2022-passYear;
        System.out.println(name+"  is "+age+" year old and have "+experience+" year of experience.");

        //after using scanner it is advised to close scanner.
        scanner.close();//close method:->close the scanner
    }
}
