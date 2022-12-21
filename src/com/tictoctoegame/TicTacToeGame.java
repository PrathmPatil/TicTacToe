package com.tictoctoegame;
import java.util.Scanner;

public class TicTacToeGame {
	static char [] charactor;
//  
	public static void uc1() {
		System.out.println("**Welcome In TicTacToe Game**");
	}
	public static void uc2() {
		
	}
	public static void uc3() {
		
	}
	public static void uc4() {
		
	}
	public static void uc5() {
		
	}
	public static void uc6() {
		
	}
    public static void uc7() {
		
	}
    public static void uc8() {
	
    }
    public static void uc9() {
	
    }
    public static void uc10() {
	
    }
    public static void uc11() {
		
	}
    public static void uc12() {
		
	}
    public static void uc13() {
    	
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//charactor [10]=sc.next().charAt(0);
		char[] a = sc.next().toCharArray();
		//TicTacToeGame.uc1();
		int j=1;
		System.out.println("Hii");
		for(int i=0;i<3;i++)
		{
			
                for(int k=0;k<3;k++)
                {
                	System.out.print(a[j]+" ");	
                	j++;
                }
			
        		System.out.println();

		}
		}

}
