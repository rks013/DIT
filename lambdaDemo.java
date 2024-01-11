@FunctionalInterface
interface MyLambda1{
     public void display();
}

@FunctionalInterface
interface MyLambda2{
     public void display(String str);
}

@FunctionalInterface
interface MyLambda3{
     public int add(int x , int y);
}


public  class lambdaDemo  {
   public static void main(String[] args) {
        MyLambda1 m1 = ()->{System.out.println("hello lamda expression");};
       
        MyLambda2 m2  = (str)-> {System.out.println(str);};

        MyLambda3 m3 = (x,y)->{return x+y;};

        m1.display();
        m2.display("display message that is passed as an argument.");
        
        System.out.println(m3.add(45, 6));
   } 
}
