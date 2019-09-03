package application;

import utilities.DateTime;
import utilities.DayOfWeek;

public class Delivery {
	private Customer customer;
	private Meal meal;

	private DateTime deliveryDate;
	
	public Delivery(Customer customer){
		this.customer = customer;
	}
	
	public void addMeal(Meal meal) {
		this.meal = meal;
	}
	
	public boolean setDeliveryDate(int day, int month, int year) {
		this.deliveryDate = new DateTime(day, month, year);
		return true;
	}
	
	public boolean readyForDelivery() {
		System.out.println(this.deliveryDate.diffDays(this.deliveryDate, new DateTime()));
		if (this.meal != null) {
			return true;
		}
		return false;
	}
	
	public String getDetails() {
		StringBuilder details = new StringBuilder();
		
		details.append(String.format("%-30s %s\n", "Delivery for: ", this.customer.getName()));
		details.append(String.format("%-30s %s\n", "Meal: ", this.meal.getName()));
		details.append(String.format("%-30s %s\n", "Delivery date", this.deliveryDate.getFormattedDate()));
		
		return details.toString();
	}
	
	@Override
	public String toString() {
		String details = "";
		
		return details;
	}
}
