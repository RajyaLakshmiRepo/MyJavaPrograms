//4.f.Write a program to copy content of file into another file.

package com.wbl.file;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class CopyContent {

	public static void main(String[] args) {
		try {
			FileInputStream sourcefile = new FileInputStream("C:/JavaPrograms/text1.txt");// from"text1.txt" file
			
		try {
				FileOutputStream targetfile = new FileOutputStream("C:/JavaPrograms/file");// from "file" file
																							
				int lines = 0;
				byte[] b = new byte[1024];

				while ((lines = sourcefile.read(b)) > 0) {
					targetfile.write(b, 0, lines);

				}
				sourcefile.close();
				targetfile.close();
				System.out.println("successfully copied from one file to another file");
				// need to read the copied content in target file
				FileReader fr=new FileReader("C:/JavaPrograms/file");
				BufferedReader br=new BufferedReader(fr);
				String line="";
				while((line=br.readLine())!=null){
					System.out.println("The copied content is::"+line);
				}
				sourcefile.close();
			} catch (IOException e) {

				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

	}

}
