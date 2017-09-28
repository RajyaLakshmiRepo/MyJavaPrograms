//5.b::Write a program to find duplicates in an array using set.
package com.wbl.collections;

import java.util.HashSet;
import java.util.Set;

public class FiveB {
    
	public void findDuplicates() {
		String[] array = { "alan", "john", "rosy", "john" };

		Set<String> names = new HashSet<String>(); 
		for (String arrayele : array) {
			if (!names.add(arrayele)) {
				System.out.println("duplicate element in this array is ::" + arrayele);
			}
		}
	}

	public static void main(String[] args) {
		FiveB ds = new FiveB();
		ds.findDuplicates();
	}
}


