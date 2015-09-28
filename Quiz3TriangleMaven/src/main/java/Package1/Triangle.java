package Package1;

import java.util.Scanner;
import java.lang.Math;

/**
 * This method extends GeometricObject.  It has three attributes: side1, side2, and side3.
 * The abstract methods getPerimeter() and getArea() have been written. The method
 * toString() has also been updated to include more characteristics of Triangle.
 * 
 * @author Olivia
 *
 */
public class Triangle extends GeometricObject {
	
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	
	//constructors
	public Triangle(){	
	}
	public Triangle(double side1, double side2, double side3){
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	//setters for side1, side2, side3. Both with the side values as parameters and with Scanner input
	public void setSide1(double side1){
		this.side1 = side1;
	}
	public void setSide2(double side2){
		this.side2 = side2;
	}
	public void setSide3(double side3){
		this.side3 = side3;
	}
	public void setSide1(){
		Scanner SS1 = new Scanner(System.in);
		System.out.println("Please enter a value for side1: ");
		this.side1 = SS1.nextDouble();
	}
	public void setSide2(){
		Scanner SS2 = new Scanner(System.in);
		System.out.println("Please enter a value for side2: ");
		this.side2 = SS2.nextDouble(); 
	}
	public void setSide3(){
		Scanner SS3 = new Scanner(System.in);
		System.out.println("Please enter a value for side2: ");
		this.side3 = SS3.nextDouble();
	}
	
	//getters for side1, side2, and side3
	public double getSide1(){
		return this.side1;
	}
	public double getSide2(){
		return this.side2;
	}
	public double getSide3(){
		return this.side3;
	}
	
	//abstract methods in GeometricObject
	public double getPerimeter(){
		double perimeter = side1 + side2 + side3;
		return perimeter;
	}
	public double getArea(){
		double area = Math.sqrt((getPerimeter()/2)*((getPerimeter()/2) - side1)*((getPerimeter()/2) - side2)*((getPerimeter()/2) - side3));
		return area;
	}
	
	//returns a string that includes everything about the triangle
	@Override //overrides GeometricObject.toString() and Object.toString()
	public String toString(){
		return "Created on: " + getDateCreated() + "\ncolor: " + getColor() +
			      "filled: " + isFilled() + "\nside1: " + side1 + 
			      "side2 :" + side2 + "\nside3 :" + side3 +
			      "Perimeter: " + getPerimeter() + "\nArea: " + getArea();
	}
}
