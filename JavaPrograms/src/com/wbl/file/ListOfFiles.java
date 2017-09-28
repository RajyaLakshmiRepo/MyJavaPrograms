//4.e.Write a program to show list of all file names in a folder

package com.wbl.file;

import java.io.File;

public class ListOfFiles {

	public static void main(String[] args) {
		File directory = new File("C:/JavaBasics/My Directory");
		File[] listfiles = directory.listFiles();
		for(File file:listfiles){
			System.out.println("The list of files in the directory are::"+file.getName());
		}

	}

}
