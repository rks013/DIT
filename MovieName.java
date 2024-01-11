//POLYMORPHISM.

class Movie{//BASE CLASS
    private String name;
    //cunstructor.
    public Movie(String name){
        this.name = name;
    }
    //!getters
    public String getName(){
        return this.name;
    }
    //method
    public void plot(){
        System.out.println("no plot is here");
    }
}
class MoneyHeist extends Movie{ //IS-A relatioship.
    //cunstructor.
    public MoneyHeist(){
        super("Money Heist web show");
    }
    @Override
    public void plot(){
        System.out.println("professor and his group perform heist.");
    }
}
class PrisonBreak extends Movie{
    public PrisonBreak(){
        super("Prison break web show");

    }
    public void plot(){
        System.out.println(" scoified escape prison.");
    }
}
class Jaws extends Movie{
    public Jaws(){
        super("Movie jaws ");
    }
    public void plot(){
        System.out.println("A shark eats people");
    }
}
class Ddlj extends Movie{
    //cunstructor
    public Ddlj(){
        super("movie DDLJ");
    }
    //no plot method here
}



public class MovieName {
    public static void main(String[] args) {
        //creating instance.
        for(int i=1; i<8; i++){
            Movie movieName = randomMovieGenerator();
            System.out.println("movie#"+i+" : "+movieName.getName()+". Plot of movie: ");
             movieName.plot();
        }
    }

    // method to return instance of movie class with random apporach.
    public static Movie randomMovieGenerator() {
        int randomNo = (int) (Math.random()*4)+1;
        switch(randomNo){
            case 1:
                return new MoneyHeist(); //instance of MoneyHeist class.
            case 2:
                return new PrisonBreak(); 
            case 3:
                return new Jaws();
            case 4:
                return new Ddlj(); 
            default:
            return null;     
        } 
    }
}
