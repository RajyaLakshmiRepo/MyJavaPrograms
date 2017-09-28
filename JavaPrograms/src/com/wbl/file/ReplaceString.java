//4.d. Write a program to search for a string in a file and then replace it with another string
package com.wbl.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReplaceString {

       public static void main(String[] args) {
		
		
		try {
			File file=new File("C:/JavaPrograms/text1.txt");
		    BufferedReader br = new BufferedReader(new FileReader(file));
			String oldtext = "morning";
			String newtext = "evening";
			String line = "";
			try {
				while ((line = br.readLine()) != null) {
					System.out.println(line);

				}
				br.close();
				newtext = line.replaceAll(oldtext, newtext);
				FileWriter fw = new FileWriter("C:/JavaPrograms/text1.txt");
				fw.write(newtext);
				fw.flush();
				fw.close();
		

			} catch (IOException e) {

				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
}
	
	
		
		
		
		
		
		
	
