public class if_else {
    public static void main(String args[]){
        boolean isCustomer = true;
        if (isCustomer==true) //no need to add ';' . if added below line will be executed any how 
        System.out.println("usual customer"); // use code block 
        //we can also write as below 
        if (isCustomer){
            System.out.println("FORMATE IS CORRECT");
        }

        //logical AND, OR 
        int total_num=90;
        int my_score=65;
        if((my_score<=total_num)&&(total_num>=90)){
            System.out.println("score is " + my_score);
        }
        if((my_score<=total_num)||(total_num==90)){
            System.out.println("score is " + my_score);
        }

        //TERNARY OPERATOR 
        boolean isPaid = isCustomer? true : false ;
        System.out.println("status:- " + isPaid);

    }
}
