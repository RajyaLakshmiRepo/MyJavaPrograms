/*8.b. Write a program to print 1 to 10 numbers 
without using loops and you should not have more than 1 print statement.*/
package com.wbl.general;

public class EightB {


	public static void main(String[] args) {
	
		IncrementByOneNo(1);
	}

	private static void IncrementByOneNo(int i) {
		System.out.println(i);
		i++;
		if (i <= 10) {
			IncrementByOneNo(i);
		}

	}

}
