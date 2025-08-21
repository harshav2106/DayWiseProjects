package com.wipro.oop.test;

import com.wipro.oop.Restaurant;

public class RestaurantTest {
	public static void main(String[] args) {
		Restaurant res1 = new Restaurant("rest","victory Hotel",new String[] {"Italian","Chinese"});
		System.out.println(res1.toString());
	}

}
