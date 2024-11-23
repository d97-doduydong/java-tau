package java02;

import java.util.Scanner;

/*
Nested If Statement
To qualify for a loan, a person must earn at least $30,000
And have been working at their current job for at least 2 years
 */

public class LoanQualifier {

	public static void main(String[] args) {
		int requiredSalary = 30000;
		int requiredYearsEmployed = 2;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter your salary:");
		double salary = scanner.nextDouble();

		System.out.println("Enter the number of years with your current employer:");
		float years = scanner.nextFloat();

		scanner.close();

		if (salary >= requiredSalary) {
			if (years >= requiredYearsEmployed) {
				System.out.println("Congrats! You qualify for the loan");
			} else {
				System.out.println("You must have been working at your current job for at least " + requiredYearsEmployed + " years");
			}
		} else {
			System.out.println("Sorry, you must earn at least $" + requiredSalary + " to qualify for the loan");
		}
	}

}
