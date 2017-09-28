//3.e.Write a program to check for a palindrome string.
package com.wbl.strings;

import java.util.Scanner;

public class Pallindrome {

	public static void main(String[] args) {

		boolean isPalindrome = false;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter any word");
		String str = scan.next();
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);

			if (str.equals(rev)) {

				isPalindrome = true;
				break;
			}

		}
		if (isPalindrome) {
			System.out.println(" palindrome");
		} else
			System.out.println(" not palindrome");
	}
}
		
	
