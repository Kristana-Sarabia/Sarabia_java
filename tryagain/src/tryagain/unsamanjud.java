package tryagain;
import java.util.Scanner;
public class unsamanjud {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input your name: ");
		String name = sc.nextLine();
		System.out.println("Input your age: ");
		int age = sc.nextInt();
		System.out.println("Input your gender: ");
		String gender = sc.next();
		System.out.println("Your name is " + name);
		System.out.println("Your age is " + age);
		System.out.println("Your gender is " + gender);
		sc.close ();

	}

}
