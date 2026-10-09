package fass;
import java.util.Scanner;
public class asdfff {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int choice=0, one=0, two=0, number=0, evensum=0, oddsum=0;
		do {
			System.out.print("Menu"
					+ "\nchoose a number: "
					+ "\n1"
					+ "\n2"
					+ "\n3");
			choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				for (one = 1; one<=20; one++) {
				for (two = 1; two<=20; two++) {
					System.out.println(one +" x "+two+" = "+(one*two) + "\t" );
					} 
					System.out.println();
				}
			break;
			case 2:
				do {
					System.out.println("Enter a number: ");
					number = sc.nextInt();
					
					if (number %2 == 0) {
						evensum += number;
					}
					else {
						oddsum += number;
					}
					if (evensum>oddsum) {
						System.out.print("Even sum greater than odd");}
					else if (evensum<oddsum) {
						System.out.print("Even sum greater than odd");}					
					else {
						System.out.print("Even sum greater than odd");}
				
				} while (number!=-1);
			break;
			case 3: 
				System.out.print("You have exited the menu");
			break;
			default:
				System.out.print("Invalid input.");
			break;
		} 
		
	} while (choice !=3);
	sc.close();

}}
