/*4.a. Write a program that takes input from user dynamically using below classes.
  			i--> Scanner: Use this class to input 2 integer numbers and sum them.
  			ii--> BufferedReader and InputStreamReader: Use this classes to input 2 integer numbers and subtract them.
  			iii--> DatainputStream: Use this class to input 2 integer numbers and multiply them.
  			iv--> Console: Use this class to input 2 integer numbers and divide them.*/
package com.wbl.file;

import java.io.BufferedReader;
import java.io.Console;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputDynamically {
	//4.a.i.
	public void scanner(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Giving input dynamically using Scanner::");
		System.out.println("enter first number");
		int a=sc.nextInt();
		System.out.println("enter second number");
		int b=sc.nextInt();
		System.out.println("Result after adding two numbers:: "+Math.addExact(a, b));
	}	
	
	// 4.a.ii
	public void bufferedReader() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Giving input dynamically using BufferReader:::");
			System.out.println("enter 2 numbers");

			String a = br.readLine();
			String b = br.readLine();

			int input1 = Integer.parseInt(a);
			int input2 = Integer.parseInt(b);
			System.out.println("Result after subtracting 2 numbers:: " + Math.subtractExact(input1, input2));

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

  //4.a.iii.
	
	@SuppressWarnings("deprecation")
	public void dataInputStream() throws IOException {
		System.out.println("Giving input dynamically using DataInputStream:::");
		DataInputStream dis = new DataInputStream(System.in);
		System.out.println("enter 2 numbers");
		int a = Integer.parseInt(dis.readLine());
		int b = Integer.parseInt(dis.readLine());
		
		System.out.println("a value::" + a);
		System.out.println("b value::" + b);
		// System.out.println("Multiple value : " + (a * b));
		System.out.println("Result after multiplying 2 numbers:: " + Math.multiplyExact(a, b));
	}
	

	public static void main(String[] args) throws IOException {
		InputDynamically id = new InputDynamically();
		 id.scanner();
		// id.bufferedReader();
		// id.consoleInput();
		// id.dataInputStream();

	}

}
