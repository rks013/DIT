 class PointDetail {
  
    private int x;
    private int y;
    //contructors to initialize fields.
    public PointDetail(){
        this(0,0);
    }
    public PointDetail(int x, int y){
        this.x = x;
        this.y = y;
    }
    //Method:-> getters.
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
    //Method:-> setters.
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    //method:-> 
    public double distance(){
        double dist = (0- this.y)*(0- this.y) + (0- this.x)*(0- this.x);
        return Math.sqrt(dist);
    }
    public double distance(int x, int y){
        double dist = (y- this.y)*(y- this.y) + (x- this.x)*(x- this.x);
        return Math.sqrt(dist);
    }
    public double distance(PointDetail point){
        double dist = (point.y- this.y)*(point.y- this.y) + (point.x- this.x)*(point.x- this.x);
        return Math.sqrt(dist);
    }
 
}
public class Point{
    public static void main(String[] args) {
        PointDetail first = new PointDetail(6, 5);
        PointDetail second = new PointDetail(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        PointDetail point = new PointDetail();
        System.out.println("distance()= " + point.distance());
    }
}