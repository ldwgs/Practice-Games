package press.ludwig;

import java.util.Scanner;

public class GuessComputerNumberGame {
	private static int computersNumber, minNumber, maxNumber, userGuess;
	private static int chances = 5;
	
	public GuessComputerNumberGame() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		Functions func = new Functions();
		
		System.out.println("Welcome to the Guess the Computer's Number Game!");
		System.out.println("In this game, the aim is for you to guess a number that I'll think of.");
		System.out.println("You will have 5 guesses to try and guess my number.");
		System.out.println("I need a range of numbers to pick from.");
		System.out.printf("Please input a minimum number: ");
		
		minNumber = sc.nextInt();
		
		System.out.printf("Please input a maximum number: ");
		
		maxNumber = sc.nextInt();
		
		System.out.println("Alright! Let me think of a number....");
		
		computersNumber = func.randomWithRange(minNumber, maxNumber);
		
		// for debugging purposes only.
		//System.out.println(computersNumber);
		
		System.out.printf("Got it! Your turn to guess: ");
		
		userGuess = sc.nextInt();
		
		while(userGuess != computersNumber) {
			chances--;
			System.out.println("Sorry! That's not my number. Please try again.");
			System.out.println("You have " + chances + " guesses left.");
			System.out.printf("Your guess: ");
			userGuess = sc.nextInt();
			
			if (chances == 1) { // Lost
				System.out.println("Sorry! you ran out of guesses. My number was: " + computersNumber);
				System.out.println("Hope you try again soon!");
				System.out.println("Program terminating...");
				System.exit(0);
			}
		}
		
		System.out.println("You got it! My number was: " + computersNumber); //Won
		System.out.println("Hope you play again soon!");
		System.out.println("Program terminating...");
		System.exit(0);
	}
}
