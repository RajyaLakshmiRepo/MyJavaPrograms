/*  6.c::Write a program that creates a class Circle extending Shape abstract class and has following behavior.
  			--> Properties: radius.
  			--> Constructor: To set number of sides.
  			--> Overrides all the methods from parents*/
package com.wbl.oops.abstractprogram;

public class CircleShape extends Shape{

	public float pi=3.14f;
	float r=10f;
	@Override
	public void calculateArea() {
		float area=pi*r*r;
		System.out.println("The area of Circle is ::"+area);
	}

	@Override
	public void calculatePerimeter() {
		float perimeter= 2*pi*r;
		System.out.println("The perimeter of circle is ::"+perimeter);
	}

	@Override
	public int setSides() {
		return 0;
		}


	
}
