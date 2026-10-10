package practice;

import java.util.Scanner;

public class prac6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input a value for meter: ");
		double meter = scanner.nextDouble();
		double kilometer = (meter / 1000);
		System.out.println(meter + " meter/s is equal to " + kilometer + " kilometer/s.");
		scanner.close();

	}

}
