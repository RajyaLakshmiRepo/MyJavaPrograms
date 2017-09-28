/*Write a program print "ping" if a number is divisible by 3,"pong" if a number is divisible by 5, 
and "ping pong" if number is divisible by both, else print the number.*/
 package com.wbl.loops;

import java.util.Scanner;

public class PingPong {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter any no");
		int i = scan.nextInt();
	 if(i%3==0){
		 System.out.println("ping");
	 }
	 if(i%5==0){
		 System.out.println("pong");
	 }
	 if((i%3==0)&&(i%5==0)){
		 System.out.println("pingpong");
	 }
		 else{
			 System.out.println(i);
		 }
	}
}
	 
	 

	

	
