package chioma_problem1;

import java.security.SecureRandom;
import java.util.Scanner;

public class CAI3 {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {

		quiz();

	}

	private static void quiz() {

		SecureRandom random = new SecureRandom();
		double totalCorrect = 0.0;

		while (true) {

			if (displayMenu() == 1) {

				for (int i = 0; i < 10; i++) {

					int firstNumber = random.nextInt(10); 
					int secondNumber = random.nextInt(10);
					int correctAnswer = firstNumber * secondNumber;

					askQuestion(firstNumber, secondNumber);
					int userResponse = readResponse();

					
					totalCorrect += isAnswerCorrect(userResponse, correctAnswer);

					if (isAnswerCorrect(userResponse, correctAnswer) == 1) {

						displayCorrectResponse();

					} else {

						displayIncorrectResponse();

					}

					if (i == 10-1) {

						displayCompletionMessage(totalCorrect);

					}
				}
			}
		}
	}

	private static int displayMenu() {

		while (true) {

			System.out.println("Would you like to run the program again?" +
					   		   "\nEnter y for yes" +
					   		   "\nEnter n for no" +
					   		   "\nEnter here: ");
			
			String choice = sc.nextLine();

			if (choice.charAt(0) == 'y') {

				return 1;

			} else if (choice.charAt(0) == 'n'){

				System.out.println("Goodbye!");
				System.exit(0);
			
			}
		}
	}

	private static void askQuestion(int firstNumber, int secondNumber) {

		System.out.printf("What is the value of %d * %d? Enter here: ", firstNumber, secondNumber);
		
	}

	private static int readResponse() {

		while(true) {

			String answer = sc.nextLine();
			int number = Integer.parseInt(answer);
			return number;		
		}
	}

	private static int isAnswerCorrect(int userResponse, int correctAnswer) {

		if (userResponse == correctAnswer) {

			return 1;

		} else {

			return 0;
		}
	}


	private static void displayCompletionMessage(double totalCorrect) {

		double userScore;

		if (totalCorrect/10 == 1) {
			
			userScore = 10;
			
		} else {

			userScore = totalCorrect/10;

		}

		if (totalCorrect/10 > 0.75) {

			System.out.printf("Your score was: %.0f percent" , userScore * 100);
			System.out.println("\nCongratulations, you are ready to go to the next level!\n");
			

		} else {

			System.out.printf("Your score was: %.0f percent" , userScore * 100);
			System.out.println("\nPlease ask your teacher for extra help!\n");

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