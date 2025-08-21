package com.wipro.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springdemo.beans.Mobile;
import com.springdemo.beans.Display;

public class Appv2 {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext(Appv2.class);
		ctx.scan("com.springdemo.*");
		Display display=ctx.getBean(Display.class);
		display.setSize(25);
		Mobile mobile= ctx.getBean(Mobile.class);
		System.out.println(mobile);
	}
}