package aug10;

public class inventorycounter {

	public static void main(String[] args) {
		int a = 50;
		System.out.println("Initial Inventory: "+a);
		System.out.println("Before Restocking: " + (a++));
		a ++; a ++; a ++; a ++;
		System.out.println("After Restocking: "+a);
		
		System.out.println("Before Selling: " + (a--));
		a --; a --;
		
		System.out.println("After Selling: "+a);

		System.out.println("Final Inventory Stock: "+a);

	}

}
