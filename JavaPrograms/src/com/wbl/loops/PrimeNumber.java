package com.wbl.loops;

import java.util.Scanner;

public class PrimeNumber {
	
	
	public static void main(String[] args) {
		boolean isPrime = true;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter any no");
		int input = scan.nextInt();
	
		for (int i = 2; i <= input / 2; i++) {
			int temp = input%i;
			if (temp == 0) {
				
				isPrime = false;
				break;
			} 
		}
		if(isPrime){
			System.out.println(input+" given no is  a prime no");
		}
		else
			System.out.println(input+" given no is not a prime no");
	}
}