package fass;
import java.util.Scanner;
public class oddEvenBalance {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int number=0, evenSum=0, oddSum=0;
	
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
		sc.close();
		}

	}


