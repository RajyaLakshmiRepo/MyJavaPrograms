/*5.a.... Write a program having different methods to perform below operations.
  			--> To create an arraylist and add elements to it.
  			--> To search for an element in the list.
  			--> To print the elements of the list using iterator.
  			--> To print the elements in the reverse order using ListIterator.*/

package com.wbl.collections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class FiveA {

	// a.creating arrayList and adding elements to it
	public void arrayList() {
		List<String> names = new ArrayList<String>();
		names.add("aaaa");
		names.add("bbbb");
		names.add("cccc");
		names.add("dddd");
		names.add("eeee");

		// Iterating data into arrayList-method-1
		System.out.println("a.Iterating data using method-1");
		for (String name : names) {
			System.out.println(name);
		}
		System.out.println(".......................");
		names.add("zzzz"); // adding elements
		names.add(1, "wwww");

		// Iterating data into the arrayList-method-2
		System.out.println("a.Iterating data using method-2");
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		System.out.println(".......................");
		

		// b.To search for an element in the List
		System.out.println("b.To search for an element in the List");
		if (names.contains("dddd")) {
			System.out.println("Element is Present");
		} else {
			System.out.println("element not present");
		}
		
		System.out.println(".......................");
		
		// c.Printing the elements into the list using Iterator
		System.out.println("c.Printing the elements into the list using Iterator");
		Iterator<String> itr = names.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println(".......................");
		
}
	public static void main(String[] args) {
		FiveA lp=new FiveA();
		lp.arrayList();	

	}

}
