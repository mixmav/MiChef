package application;

import java.util.Arrays;

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
		} else if (Helpers.stringArrayContainDuplicates(ingredients)) {
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
		String[] allIngredients = Arrays.copyOf(this.basicIngredients, this.basicIngredients.length + this.addedIngredients.length);
		System.arraycopy(this.addedIngredients, 0, allIngredients, this.basicIngredients.length, this.addedIngredients.length);
		
		allIngredients = Helpers.pushToStringArray(allIngredients, ingredient);
		
		if (!Helpers.stringArrayContainDuplicates(allIngredients)) {
			this.addedIngredients = Helpers.pushToStringArray(this.addedIngredients, ingredient);
			this.cost += 0.50;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean removeIngredient(String ingredient) {
		if (Helpers.stringArrayContains(this.basicIngredients, ingredient)) {
			if (this.basicIngredients.length > 2) {
				this.basicIngredients = Helpers.pullFromStringArray(this.basicIngredients, ingredient);
				return true;
			}
		} else if (Helpers.stringArrayContains(this.addedIngredients, ingredient)) {
			this.addedIngredients = Helpers.pullFromStringArray(this.addedIngredients, ingredient);
			this.cost -= 0.50;
			return true;
		}
		return false;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getDetails() {
		StringBuilder details = new StringBuilder();
		
		details.append(String.format("%-30s %s\n", "Name: ", name));
		details.append(String.format("%-30s %s\n", "Category: ", category));
		
		String basicIngredientsList = "";
		String addedIngredientsList = "";
		
		if (basicIngredients != null && basicIngredients.length >= 2) {
			for (String ingredient : basicIngredients) {
				basicIngredientsList += ingredient += ", ";
			}
			
			basicIngredientsList = basicIngredientsList.substring(0, basicIngredientsList.length() - 2);
			details.append(String.format("%-30s %s\n", "Ingredients: ", basicIngredientsList));
		} else {
			details.append(String.format("%-30s %s\n", "Ingredients: ", "N/A"));
		}
		
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

	@Override
	public String toString() {
		StringBuilder details = new StringBuilder();
		String basicIngredientsList = "";
		String addedIngredientsList = "";
		
		details.append(name + ":" + category + ":");
		
		if (basicIngredients != null && basicIngredients.length >= 2) {
			for (String ingredient : basicIngredients) {
				basicIngredientsList += ingredient += ", ";
			}
			
			basicIngredientsList = basicIngredientsList.substring(0, basicIngredientsList.length() - 2);
			details.append(basicIngredientsList);
		} else {
			details.append("N/A");
		}
		details.append(":");
		
		if (addedIngredients.length > 0) {
			for (String ingredient : addedIngredients) {
				addedIngredientsList += ingredient += ", ";
			}
			
			addedIngredientsList = addedIngredientsList.substring(0, addedIngredientsList.length() - 2);
			details.append(addedIngredientsList);
		} else {
			details.append("None");
		}
		
		details.append(":");
		details.append(cost);
		
		return details.toString();
		
	}
}
