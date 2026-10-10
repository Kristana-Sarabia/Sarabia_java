package aug10;
import java.util.Scanner;
public class adultorminor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input your age: ");
		int age = sc.nextInt();
		String result = (age >= 18) ? "Adult" : "Minor";
		System.out.println("You are an/a " + result + ".");
		sc.close();

	}

}

