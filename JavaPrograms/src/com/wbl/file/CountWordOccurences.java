 /*Write a program to search for a string in a 
 file and then return the count of number of occurrences of the string.*/
package com.wbl.file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CountWordOccurences {

	public static void main(String[] args) {
		FileReader fr;
		try {
			fr = new FileReader("C:/JavaBasics/text.txt");
			BufferedReader br = new BufferedReader(fr);
			int count = 0;
			String line = "";
			String name = "morning";
			try {
				while ((line = br.readLine()) != null) {
					if (line.contains(name)) {
						System.out.println(line);
						count++;
					}

				}
				System.out.println("Number of occurences of a string ::"+name+":: "+count);
			} catch (IOException e) {

				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
