package asdf;
import java.util.Scanner;
public class qwer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input employee's hourly rate: ");
		double hourlyRate = sc.nextDouble();
		System.out.print("Input number of hours worked: ");
		double hoursWorked = sc.nextDouble();
		
		double regularPay = hourlyRate * 40;
		double overtimeHours = hoursWorked - 40;
		double overtimePay = overtimeHours * hourlyRate * 1.5;
		double totalSalary = regularPay + overtimePay;

		System.out.println("Regular Pay: " + regularPay);
		System.out.println("Overtime Hours: " + overtimeHours);
		System.out.println("Overtime Pay: " + overtimePay);
		System.out.println("Total Salary: " + totalSalary);
		sc.close();
	}

}
