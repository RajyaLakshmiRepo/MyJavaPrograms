// Write a program that prints a fibonacci series that is a sequence of numbers like0 1 1 2 3 5 8.
package com.wbl.loops;

public class FibonacciSeries {

	public static void main(String[] args) {
		int count = 20;

		int[] f = new int[count];
		f[0]=0;
		f[1]=1;
		System.out.println(f[0]);
		System.out.println(f[1]);
		for (int i = 2; i < count; i++) {
			f[i] = f[i - 1] + f[i - 2];
			
			System.out.println(f[i]);
		}

		
	}
}
