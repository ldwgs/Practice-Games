package press.ludwig;

import java.util.Scanner;

public class Main {
	public static int userInput;
	public static int choices = 1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the arcade!");
		System.out.println("Please choose a game to play:");
		System.out.println(choices + " - Guess the number"); choices++;
		System.out.println(choices + " - Guess the Computer's number"); choices++;
		System.out.println(choices + " - Tic Tac Toe"); choices++;
		System.out.println(choices + " - Exit"); choices++;
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		userInput = sc.nextInt();
		
		switch (userInput) {
		case 1 : new ComputerGuessGame();
				 break;
				 
		case 2 : new GuessComputerNumberGame();
				 break;
				 
		case 3 : new TicTacToe(); 
				 break;
		
		case 4 : System.out.println("Goodbye, thanks for playing!");
				 System.exit(0);
				 break;
				 
		default : System.out.print("I'm sorry, that's not a valid input");
		}
	}

}
