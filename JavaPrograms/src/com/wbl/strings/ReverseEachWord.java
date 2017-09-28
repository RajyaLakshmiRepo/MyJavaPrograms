//Write a program to reverse each individual word in a sentence.
package com.wbl.strings;

public class ReverseEachWord {

	public static void main(String[] args) {
		String str = "Good Morning How are you today";

		String revstring = "";
		String[] words = str.split(" ");
		for (int i = 0; i < words.length; i++) {

			String eachword = words[i];
			String revword = "";

			for (int j = eachword.length() - 1; j >= 0; j--) {

				revword = revword + eachword.charAt(j);

			}
			revstring = revstring + revword + " ";

		}
        System.out.println(str);
		System.out.println("After reversing each word:: "+revstring);

	}

}
