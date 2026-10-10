package asdf;
import java.util.Scanner;
public class qwerr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter ticket type (Regular, Student, Senior) purchase: ");
		String ticketType = sc.nextLine();
		System.out.print("Number of tickets: ");
		int numOfTickets = sc.nextInt();
		
		double regular = 250;
		double student = 200;
		double senior = 180;
		
		
		
		double ticketPrice;
		if (ticketType.equals("Regular")) {
			ticketPrice = regular; }
		else if (ticketType.equals("Student")) {
			ticketPrice = student; }
		else {
			ticketPrice = senior; }
	
	}
		/*double ticketPriceTax = ticketPrice * 0.12;
		
		double totalPay = 
		
	
		if (numOfTickets >= 5) {
			System.out.print("Group Purchase"); }
		else if (numOfTickets >= 2) {
			System.out.print("Regular Purchase"); }
		else {
			System.out.print("Single Purchase"); }	
	
		
	}
putangina
	}*/


