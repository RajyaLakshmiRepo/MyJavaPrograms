package com.wbl.file;

import java.io.Console;

public class SampleConsole1 {
	  public static void main(String[] args) {
	Console co=System.console();
		  int ab=Integer.parseInt(args[0]);
		  int cd=Integer.parseInt(args[1]);
		  int add=ab+cd;
		  System.out.print(add);
	  }}