public class megaByteCconvertor {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500); //check
    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes)
    {
        if(kiloBytes>0)
        {
            int megaByte=( kiloBytes/1024);
            int remaining=( kiloBytes%1024);
            System.out.println( kiloBytes+" KB = "+ megaByte+
            "MB and "+ remaining+ " KB");
        }
        else{System.out.println("Invalid Value");}
    }
    
}
