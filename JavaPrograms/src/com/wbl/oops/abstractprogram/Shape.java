//creating an abstract class Shape with properties (noOfSides,area,perimeter)
//and methods(calculateArea,calculatePerimeter,setSides).

package com.wbl.oops.abstractprogram;

public abstract class Shape {
	protected int noOfSides;
	protected double area;
	protected double perimeter;
	
	public abstract void calculateArea();
		
	public abstract void calculatePerimeter();
		
	public abstract int setSides();
		
}
