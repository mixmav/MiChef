package application;

public class Delivery {
	private Customer customer;
	private Meal meal;
	
	public Delivery(Customer customer){
		this.customer = customer;
	}
	
	public void addMeal(Meal meal) {
		this.meal = meal;
	}
	
	public boolean setDeliveryDate(int day, int month, int year) {
		return true;
	}
}
