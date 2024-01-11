@FunctionalInterface 
interface COD
{
    void showEnemy();
}
class Team implements COD{
    public void showEnemy() {
        System.out.println("Natural approach.  Go go go....be careful");
    }
}


@FunctionalInterface 
interface DemoTest
{
    void show();
}
@FunctionalInterface 
interface DemoTest2
{
    void print(Integer p);
}







class lambdaExpression {
    public static void main(String[] args) {
        COD player = new Team(); //create onject of a class that implements Functional Interface.
        player.showEnemy();// call is success.

        //creating Anonymous inner Class.
        COD player45 = new COD() { 
                        public void showEnemy(){
                            System.out.println("this is Anonymous inner class. Go go go go...player 45.");
                        }
        };
        player45.showEnemy();
       
        //!Lambda Expressions.

        COD player18 = ()->{ System.out.println("this block is for lambda expressios....Go go...Player 18..");};
        player18.showEnemy();




        //in main method..calling show method.
        fun(()->System.out.println("running show method...hurray"));//passing lambda expression as parameters.
        Newfun(p->System.out.println("running print method...not hurray "+p),10);
            //The passed lambda expression should match the signature of the the abstract method. 
        
    }


    static void fun(DemoTest t){// if there is functional inteface parameter then lambda expression can be assigned to it.
        t.show();
    }
    static void Newfun(DemoTest2 t2, Integer i){
        t2.print(10);//print() is mapped with the lambda expression.
    }
}
