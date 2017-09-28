package com.wbl.file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class CountWordsInFile {

	public static void main(String[] args) {
	
	try {
		FileReader fr=new FileReader("C:/JavaPrograms/text1.txt");
		BufferedReader br=new BufferedReader(fr);
		int words=0;
		String line=" ";
		
		
		try {
			while((line=br.readLine())!=null){
			StringTokenizer st=new StringTokenizer(line," ,.");
				while(st.hasMoreTokens()){
					words++;
					st.nextToken();
				}
				
			}
			
			System.out.println("no of words::"+words);
			
		} catch (IOException e) {
	
			e.printStackTrace();
		}
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
	}
	
}
}