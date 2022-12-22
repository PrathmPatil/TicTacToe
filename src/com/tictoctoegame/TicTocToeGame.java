package com.tictoctoegame;
import java.util.Scanner;
 public class TicTocToeGame {
	 static int row,col;
	 static char Player='X';
	  static void uc1() {
		 System.out.println("*********Welcome in TicTocToeGame*********");
	 }
	 public static void main(String []args) {
		 uc1();
		 Scanner sc=new Scanner(System.in);
		 /*
		  * Create a board for each element
		  */
		 char [][] board=new char[3][3];
		 char ch='1';
		 for(int i=0;i<3;i++) {
			 for(int j=0;j<3;j++) {
				 System.out.print(ch+" | ");
				 board[i][j]=ch++; 
			 }
			 System.out.println();
		 }
	 }
 }