package JavaProject;

import java.util.Scanner;

public class Calculatetheavg {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input first number: ");
		double num1 = sc.nextDouble();
		System.out.println("Input second number: ");
		double num2 = sc.nextDouble();
		System.out.println("Input third Number: ");
		double num3 = sc.nextDouble();
		double avg = (num1 + num2 + num3)/3;
		System.out.println("Average of three numbers: " + avg);
		sc.close ();
	}
}

