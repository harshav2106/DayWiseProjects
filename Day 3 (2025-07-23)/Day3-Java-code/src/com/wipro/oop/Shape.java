package com.wipro.oop;

public class Shape {
	int area;
	int perimeter;
	
	
	
	public Shape() {
		super();
		
	}
	public Shape(int area, int perimeter) {
		super();
		this.area = area;
		this.perimeter = perimeter;
	}
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	public int getPerimeter() {
		return perimeter;
	}
	public void setPerimeter(int perimeter) {
		this.perimeter = perimeter;
	}
	@Override
	public String toString() {
		return "Shape [area=" + area + ", perimeter=" + perimeter + "]";
	}
	

}
