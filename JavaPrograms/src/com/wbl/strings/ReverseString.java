/*Write a program to reverse a string.
 Do not use StringBuffer/StringBuilder inbuilt reverse function.*/
package com.wbl.strings;

public class ReverseString {
	
		public static void main(String[] args) {
	     String str="Hello World";
	     char[] ch=str.toCharArray();
	     int i=0;
	     int j=ch.length-1;
	     while(i<=j){
	    	 char temp=ch[i];
	    	 ch[i]=ch[j];
	    	 ch[j]=temp;
	    	 i++;
	    	 j--;
	     }
		System.out.println("Initial string is ::"+str);
		System.out.println(ch);
	}

}
	
