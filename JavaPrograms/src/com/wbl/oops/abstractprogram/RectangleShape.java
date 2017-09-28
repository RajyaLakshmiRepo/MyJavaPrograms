//creating an abstract class Shape with properties (noOfSides,area,perimeter)
//and methods(calculateArea,calculatePerimeter,setSides).
package com.wbl.oops.abstractprogram;

public  class RectangleShape extends Shape{
	float length=5f;
	float breadth=8f;
	
	@Override
	public void calculateArea() {
	float area=length*breadth;
	System.out.println("The Area of Rectangle is::"+area);
	}

	@Override
	public void calculatePerimeter() {
		float sumSides= length+ breadth;
		float perimeter=2*sumSides;
		System.out.println("The perimeter of Rectangle is ::"+perimeter);
	}

	@Override
	public int setSides() {
		return 4;
	}
	
}
