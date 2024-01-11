public class paintJob {
    public static void main(String[] args) {
        System.out.println(getBucketCount(3.4, 2.1, 1.5, 2));
        //getBucketCount((3.4, 2.1, 1.5, 2);
       
        System.out.println(getBucketCount(3.26, 0.75));
        
    }
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) 
    {
        if(width <=0 || height<=0 || areaPerBucket<=0 || extraBuckets<0){
            return -1;
        }
       double areaOfWall = width*height;
       double reqBucket = (areaOfWall - (extraBuckets*areaPerBucket))/areaPerBucket;
       reqBucket = Math.ceil(reqBucket);
       int bucket = (int) reqBucket;
       return bucket; 
    }
    public static int getBucketCount(double width, double height, double areaPerBucket) 
    {
        if(width <=0 || height<=0 || areaPerBucket<=0){
            return -1;
        }
       double areaOfWall = width*height;
       double reqBucket = (areaOfWall )/areaPerBucket;
       reqBucket = Math.ceil(reqBucket);
       int bucket = (int) reqBucket;
       return bucket; 
    }
    public static int getBucketCount(double area, double areaPerBucket) 
    {
        if(area <=0  || areaPerBucket<=0){
            return -1;
        }
       double reqBucket = (area )/areaPerBucket;
       reqBucket = Math.ceil(reqBucket);
       int bucket = (int) reqBucket;
       return bucket; 
    }
    
}
