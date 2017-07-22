package press.ludwig;

import java.util.Scanner;

public class TicTacToe {
	private static int rows, cols;
	private static char userSymbol = 'O';
	private static char computerSymbol = 'X';
	private static char[][] board;
	
	public TicTacToe() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to TicTacToe!");
		System.out.println("The aim of this game is to get your symbol in a row of 3 either horizontally, diagonally or vertically.");
		System.out.println("How large do you want the board to be?");
		System.out.printf("Please input a row length: ");
		
		rows = sc.nextInt();
		
		System.out.printf("Plese input a column length: ");
		
		cols = sc.nextInt();
		
		board = new char[rows][cols];
		
		System.out.println("Drawing board...");
		
		draw(rows, cols);
	}
	
	public void draw(int rows, int cols) {
		System.out.println("-----------------------");
		for (int i = 0; i <= rows; i++) {
			System.out.print("| ");
			for(int j = 0; j <= cols; j++) {
				board[i][j] = '-';
				System.out.print(board[i][j] + " | ");
			}
			System.out.println();
			System.out.println("-----------------------");
		}
	}
}
