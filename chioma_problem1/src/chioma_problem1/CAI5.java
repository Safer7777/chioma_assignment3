package chioma_problem1;

import java.security.SecureRandom;
import java.util.Scanner;

public class CAI5 {

	private static final int EASY = 10;
	private static final int MEDIUM = 100;
	private static final int HARD = 1000;
	private static final int EXPERT = 10000;

	static SecureRandom random = new SecureRandom();
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {

		quiz();

	}

	private static void quiz() {

		while (true) {

			double totalCorrect = 0.0;
			int diffLevel = displayMenu();
			int problemType = readProblemType();

			for (int i = 0; i < 10; i++) {

				int firstNumber = generateQuestionArugment(diffLevel);
				int secondNumber = generateQuestionArugment(diffLevel);

				int answer = askQuestion(firstNumber, secondNumber, problemType);
				int response = readResponse();

				totalCorrect += isAnswerCorrect(response, answer);

				if (isAnswerCorrect(response, answer) == 1) {

					displayCorrectResponse();

				} else {

					displayIncorrectResponse();

				}
			}

			displayCompletionMessage(totalCorrect);
			
		}
	}
	
	private static int displayMenu() {

		while (true) {

			System.out.println("Would you like to run the program again?" +
							   "\nEnter y for yes" +
							   "\nEnter n for no" +
							   "\nEnter here: ");
			
			String selection = sc.nextLine();

			if (selection.charAt(0) == 'y') {
				return readDiffculty();
				
			} else if (selection.charAt(0) == 'n'){

				System.out.println("Goodbye!");
				System.exit(0);
			} 
		}
	}

	private static int askQuestion(int firstNumber, int secondNumber, int problemType) {

		switch (problemType) {
			case 1:
				System.out.printf("How much is %d + %d?: ", firstNumber, secondNumber);
				return firstNumber + secondNumber;
			case 2:
				System.out.printf("How much is %d * %d?: ", firstNumber, secondNumber);
				return firstNumber * secondNumber;
			case 3:
				System.out.printf("How much is %d - %d?: ", firstNumber, secondNumber);
				return firstNumber - secondNumber;
			case 4:
				System.out.printf("How much is %d / %d?: ", firstNumber, secondNumber);
				return firstNumber/secondNumber;
			case 5:
				switch (random.nextInt(4)) {
					case 0:
					System.out.printf("How much is %d + %d?: ", firstNumber, secondNumber);
					return firstNumber + secondNumber;
				case 1:
					System.out.printf("How much is %d * %d?: ", firstNumber, secondNumber);
					return firstNumber * secondNumber;
				case 2:
					System.out.printf("How much is %d - %d?: ", firstNumber, secondNumber);
					return firstNumber - secondNumber;
				case 3:
					System.out.printf("How much is %d / %d?: ", firstNumber, secondNumber);
					return firstNumber/secondNumber;
				}
			default: 
				return -1;
		}
	}

	private static int readResponse() {

		while(true) {

				String answer = sc.nextLine();
				int number = Integer.parseInt(answer);
				return number;
		}
	}

	private static int isAnswerCorrect(int userResponse, int userAnswer) {

		if (userResponse == userAnswer) {

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

	private static int readDiffculty() {

		while (true) {

			System.out.println("What diffculty level do you want? Easy, medium, hard or expert?");
			System.out.println("Enter 1 for easy" + 
							   "\nEnter 2 for medium" + 
			                   "\nEnter 3 for hard" + 
			                   "\nEnter 4 for expert" +
			                   "\nEnter selection here: ");
			
				String difficultySelected = sc.nextLine();
				int diff = Integer.parseInt(difficultySelected);
				return diff;

		}	
	}

	private static int readProblemType() {

		System.out.println("What kind of problems are we in the mood for today?" +
				 		   "\n\t1. Addition types problems only" +
				 		   "\n\t2. Multiplication types problems only" +
				 		   "\n\t3. Subtraction types problems only" +
				 		   "\n\t4. Divison types problems only (round to nearest whole number)" +
				 		   "\n\t5. A mixture of all types" +
				 		   "\n\tEnter selection here: ");

		while (true) {

				String typeSelected = sc.nextLine();
				int type = Integer.parseInt(typeSelected);
				return type;	 
		}
	}
	
	private static int generateQuestionArugment(int diffLevel) {

		switch (diffLevel){

		case 1:
			return random.nextInt(EASY);
		case 2:
			return random.nextInt(MEDIUM);
		case 3:
			return random.nextInt(HARD);
		case 4: 
			return random.nextInt(EXPERT);
		default:
			return -1;

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