package pracccc;
import java.util.Scanner;
public class prac {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] names = {"Ana", "Ben", "Carla", "Daniel", "Erica", "Faith", "Gary", "Henry", "Isaiah", "Jake"};
		int[] num = {92, 78, 85, 69, 81, 95, 73, 98, 87, 70};
		char determine;
		
		do {
		int i;
		int passed = 0, failed = 0;
		double sum = 0;
		int highest = num[0], lowest = num[0];
		
		System.out.println("===== STUDENT PERFORMANCE REPORT =====");
				
		for (i = 0; i < num.length; i++){
			String performance;
			if (num[i] >=90 && num[i] <=100) {
				performance = "Excellent";}
			else if (num[i] >=85 && num[i] <=89) {
				performance = "Very Good";}
			else if (num[i] >= 75 && num[i] <=84) {
				performance = "Passed";}
			else {
				performance = "Failed"; }
		
			sum += num[i];
			if (num[i] > highest) {
			    highest = num[i];}
			if (num[i] < lowest) {
			    lowest = num[i];}
			
			if (num[i]>=75) {
				passed += 1;}
			if (num[i]<75) {
				failed +=1;}
		
			System.out.println("\n" + names[i] + " " + num[i] + " " + performance);}
		
		double average = sum/num.length;
		
		String cPerformance;
		if (average >= 85) {
			cPerformance = "\nOutstanding";}
		else {
			cPerformance = "\nNeeds Improvement";}
		
		System.out.println("\n===== SUMMARY ====="
				+ "\nAverage Grade: 	" + average 
				+ "\nHighest Grade: 	" + highest 
				+ "\nLowest Grade: 	" + lowest 
				+ "\nPassed Students: " + passed 
				+ "\nFailed Students: " + failed);
		
		System.out.println("\n===== CLASS PERFORMANCE ====="
				+ cPerformance + "!");
		
		System.out.println("\nDo you want to determine Class Performance? y/n");
		determine = sc.next().charAt(0);
		} while (determine == 'y' || determine == 'Y');
		System.out.println("Student Performance Report End.");
		sc.close(); }
}