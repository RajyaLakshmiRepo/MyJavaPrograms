
package com.wbl.oops.abstractprogram;

public class ShapeTest {

	public static void main(String[] args) {
		Shape shape=new RectangleShape();
		shape.setSides();
	    System.out.println(shape.setSides());
	    shape.calculatePerimeter();
	    shape.calculateArea();
	    
	   
	    shape=new CircleShape();
	    shape.setSides();
	    System.out.println(shape.setSides());
	    shape.calculateArea();
	    shape.calculatePerimeter();
	}

}
