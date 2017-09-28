/*Write a program  to calculate factorial of a given number. You need to compute the factorial
  with one logic that uses recursion and another logic without recursion.*/
    
package com.wbl.loops;

import java.util.Scanner;

public class Factorial {
	public void withOutRecursion(){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		int factorial = 1;
		if (n < 0) {
			System.out.println("Enter a valid number");
		} else if (n == 0 || n == 1) {

			System.out.println("Factorial of 0 and 1 is 1");
		} else {
			for (int i = 1; i <= n; i++) {
				factorial = factorial * i;
			}
			System.out.println("Factorial of n is::" + factorial);
		}
	}
	
	public void withRecursion() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();

		int factorial = fact(n);
		System.out.println(factorial);

	}

	private int fact(int n) {
		
		if (n == 0 || n == 1) {
		return 1;
			}
		int output = fact(n - 1) * n;
		return output;
	}

	public static void main(String[] args) {
		Factorial ft=new Factorial();
		//ft.withOutRecursion();
		ft.withRecursion();
	}

}
