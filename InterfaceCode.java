public class InterfaceCode{
    //!notes
    /* -Idea behind to use an interface is to provide a common behaviour that several other
     class can use by having them implementing same interface.
    In other word java use multiple inheritance with implementing the comcept of interface.
    In interface->A contract in which method signature or fields if defined will not be changed */
    public static void main(String[] args) {
        System.out.println("implimenting Interface.");
        // instace of DeskPhone class.
        ITelephone myPhone;
        myPhone = new Deskphone(12345);
        myPhone.powerOn();
        myPhone.callPhone(12345);
        myPhone.answer();

        //creating instance of mobile phone class.
        myPhone = new MobilePhone(45678);
        myPhone.powerOn();
        myPhone.dial(202);
        myPhone.callPhone(45678);
        myPhone.answer();

        ITelephone myMobilePhone;
        myMobilePhone = new MobilePhone(789);
        myMobilePhone.dial(256);
        myMobilePhone.callPhone(789);
    
    }
}
interface ITelephone{
   /*  just create  the signature of method that going to be used in this interafce ,so that class that 
    that implements this interface will override this method & use it. 
     */


     //we are not defiing the method --> that will be done in class itself .
     void powerOn();
     void dial(int phoneNumber);
     void answer();
     boolean callPhone(int phoneNumber);
     boolean isRinging();

//no need of access modifier as we are just creting the signature.
}


 class Deskphone implements ITelephone{
    private int myNumber;
    private boolean isRinging;
    //cunstructor
    public Deskphone(int myNumber){
        this.myNumber  = myNumber;
        
    }
   

    @Override
    public void powerOn() {
        System.out.println("Desk phone is on. Desk phone not have power button");
    }
    @Override
    public void dial(int phoneNumber) {
        System.out.println("Now dialing: "+phoneNumber+" on deskPhone");
    }
    @Override
    public void answer() {
        if(isRinging){
            System.out.println("Answering the  DEsk phone:");
            isRinging = false;
        }
    }
    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber == myNumber){
            isRinging =true;
            System.out.println("RINGggggggggggggggggggg");
        }
        else{
            isRinging = false;
        }
        return isRinging;
    }
    @Override
    public boolean isRinging() {
        return isRinging;
    }  
}

class MobilePhone implements ITelephone{
    private int myNumber;
    private boolean isOn;
    private boolean isRinging;
    //cunstructor
    public MobilePhone(int myNumber){
        this.myNumber  = myNumber;
        
    }  

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("Mobile Phone is on.");
    }

    @Override
    public void dial(int phoneNumber) {
        if(isOn){
            System.out.println("Dial: "+phoneNumber+" on mobile phone.");
        }
        else{
            System.out.println("switched off.");
        }
        
    }
    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber == myNumber && isOn){
            isRinging =true;
                System.out.println("Ring Ring.......");
            }
         else{
                isRinging = false;
            }
        
        return isRinging;
    }

    @Override
    public void answer() {
        if(isRinging){
                System.out.println("Answering the mobile Phone.");
                isRinging = false;
            }
    }

   

    @Override
    public boolean isRinging() {
        return isRinging;
    }

}
