package pracafterexambuang;

import java.util.Scanner;

public class bombuang {

	public static void main(String[] args) {
		
		
		double hoursWorked =0;
		double hourlyRate =0;
		double OThourlyRate = 0;
		double OTPay = 0;
		double grossSalary = 0;
		char category = 0;
		double bonus = 0;
		double regularPay;
		
		Scanner pepenironi = new Scanner(System.in);
		System.out.print("Name: ");
		String name = pepenironi.nextLine();
		System.out.print("\nChoose a Letter for Employee Category: "
				+ "\n|A| for Regular Employee \n|B| for Part-Time Employee"
				+ "			\n|C| for Contract Employee"
				+ "			\n|D| for Manager\n");
		char category1 = pepenironi.next().charAt(0);

		switch (category1) {
			case 'A':
				System.out.print("\nNumber of hours worked: ");
				 hoursWorked = pepenironi.nextDouble();
				System.out.print("Hourly Rate: ");
				 hourlyRate = pepenironi.nextDouble();
				bonus = 2000;
				
				if (hoursWorked > 40) {
					OThourlyRate = hourlyRate * 1.5;
					OTPay = (hoursWorked - 40) * OThourlyRate; }
				break;
				
			case 'B':
				System.out.print("\nNumber of hours worked: ");
				 hoursWorked = pepenironi.nextDouble();
				System.out.print("Hourly Rate: ");
				 hourlyRate = pepenironi.nextDouble();
				bonus = 500;
				break;
			
			case 'C':
				System.out.print("\nNumber of hours worked: ");
				 hoursWorked = pepenironi.nextDouble();
				System.out.print("Hourly Rate: ");
				 hourlyRate = pepenironi.nextDouble();
				bonus = 1500;
				
				if (hoursWorked > 40) {
					OThourlyRate = hourlyRate * 1.25;
					OTPay = (hoursWorked - 40) * OThourlyRate; }
				break;
				
			case 'D':
				System.out.print("\nNumber of hours worked: ");
				 hoursWorked = pepenironi.nextDouble();
				System.out.print("Hourly Rate: ");
				 hourlyRate = pepenironi.nextDouble();
				bonus = 5000;
				break;
				
			default:
				System.out.print("\nInvalid category");
				break;
		}
		pepenironi.close();
		
		
		regularPay = hoursWorked * hourlyRate;
		grossSalary = regularPay + OTPay + bonus;
		
		System.out.println("\nEmployee Name: " + name
				+ "\nEmployee Category: " + category1
				+"\nNumber of hours worked: " + hoursWorked
				+"\nHourly rate: " + hourlyRate);
		System.out.println("\nRegular Pay: " + regularPay
				+ "\nOvertime Pay: " + OTPay
				+ "\nBonus: " + bonus
				+ "\nGross Salary: " + grossSalary);
		}
	}


