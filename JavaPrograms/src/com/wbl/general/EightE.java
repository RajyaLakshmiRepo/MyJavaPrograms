package com.wbl.general;

public class EightE {
	
	static {
		System.out.println("static block will be called first");
	}
	
	public EightE() {
		System.out.println("Constructor");
	}

	public static void main(String[] args) {
		EightE ee = new EightE();

	}

}
