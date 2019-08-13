package application;

public class Meal {
	
	private String name;
	private MealCategory category;
	private String[] ingredients;	
	private double cost;
	
	public Meal(String name, MealCategory category, String[] ingredients, double cost) {
		this.name = name;
		this.category = category;
		this.ingredients = ingredients;;
		this.cost = cost;
	}
}
