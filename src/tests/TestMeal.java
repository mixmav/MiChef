package tests;

import application.Meal;
import application.MealCategory;
import utilities.Helpers;

public class TestMeal {
	public void testPassInstantiation() {
		Meal[] meals = {};
		
		Meal meal1 = new Meal("Salmon Soba", MealCategory.MIDDLE_EASTERN, new String[] {"Atlantic Salmon", "Singapore Noodles", "Capsicum", "Broccoli"}, 30);
		meals = Helpers.pushToMealsArray(meals, meal1);
		
		Meal meal2 = new Meal("Butter Chicken", MealCategory.INDIAN, new String[] {"Chicken", "Tomatoes", "Capsicum"}, 23.50);
		meals = Helpers.pushToMealsArray(meals, meal2);
		
		Meal meal3 = new Meal("Red Pasta", MealCategory.EUROPEAN, new String[] {"Pasta", "Tomatoes", "onions"}, 26);
		meals = Helpers.pushToMealsArray(meals, meal3);
		
		Meal meal4 = new Meal("Dumplings", MealCategory.CHINESE, new String[] {"Flour", "Chicken", "Onions", "Garlic"}, 15.50);
		meals = Helpers.pushToMealsArray(meals, meal4);
		
		this.printDetails(meals);
	}
	
	public void testFailInstantiation() {
		Meal[] meals = {};
		
		Meal meal1 = new Meal("Salmon Soba", MealCategory.MIDDLE_EASTERN, new String[] {"Capsicum"}, 30);
		meals = Helpers.pushToMealsArray(meals, meal1);
		
		Meal meal2 = new Meal("Butter Chicken", MealCategory.INDIAN, new String[] {"Chicken", "Tomatoes", "Capsicum"}, 3);
		meals = Helpers.pushToMealsArray(meals, meal2);
		
		Meal meal3 = new Meal("Butter Chicken", MealCategory.INDIAN, new String[] {"Chicken"}, 1);
		meals = Helpers.pushToMealsArray(meals, meal3);
		
		this.printDetails(meals);
	}
	
	public void testFailAddIngredient() {
		Meal[] meals = {};
		
		Meal meal1 = new Meal("Salmon Soba", MealCategory.MIDDLE_EASTERN, new String[] {"Atlantic Salmon", "Singapore Noodles", "Capsicum", "Broccoli"}, 30);
		meal1.addIngredient("Broccoli");
		meals = Helpers.pushToMealsArray(meals, meal1);
		

		Meal meal2 = new Meal("Butter Chicken", MealCategory.INDIAN, new String[] {"Chicken", "Tomatoes", "Capsicum"}, 23.50);
//		Only adds the ingredient once
		meal2.addIngredient("Chilli");
		meal2.addIngredient("Chilli");
		
		meals = Helpers.pushToMealsArray(meals, meal2);
		
		this.printDetails(meals);
	}
	
	public void testPassAddIngredient() {
		Meal[] meals = {};
		
		Meal meal1 = new Meal("Salmon Soba", MealCategory.MIDDLE_EASTERN, new String[] {"Atlantic Salmon", "Singapore Noodles", "Capsicum", "Broccoli"}, 30);
		meal1.addIngredient("Chilli");
		meal1.addIngredient("Salt");
		meal1.addIngredient("Pepper");
		
		meals = Helpers.pushToMealsArray(meals, meal1);

		this.printDetails(meals);
	}
	
	public void testFailRemoveIngredient() {
		Meal[] meals = {};
		
		Meal meal1 = new Meal("Salmon Soba", MealCategory.MIDDLE_EASTERN, new String[] {"Atlantic Salmon", "Singapore Noodles", "Capsicum", "Broccoli"}, 30);
		
		meal1.removeIngredient("Chilli");
		meal1.removeIngredient("Capsicum");
		
		meals = Helpers.pushToMealsArray(meals, meal1);
		
		this.printDetails(meals);
	}
	
	public void testPassRemoveIngredient() {
		Meal[] meals = {};
		
		Meal meal1 = new Meal("Salmon Soba", MealCategory.MIDDLE_EASTERN, new String[] {"Atlantic Salmon", "Singapore Noodles", "Capsicum", "Broccoli"}, 30);
		
		meal1.addIngredient("Chilli");
		meal1.addIngredient("Salt");
		meal1.removeIngredient("Atlantic Salmon");
		meal1.removeIngredient("Chilli");
		
		meals = Helpers.pushToMealsArray(meals, meal1);
		
		this.printDetails(meals);
	}
	
	
	
	private void printDetails(Meal[] meals) {
		for (Meal meal : meals) {
			System.out.println(meal.getDetails());
			System.out.println(meal.toString() + "\n\n\n");
		}
	}
}
