package practice;

import java.util.Scanner;

public class prac5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter temperature in Celsius: ");
		double celsius = scanner.nextDouble();
		double fahrenheit = (celsius * 9.0 / 5.0) + 32.0;
		System.out.println(celsius +"C is equal to " + fahrenheit + "F");
		scanner.close();

	}

}
