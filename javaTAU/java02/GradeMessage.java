package java02;

import java.util.Scanner;

/*
Switch Statement
Have a user enter their letter grade, and using a switch statement,
Print out a message letting them know how they did.
 */

public class GradeMessage {

	public static void main(String[] args) {
		System.out.println("Enter your grade");
		Scanner scanner = new Scanner(System.in);
		String grade = scanner.next();
		scanner.close();

		String message;

		switch (grade) {
		case "A":
			message = "Excellent Job!";
			break;
		case "B":
			message = "Good Work!";
			break;
		case "C":
			message = "Keep Improving!";
			break;
		case "D":
			message = "Needs More Effort!";
			break;
		case "F":
			message = "Study Harder!";
			break;
		default:
			message = "Invalid grade!";
			break;
		}

		System.out.println(message);
	}

}
