
import java.util.Scanner;

class Bill{

	
	int custNo;
	String custName;
	
	int unit;
	void readData() {
		Scanner sc = new Scanner(System.in);
		System.out.println(" customer details.");
        System.out.println("customer number: ");
		custNo = sc.nextInt();
        System.out.println("customer name: ");
		custName = sc.next();
		sc.nextLine();
        System.out.println("unit consumed. ");
		unit = sc.nextInt();
		
		
	}
	 void showData(){
		System.out.println("customer no: "+custNo); 
		System.out.println("customer name: "+custName); 
		System.out.println("unit used "+unit); 
		
	 }
	double computeBill() {
		if(unit<=100) {
			return unit*1.20;//first 100 unit consumption.
		}
		else if(unit>100 && unit <=300) {
			return (unit-100)*2.00+100*1.20;//first 100 unit + next 200 unit consumption.
		}
		else if(unit>300 && unit <=600) {
			return (unit-300)*3+100*1.20+200*2.00;//first 100 unit + next 200 unit + next 300 unit consumption.
		}
		else {
			return (unit-600)*5+100*1.20+200*2.00+300*3.00;//first 100 unit + next 200 unit + next 300 unit + more  consumption.
		}
	}
	
	
}
class ElectricBill {

	public static void main(String[] args) {
		Bill cust1 = new Bill();
		cust1.readData();
		cust1.showData();
		System.out.println("Electricity bill:"+cust1.computeBill());
	}

}
