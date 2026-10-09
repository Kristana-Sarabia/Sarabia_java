package fass;
import java.util.Scanner;
public class sabexer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int choice=0, number = 0, evenSum=0, oddSum=0, one=0, two=0;
		do {
			System.out.print("MENU"
				+ "\n\nPlease select a number: "
				+ "\n[1] 20x20 multiplication table using for loop"
				+ "\n[2] Odd-Even Balance using while/do while loop"
				+ "\n[3] Exit\n");
			choice = sc.nextInt();
		
			switch (choice) {
			case 1:
				System.out.println("20x20 Multiplication Table");
			
				for (one = 1; one<=20; one++) {
				for (two = 1; two<=20; two++) {
					System.out.print(one + " x " + two + " = " +(one*two) + "\t" ); 
					}
					System.out.println();
				}
				break;
		
			case 2:		
				do {
					System.out.print("Enter number: ");
					number = sc.nextInt();
				
					if (number %2 == 0) {
						evenSum += number;
					}
					else {
						oddSum += number;
					}			
					
				} while (number>=0);
				System.out.println("\nDone.");
				System.out.println("Sum of all even: " + evenSum);
				System.out.println("Sum of all odd: " + oddSum);
				System.out.println("");
			
				if (evenSum > oddSum) {
					System.out.println("The sum of all even numbers is greater than the sum of all odd numbers.");
				}
				else if (evenSum < oddSum) {
					System.out.println("The sum of all even numbers is less than the sum of all odd numbers.");
				}
				else if (evenSum == oddSum) {
					System.out.println("The sum of all even numbers is equal to the sum of all odd numbers.");
				}
				else {
				}	
				break;
			case 3:
				System.out.println("You have exited the menu.");
				break;
			default:
				System.out.print("Invalid input");
				break;}
		} while (choice !=3); 
		
		sc.close();}}