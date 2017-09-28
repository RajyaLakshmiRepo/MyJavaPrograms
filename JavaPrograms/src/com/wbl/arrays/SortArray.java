//Write a program to sort an array.
package com.wbl.arrays;

public class SortArray {

	public static void main(String[] args) {

		int[] arr = { 3, 11, 8, 6, 32, 1 };
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-1; j++) {
				if (arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
			}
			
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(i+" element ::"+arr[i]);

		}

	}
}
