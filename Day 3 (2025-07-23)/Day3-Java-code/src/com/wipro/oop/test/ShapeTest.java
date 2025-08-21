package com.wipro.oop.test;

import com.wipro.oop.Circle;
import com.wipro.oop.Rectangle;
import com.wipro.oop.Square;

public class ShapeTest {

	public static void main(String[] args) {
		Circle c = new Circle();
		c.setPerimeter(02);
		c.setArea(3);
		System.out.println(c);
		
		Rectangle r = new Rectangle();
		r.setPerimeter(4);
		r.setArea(5);
		System.out.println(r);
		
		Square s = new Square();
		s.setPerimeter(6);
		s.setArea(7);
		System.out.println(s);
		
		

	}

}
