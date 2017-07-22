package press.ludwig;

import java.util.Scanner;

public class ComputerGuessGame {
	public static int userInput, userNumber, computerNumber;
	public static int minNumber = 0;
	public static int maxNumber = 0;
	
	public ComputerGuessGame() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		Functions func = new Functions();
		
		System.out.println("Welcome to the Guess-the-number game!");
		System.out.println("In this game, you think of a number and I have to guess what it is.");
		System.out.println("Please input a number I should guess: ");
		
		userNumber = sc.nextInt();
		
		System.out.println("I need a range to pick a number from.");
		System.out.printf("Please input a minimum number: ");
		
		minNumber = sc.nextInt();
		
		System.out.printf("Please input a maximum number: ");
		
		maxNumber = sc.nextInt();
		
		if (maxNumber <= minNumber) {
			System.out.println("I'm sorry, that number isn't larger than your minumum.");
			System.out.printf("Please input a maximum number: ");
		}
		
		// BUG: user needs to input this number twice. it only takes the second input and treats the first one as a new line.
		// perhaps it's a nextInt() bug.
		maxNumber = sc.nextInt(); 
		
		computerNumber = func.randomWithRange(minNumber, maxNumber);
		
		System.out.println("Your numbers are: " + minNumber + " and " + maxNumber);
		
		while (computerNumber != userNumber) { // BUG: repeats numbers
			System.out.println("Computer guess: " + computerNumber);
			computerNumber = func.randomWithRange(minNumber, maxNumber);
		}
		
		System.out.println("I got it! It's " + computerNumber + ". I win!");
		//System.out.println("Going back to the menu..."); //TODO: allow user to either play again or go back to the main menu.
	}
}
