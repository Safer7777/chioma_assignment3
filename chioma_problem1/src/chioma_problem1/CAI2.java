package chioma_problem1;

import java.security.SecureRandom;
import java.util.Scanner;

public class CAI2 {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {

		quiz();

	}

	private static void quiz() {

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

	private static void askQuestion(int firstNumber, int secondNumber) {

		System.out.println("Let us perform a simple multiplication problem\n");
		System.out.printf("What is the value of %d * %d? Enter here: \n", firstNumber, secondNumber);
	}
	private static int readResponse() {
		
		
			while(true) {

				String answer = sc.nextLine();
				int number = Integer.parseInt(answer);
				return number;
				
		}
	}

	private static void isAnswerCorrect(int response, int answer) {

		if (response == answer) {
			
			displayCorrectResponse();
			System.exit(0);
			
		} else {

			displayIncorrectResponse();
		}
	}

	private static void displayCorrectResponse() {

		SecureRandom random = new SecureRandom();

		int userResponse = 0;
		userResponse = random.nextInt(4);

		switch (userResponse) {

		case 0:
			System.out.println("You got it right, very good!\n");
			break;
		case 1:
			System.out.println("You are on fire!\n");
			break;
		case 2:
			System.out.println("Keep going!\n");
			break;
		case 3:
			System.out.println("Well done!\n");
			break;
		default:
			System.out.println("Well done!\n");
			break;
	}
}

private static void displayIncorrectResponse() {

	SecureRandom random = new SecureRandom();

	int userResponse = 0;
	userResponse = random.nextInt(4);

	switch (userResponse) {

		case 0:
			System.out.println("That is not the correct answer... please try again.\n");
			break;
		case 1:
			System.out.println("No that isn't correct.\n");
			break;
		case 2:
			System.out.println("That answer is wrong...\n");
			break;
		case 3:
			System.out.println("No, don't give up.\n");
			break;
		default:
			System.out.println("No, don't give up.\n");
			break;
		}
	}
}