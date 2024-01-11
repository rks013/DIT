 class WallDetail {
    private double width;
    private double height;
    // creating setters for width and height <0 condition.
    public void setWidth(double width){
        if(width <0){
            this.width = 0;
        }
        else{
            this.width = width;
        }
    }
    public void setHeight(double height ){
        if(height <0){
            this.height = 0;
        }
        else{
            this.height = height;
        }
    }
    // creating getters.
    public double getWidth(){
        return this.width;
    }
    public double getHeight(){
        return this.height;
    }
    // creating a method to find area.
    public double  getArea(){
        double area = (this.height) * (this.width);
        return area; 
    }

    //constructors.
    public WallDetail(){
        this(0, 0);
    }
    public WallDetail(double width, double height ){
        if(width <0){
            setWidth(width);
        }
        else{
            this.width = width;
        }
        if(height <0){
           setHeight(height);
        }
        else{
            this.height = height;
 
        }
    }
}
public class Wall{
    public static void main(String[] args) {
        WallDetail wall = new WallDetail(5,4);
        System.out.println("area= " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
    }
}