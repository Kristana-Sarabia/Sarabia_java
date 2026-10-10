package JavaProject;
import java.util.Scanner;
public class inputinteger {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your age: ");
		int age = input.nextInt();
		System.out.println("You are " + age + " years old.");
		input.close();

	}

}
