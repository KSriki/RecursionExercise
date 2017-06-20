/*
 * Recursion practice exercises
 * Srikant Kumar Kalaputapu
 * June 20th, 2017
 */
import java.io.File;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicSplitPaneUI.KeyboardDownRightHandler;

public class MainEntry {

	public static void main(String[] args){
		
		//Assignment 1
		System.out.println(fib(20));
		
		//Assignment 2
		
		int n; Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter an integer: ");
		n = keyboard.nextInt();
		
		collatz(n);
	
		
		
	}
	
	public static int fib(int n){
		if(n <= 2){
			//System.out.println(n);
			return 1;
		}
		else{
			//System.out.println(n);
			
			return fib(n-1) + fib(n-2);
			
		}		
		
	}
	
	public static void collatz(int n){
		System.out.println(n);
		if(n == 1){
			return;
		}
		else if(n % 2 == 0){
			n = n/2;
		}
		else{
			n = (3*n) + 1;
		}
		collatz(n);
	}
}
	
