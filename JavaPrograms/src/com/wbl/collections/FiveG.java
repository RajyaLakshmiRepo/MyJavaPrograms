//5.g. Write a program to copy arraylist to an array.

package com.wbl.collections;

import java.util.ArrayList;
import java.util.List;

public class FiveG {

	public static void main(String[] args) {
	
		List<String> arrlist=new ArrayList<String>();
		arrlist.add("mango");
		arrlist.add("apple");
		arrlist.add("orange");
		arrlist.add("cherry");
		
		System.out.println("ArrayList elements are::"+arrlist);
		
		String[] arr=new String[arrlist.size()];
		arrlist.toArray(arr);
		System.out.println("from arraylist to array::");
		for(String array:arr){
			System.out.println(array);
		}
	}

}
