package asdf;
import java.util.Scanner;
public class asdff {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter item price: ");
		double itemPrice = sc.nextDouble();
		System.out.print("Enter Quantity: ");
		int quantity = sc.nextInt();
		double subtotal = itemPrice * quantity;
		double discount = subtotal * 0.10;
		double finalAmount = subtotal - discount;
		System.out.println("\nItem Price: " + itemPrice);
		System.out.println("Quantity: " + quantity);
		System.out.println("Subtotal: " + subtotal);
		System.out.println("Discount: " + discount);
		System.out.println("Final Amount: " + finalAmount);
		sc.close();
		

	}

}
