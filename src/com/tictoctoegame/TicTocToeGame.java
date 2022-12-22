package com.tictoctoegame;
import java.util.Scanner;
 public class TicTocToeGame {
	 static int row,col;
	 static char player='X';
	 private static void displayBoard(char[][] board) {
	        for (int i = 0; i < board.length; i++) {
	            for (int j = 0; j < board[i].length; j++) {
	                if (j == board[i].length - 1) 
	                	System.out.print(board[i][j]);
	                else
	                	System.out.print( board[i][j] + " | ");
	            }
	            System.out.println();
	        }}
	  static void uc1() {
		 System.out.println("*********Welcome in TicTocToeGame*********");
	 }
	 public static void main(String []args) {
		 uc1();
		 Scanner sc=new Scanner(System.in);
		 /*
		  * Create a board for each element
		  */
		 char[][] board=new char[3][3];
		 char ch='1';
		 for(int i=0;i<3;i++) {
			 for(int j=0;j<3;j++) {
				 System.out.print(ch+" | ");
				 board[i][j]=ch++; 
			 }
			 System.out.println();
		 }
		 /*
		  * Choose a player 'X'or 'Y'
		  */
		 System.out.println("Enter a row and column (0, 1, or 2); for player " + player + ":");
		 row = sc.nextInt();
         col = sc.nextInt();
         board[row][col] = player;
         displayBoard(board);

         
		 
	 }
 }