package chioma_problem1;

import java.security.SecureRandom;
import java.util.Scanner;

public class CAI1 {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {

		quiz();

	}

	public static void quiz() {


		SecureRandom random = new SecureRandom();

		int firstNumber = random.nextInt(10); 
		int secondNumber = random.nextInt(10);
		int correctAnswer = firstNumber * secondNumber;

		while(true) {

			askQuestion(firstNumber, secondNumber);
			int userResponse = readResponse();
			isAnswerCorrect(userResponse, correctAnswer);

		}
	}

	public static void askQuestion(int firstNumber, int secondNumber) {

		System.out.println("Let us perform a simple multiplication problem\n");
		System.out.printf("What is the value of %d * %d? Enter here: ", firstNumber, secondNumber);

	}

	public static int readResponse() {
		
		while(true) {

				String correctAnswer = sc.nextLine();
				int number = Integer.parseInt(correctAnswer);
				return number;

		}
	}

	public static void isAnswerCorrect(int response, int answer) {

		if (response == answer) {
			displayCorrectResponse();
			System.exit(0);
		} else {
			displayIncorrectResponse();
		}
	}
	
	public static void displayCorrectResponse() {

		System.out.println("\nYou got it right, very good!");
		
	}

	public static void displayIncorrectResponse() {

		System.out.println("\nThat is not the correct answer... please try again.");

	}
}