package com.oops;

abstract class Shapes{
		abstract void draw();
}
class Line extends Shape{
	void draw() {
		System.out.println("Line drawn");
	}
}
class Rectangle extends Shape{
	void draw() {
		System.out.println("Rectangle drawn");
	}
}
class Cube extends Shape{
	void draw() {
		System.out.println("Cube drawn");
	}
}
public class Shape {
	public static void main(String[] args) {
		
		Line l=new Line();
		Rectangle r=new Rectangle();
		Cube c=new Cube();
		l.draw();
		r.draw();
		c.draw();
	}
}
