class Rectangle{
    private double length;
    private double width;

    public Rectangle(double length, double width){
         if(length <0){
            this.length = 0;
        }
        else{
        this.length = length;}

        if(width <0){
            this.width = 0;
        }
        else{
        this.width = width;}
    }
    public double getLength(){
        return this.length;
    }
    public double getWidth(){
        return this.width;
    }
    
    public double getArea() {
        double area = this.length*this.width ;
        return area;
    }
}
class Cuboid extends Rectangle{
    private double height;

    public Cuboid(double length, double width, double height){
        super(length, width);
         if(height <0){
            this.height = 0;
        }
        else{
        this.height = height;}
    }
    public double getHeight(){
        return this. height;
    }
    public double getVolume() {
        double area = getArea()*height ;
        return area;
    }
}

public class PoolArea {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(1, 00);
        System.out.println("rectangle.width= " + rectangle.getWidth());
        System.out.println("rectangle.length= " + rectangle.getLength());
        System.out.println("rectangle.area= " + rectangle.getArea());
        Cuboid cuboid = new Cuboid(5,10,5);
        System.out.println("cuboid.width= " + cuboid.getWidth());
        System.out.println("cuboid.length= " + cuboid.getLength());
        System.out.println("cuboid.area= " + cuboid.getArea());
        System.out.println("cuboid.height= " + cuboid.getHeight());
        System.out.println("cuboid.volume= " + cuboid.getVolume());
        
    }
    
}
