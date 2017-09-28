/*Write a program which accepts a string like "This is nice" and 
converts it to a string like "This1 is2 nice3".*/

package com.wbl.strings;

public class StringConversion {
	
	public static void main(String[] args) {
		String sentence="This is nice";
		System.out.println("Initial String is::"+sentence);
        System.out.println("Converted String is::"+sentence.replace("This is nice", "This1 is2 nice3"));
	}

}
