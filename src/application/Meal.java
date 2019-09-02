package application;

import utilities.Helpers;

public class Meal {
	
	private String name;
	private MealCategory category;
	private String[] basicIngredients = {};
	private String[] addedIngredients = {}; 
	private double cost;
	
	public Meal(String name, MealCategory category, String[] ingredients, double cost) {
		this.name = Helpers.checkEmptyString(name);
		this.category = category;
		
		if (ingredients.length < 2) {
			ingredients = null;
		}
		
		if (!Helpers.stringArrayContainDuplicates(ingredients)) {
			ingredients = null;
		}

		if (ingredients != null) {
			for (String ingredient : ingredients) {
				if (ingredient != null) {
					this.basicIngredients = Helpers.pushToStringArray(this.basicIngredients, ingredient);
				}
			}
		}
		
		if (cost < 5) {
			cost = -1;
		}
		this.cost = cost;
	}
	
	public boolean addIngredient(String ingredient) {
	
		return true;
	}
	
	public String getDetails() {
		StringBuilder details = new StringBuilder();
		
		details.append(String.format("%-30s %s\n", "Name: ", name));
		details.append(String.format("%-30s %s\n", "Category: ", category));
		
		String basicIngredientsList = "";
		String addedIngredientsList = "";
		
		for (String ingredient : basicIngredients) {
			basicIngredientsList += ingredient += ", ";
		}
		
		basicIngredientsList = basicIngredientsList.substring(0, basicIngredientsList.length() - 2);
		details.append(String.format("%-30s %s\n", "Ingredients: ", basicIngredientsList));
		
		
		if (addedIngredients.length > 0) {
			for (String ingredient : addedIngredients) {
				addedIngredientsList += ingredient += ", ";
			}
			addedIngredientsList = addedIngredientsList.substring(0, addedIngredientsList.length() - 2);
			details.append(String.format("%-30s %s\n", "Additions: ", addedIngredientsList));
		}
		
		details.append(String.format("%-30s %s\n", "Cost: ", cost));
		
		return details.toString();
	}
	
//	public String toString() {
//		StringBuilder details = new StringBuilder();
//		
//		details.append(firstName + ":" + lastName + ":" + streetNo + ":" + streetName + ":" + suburb + ":" + postcode);
//		
//		return details.toString();
//		
//	}
}
