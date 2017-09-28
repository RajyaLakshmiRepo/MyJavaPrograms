// Write a program to implement hashCode() and equals() methods.
package com.wbl.strings;

public class HashCodeandEquals {
	
	public void HashCode(){
		String str="How are you today?";
		System.out.println("In HashCode Method::");
		System.out.println(str.hashCode());
	}
	
	 public void Equals(){
		String s1="Good Morning";    //declared using string literal
		String s2="Good Morning";
		System.out.println("In Equals Method::");
		if((s1).equals(s2)){          //or if(s1==s2) here it shows the same reference
		
			System.out.println("strings are equal");
		}else
			
			System.out.println("strings are not equal");
	}

	public static void main(String[] args) {
	HashCodeandEquals heq=new HashCodeandEquals();
	heq.Equals();
	heq.HashCode();
	}

}
