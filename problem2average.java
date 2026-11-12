package txterm2activity;
import java.util.Scanner;
public class problem2average {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [][] branch = new int[3][4];
		int row, col;
		double total = 0;
		double avg = 0;
		
		System.out.println("Weekly Sales per Branch");
		
		for (row=0; row<branch.length; row++) {
			System.out.println("Branch " + (row+1) + ": ");
			for (col=0; col<branch[row].length; col++) {
				System.out.print("");
				branch[row][col] = sc.nextInt();
			}}
		System.out.println("");
		
		for (row=0; row<branch.length; row++) {

		    System.out.print("Branch " + (row+1) + ": ");

		    for (col=0; col<branch[row].length; col++) {
		        System.out.print(branch[row][col] + "\t");
		    }
		    System.out.println();
		}
		System.out.println("");
		
		double highest = 0;
		int highestBranch = 0;
		
		for (row=0; row<branch.length; row++) {
			total = 0;
			for (col=0; col<branch[row].length; col++) {
				total += branch[row][col];
			}
			avg = total/4;	
			System.out.println("Branch " + (row+1) + ": Total = " + total + ", Average = " + avg);
			
			if (avg>highest) {
				highest = avg;
				highestBranch = row + 1;
			}
		}	
		System.out.print("Highest average sales: Branch " + highestBranch);
		sc.close();
	}
}