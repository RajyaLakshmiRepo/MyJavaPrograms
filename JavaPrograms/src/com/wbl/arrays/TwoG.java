package com.wbl.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoG {

	public static void main(String[] args) {
		String[] i = { "a", "b", "c", "d" };
		String[] j = { "x", "y", "z" };
		List<String> li = new ArrayList<String>(Arrays.asList(i));
		li.addAll(Arrays.asList(j));
		Object[] arr = li.toArray();
		System.out.println("Array Elements after merging ::" + Arrays.toString(arr));
	}

}
