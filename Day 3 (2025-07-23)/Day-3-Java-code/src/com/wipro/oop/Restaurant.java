package com.wipro.oop;

public class Restaurant {
	String RestaurantId;
	String Restaurantname;
	String[] restaurantMenu;
	
	public Restaurant(String RestaurantId,String Restaurantname,String[] restaurantMenu) {
		super();
		RestaurantId = RestaurantId;
		Restaurantname = Restaurantname;
		this.restaurantMenu = restaurantMenu;
	}

	public String getRestaurantId() {
		return RestaurantId;
	}

	public void setRestaurantId(String restaurantId) {
		RestaurantId = restaurantId;
	}

	public String getRestaurantname() {
		return Restaurantname;
	}

	public void setRestaurantname(String restaurantname) {
		Restaurantname = restaurantname;
	}

	public String[] getRestaurantMenu() {
		return restaurantMenu;
	}

	public void setRestaurantMenu(String[] restaurantMenu) {
		this.restaurantMenu = restaurantMenu;
	}
	
}
