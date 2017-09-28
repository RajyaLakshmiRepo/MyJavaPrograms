// to find the common number in any given two arrays.
package com.wbl.arrays;
public class CommonNo {
	public void dupEle() {
		int[] arr1 = { 2, 5, 8, 14, 9, 45 };
		int[] arr2 = { 5, 18, 45, 17, 1, 0, 3 };

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					System.out.println(arr1[i]);
				}
			}
		}
	}

	public static void main(String[] args) {

		CommonNo cn = new CommonNo();
		cn.dupEle();

	}

}
