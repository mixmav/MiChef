package main;

import tests.TestMeal;
import application.Customer;
import application.Delivery;
import application.Meal;
import application.MealCategory;
import tests.TestCustomer;
import tests.TestDelivery;

public class Driver {

	public static void main(String[] args) {
		
		TestMeal testMeal = new TestMeal();
		TestCustomer testCustomer = new TestCustomer();
		TestDelivery testDelivery = new TestDelivery();
		
		Customer customer1 = new Customer("Matthew", "Broderick", "42", "Pride Avenue", "Elwood", "1184");
		Meal meal1 = new Meal("Salmon Soba", MealCategory.MIDDLE_EASTERN, new String[] {"Atlantic Salmon", "Singapore Noodles", "Capsicum", "Broccoli"}, 30);
		
		Delivery delivery = new Delivery(customer1);
		delivery.addMeal(meal1);
		
		delivery.setDeliveryDate(4, 9, 2019);
//		System.out.println(delivery.getDetails());
		
		delivery.readyForDelivery();
	}

}
