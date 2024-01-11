

class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return this.firstName;
    } 
    public String getLastName() {
        return this.lastName;
    }
    public int getAge() {
        return this.age;
    }

    public void setFirstName(String firstName ) {
         this.firstName = firstName;
    } 
    public void setLastName( String lastName) {
         this.lastName = lastName;
    }
    public void setAge(int age) {
        if(age <0 || age>100){
            this.age = 0;
        }
        else{
         this.age = age;
        }
    }

    public boolean isTeen() {
        if(this.age >12 && this.age <20){
            return true;
        }
        return false;
    }
    public String getFullName() {
        if(this.firstName.isEmpty() ==true && this.lastName.isEmpty()==true){
            return "";
        }
        else if(this.firstName.isEmpty() == true){
            return this.lastName;
        }
        else if(this.lastName.isEmpty() == true){
            return this.firstName;
        }
    
        return this.firstName+" "+ this.lastName;
        
    }
    
    

}

public class personDetail{
    public static void main(String[] args) {
        
        Person person1 = new Person();
        Person person2 = new Person();
        person1.setFirstName("");   // firstName is set to empty string
        person1.setLastName("");    // lastName is set to empty string
        person1.setAge(10);
        System.out.println("fullName= " + person1.getFullName());
        System.out.println("teen= " + person1.isTeen());
        person2.setFirstName("John");
        person2.setLastName("");    // firstName is set to John
        person2.setAge(18);
        System.out.println("fullName= " + person2.getFullName());
        System.out.println("teen= " + person2.isTeen());
        person2.setLastName("Smith");    // lastName is set to Smith
        System.out.println("fullName= " + person2.getFullName());
    }
}
