
public class areaCalculator {
    public static void main(String[] args) {
        
    }
    public static double area(double radius)
    {
        if(radius<0)
        {
            return -1;
        }
        double pi = Math.PI;
        double area = pi*(radius*radius);
        return area;
    }
    public static double area(double l, double b)
    {
        if(l <0 || b <0)
        {
            return -1;
        }
        double area = l*b;
        return area;
    }

}
