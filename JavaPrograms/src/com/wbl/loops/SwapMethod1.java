//Write a program that swaps 2 given numbers WITHOUT ANY THIRD VARIABLE
package com.wbl.loops;

import java.util.Scanner;

public class SwapMethod1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter any 2 nos");
		int i = scan.nextInt();
		int j = scan.nextInt();
		System.out.println("before swapping::");
		System.out.println(i);
		System.out.println(j);
		i = i + j;
		j = i - j;
		i = i - j;
		System.out.println("after swapping::");
		System.out.println(i);
		System.out.println(j);

	}

}
