class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;
    //cunstructor
    public printer(int tonerLevel,  boolean duplex){
        if(tonerLevel >-1 && tonerLevel <=100){
             this.tonerLevel = tonerLevel;}
        else{
            this.tonerLevel = -1;
        }
        this.pagesPrinted = 0;
        this.duplex = duplex;
    }
    //method;
    public int addToner(int tonerAmount){
        if(tonerAmount >0 && tonerAmount <=100){
            if(this.tonerLevel+ tonerAmount >100){
                return -1;
            }
            else{
                this.tonerLevel += tonerAmount;
                return this.tonerLevel;
            }
        }
        else{
            return -1;
        }
    }
    public int printPages(int pages){
        int pagesToPrint = (pages/2)+pages%2;
        if(this.duplex == true){
            System.out.println("Printing in duplex mode");
            this.pagesPrinted  = this.pagesPrinted+ ( pagesToPrint);
            return pagesToPrint;
        }
        else{
            this.pagesPrinted  = this.pagesPrinted+ ( pages);
            return pages;
        }
    }
 
    public int getPagesPrinted(){
         return this.pagesPrinted;
     }
    
 }
 public class printerTest{
    public static void main(String args[]){
        Printer printer = new Printer(50,true);
        System.out.println(printer.addToner(50));
        System.out.println(printer.getPagesPrinted());
        int pagePrinted = printer.printPages(4);
        System.out.println(pagePrinted);
        System.out.println(printer.getPagesPrinted());
        pagePrinted = printer.printPages(2);
        System.out.println(pagePrinted);
        System.out.println(printer.getPagesPrinted());
    }
 }
 
