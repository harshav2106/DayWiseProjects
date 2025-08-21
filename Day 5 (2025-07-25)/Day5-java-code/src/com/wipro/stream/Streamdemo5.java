package com.wipro.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Streamdemo5 {

	public static void main(String[] args) {
		FoodItem f1 = new FoodItem("Veg Manchurian", "Veg", "Chinese", 220);
        FoodItem f2 = new FoodItem("Chicken Manchurian", "Non Veg", "Chinese", 250);
        FoodItem f3 = new FoodItem("Paneer Tikka", "Veg", "Indian", 180);
        FoodItem f4 = new FoodItem("dal", "Veg", "Indian", 100);
        FoodItem f5 = new FoodItem("Fried Rice", "Veg", "Chinese", 180);
        FoodItem f6 = new FoodItem("Salad", "Veg", "Indian", 170);
        FoodItem f7 = new FoodItem("Fish", "Non Veg", "Indian", 320);

        List<FoodItem> menuList = new ArrayList<>();
        menuList.add(f1);
        menuList.add(f2);
        menuList.add(f3);
        menuList.add(f4);
        menuList.add(f5);
        menuList.add(f6);
        menuList.add(f7);

        List<FoodItem> chineseFoods = menuList.stream()
            .filter(item -> item.getCuisine().equalsIgnoreCase("Chinese"))
            .collect(Collectors.toList());

        System.out.println(chineseFoods);

	}

}
