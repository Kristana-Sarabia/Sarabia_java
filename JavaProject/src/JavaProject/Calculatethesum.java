package JavaProject;

import java.util.Scanner;

public class Calculatethesum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input First Number: ");
		int num1 = sc.nextInt();
		System.out.println("Input Second Number: ");
		int num2 = sc.nextInt();
		int sum = num1 + num2;
		System.out.println("Sum of two numbers: " + sum);
		sc.close ();
	}
}
