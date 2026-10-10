package asdf;
import java.util.Scanner;
public class gas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input 'Diesel' or 'Gasoline' for selected gas type: ");
		String gasType = sc.nextLine();
		System.out.print("Enter number of Liters: ");
		byte numOfLiters = sc.nextByte();
		
		double pricePerLiter;
		if (gasType == "Diesel") {
			pricePerLiter = 78.04;
		} else {
			pricePerLiter = 76.13;
		}
		final double gasPrice = pricePerLiter*numOfLiters;
		
		System.out.println("\nFuel cost before tax: " + gasPrice);
		
		final double gasTaxed = gasPrice*0.17;
		final double gasTotal = gasTaxed + gasPrice;
		
		String Tank;
		if (numOfLiters >=40) {
			Tank = "Full Tank";}
		else if (numOfLiters >=20) {
			Tank = "Half Tank"; }
		else {
			Tank = "Per Bar Only";}
		
		System.out.println("\nPurchase is " + Tank);
		
		System.out.println("\nFuel Type: " + gasType);
		System.out.println("Liters Purchased: " + numOfLiters);
		System.out.println("Fuel Price per Liter: " + gasPrice/numOfLiters);
		System.out.println("Gas Tax: " + gasTaxed);
		System.out.println("Tank Status: " + Tank);
		System.out.println("Total Amount to Pay: " + gasTotal);
		sc.close(); }}
		
		
		
		




