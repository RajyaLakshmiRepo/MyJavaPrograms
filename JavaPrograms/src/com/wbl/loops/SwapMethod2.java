//Write a program that swaps 2 given numbers USING THIRD VARIABLE
package com.wbl.loops;

import java.util.Scanner;

public class SwapMethod2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter any 2 nos");
		int i = scan.nextInt();
		int j = scan.nextInt();
		int temp=0;
		System.out.println("before swapping::");
		System.out.println(i);
		System.out.println(j);
		temp=j;
		j=i;
		i=temp;
		System.out.println("after swapping::");
		System.out.println(i);
		System.out.println(j);
		
		
	}

}
