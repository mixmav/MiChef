package main;

import application.Meal;
import application.MealCategory;
public class Driver {

	public static void main(String[] args) {
		
		Meal meal = new Meal("Salmon Soba", MealCategory.MIDDLE_EASTERN, new String[] {"Atlantic Salmon", "Singapore Noodles", "Capsicum, Broccoli"}, 23.50);
		System.out.println(meal.getDetails());
	}

}
