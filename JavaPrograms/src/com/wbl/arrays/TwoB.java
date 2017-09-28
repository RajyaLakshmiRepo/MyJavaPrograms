/*2.b. Write a program to find the missing number in
a series of sorted numbers stored in an array.*/
package com.wbl.arrays;

import java.util.ArrayList;

public class TwoB {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int a[] = { 1, 2, 5, 7, 9, 10, 12 };
		int missing = a[0];
		for (int i = 0; i < a.length; i++) {
			if (missing == a[i]) {
				missing++;

			} else {
				arr.add(missing);
				i--;
				missing++;
			}
		}
		System.out.println("missing numbers are:: ");
		for (int elements : arr) {
			System.out.println(" " + elements);
		}
	}

}
