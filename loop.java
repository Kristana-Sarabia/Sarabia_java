package fass;
import java.util.Scanner;
public class loop {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int choice;
	do {
		System.out.println("---MENU---");
		System.out.println("1. Play Game");
		System.out.println("2. View High Scores");
		System.out.println("3. Exit");
		System.out.println("Enter your choice (1-3): ");
	
		choice = sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println("No.");
			break;
		case 2:
			System.out.print("You: 100pts");
			break;
		case 3:
			
			break;
		default:
			System.out.println("Invalid input");
			break;
		}
	} while (choice!= 3);
	System.out.println("Goodbye!");
	sc.close();
		
	}}
	
	
	