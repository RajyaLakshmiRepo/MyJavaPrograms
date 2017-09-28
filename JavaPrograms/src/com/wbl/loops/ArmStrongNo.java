//1.f. Write a program  to check an armstrong number 
package com.wbl.loops;

import java.util.Scanner;

public class ArmStrongNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int armstrongnum = sc.nextInt();
		if (isArmstrong(armstrongnum)) {
			System.out.println("Given number is an armstrong number");
		} else {
			System.out.println("Given number is not an armstrong number");
		}

	}

	private static boolean isArmstrong(int armstrongnum) {
		int r, result = 0;
		int originalnum = armstrongnum;
		while (armstrongnum != 0) {
			r = armstrongnum % 10;
			System.out.println("r" + r);
			result = result + r * r * r;
			System.out.println("result" + result);
			armstrongnum = armstrongnum / 10;
			System.out.println("armnum" + armstrongnum);
		}
		if (result == originalnum) {
			return true;
		}
		
		return false;
	}

	

	

}
