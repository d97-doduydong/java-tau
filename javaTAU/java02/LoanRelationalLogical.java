package java02;

import java.util.Scanner;

/*
Relational and Logical Operators
To qualify for a loan, a person must earn at least $30,000
And have been working at their current job for at least 2 years
 */

public class LoanRelationalLogical {

	public static void main(String[] args) {
		int requiredSalary = 30000;
		int requiredYearsEmployed = 2;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter your salary:");
		double salary = scanner.nextDouble();

		System.out.println("Enter the number of years with your current employer:");
		float years = scanner.nextFloat();

		scanner.close();

		if (salary >= requiredSalary && years >= requiredYearsEmployed) {
			System.out.println("Congrats! You qualify for the loan");
		} else {
			System.out.println("Sorry, you must earn at least $" + requiredSalary + " and have worked at your current job for at least " + requiredYearsEmployed + " years to qualify for the loan.");
		}
	}

}
