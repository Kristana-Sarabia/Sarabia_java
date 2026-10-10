package tryagain;
import java.util.Scanner;
public class grade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter grade in Java: ");
		double javaGrade = sc.nextDouble();
		System.out.print("Enter grade in Mathematics: ");
		double mathGrade = sc.nextDouble();
		System.out.print("Enter grade in English: ");
		double engGrade = sc.nextDouble();
		double totalGrade = javaGrade + mathGrade + engGrade;
		double average = totalGrade/3;
		System.out.println("\n Java Grade: " + javaGrade);
		System.out.println("Mathematics Grade: " + mathGrade);
		System.out.println("English Grade: " + engGrade);
		System.out.println("Total Grade: " + totalGrade);
		System.out.println("Average Grade: " + average);
		sc.close();
		

	}

}
