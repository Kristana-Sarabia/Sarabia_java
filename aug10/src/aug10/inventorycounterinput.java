package aug10;
import java.util.Scanner;
public class inventorycounterinput {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Input amount of inventory: ");
		double a = sc.nextDouble();
		System.out.println("Initial Inventory: "+a);
		System.out.println("Before Restocking: " + (a++));
		a ++; a ++; a ++; a ++;
		System.out.println("After Restocking: "+a);
		
		System.out.println("Before Selling: " + (a--));
		a --; a --;
		
		System.out.println("After Selling: "+a);

		System.out.println("Final Inventory Stock: "+a);
		sc.close();

	}

}
