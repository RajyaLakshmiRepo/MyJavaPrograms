//// d.To print the elements in the reverse order using ListIterator.
package com.wbl.collections;

import java.util.ArrayList;

import java.util.List;
import java.util.ListIterator;

public class ListIterators {

	public static void main(String[] args) {
	
		List<String> names = new ArrayList<String>();

		names.add("aaaa");
		names.add("bbbb");
		names.add("cccc");
		names.add("dddd");
		names.add("eeee");
		
		//Collections.reverse(names);
		//System.out.println(names);

		ListIterator<String> litr = names.listIterator(names.size());

		//System.out.println(litr.next());
		
		while (litr.hasPrevious()) {
			System.out.println(litr.previous());
		}

	}

}
