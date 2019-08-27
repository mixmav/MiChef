package tests;

import application.Customer;
import utilities.Helpers;

public class TestCustomer {
	
	public void testValid() {
		Customer[] customers = {};
		
		Customer customer1 = new Customer("Matthew", "Broderick", "42", "Pride Avenue", "Elwood", "1184");
		customers = Helpers.pushToCustomersArray(customers, customer1);
		
		Customer customer2 = new Customer("Rowan", "Atkinson", "91", "Sebastian Street", "Carlton", "2053");
		customers = Helpers.pushToCustomersArray(customers, customer2);
		
		Customer customer3 = new Customer("Jeremy", "Irons", "19", "John Close", "Essendon", "3040");
		customers = Helpers.pushToCustomersArray(customers, customer3);
		
		Customer customer4 = new Customer("Whoopi", "Goldberg", "57", "Elaine Court", "St Albans", "4021");
		customers = Helpers.pushToCustomersArray(customers, customer4);
		
		Customer customer5 = new Customer("James", "Jones", "11", "Earl Road", "Melbourne", "5000");
		customers = Helpers.pushToCustomersArray(customers, customer5);
		
		Customer customer6 = new Customer("Henry", "Cavill", "83", "Dalgliesh Street", "South Yarra", "6141");
		customers = Helpers.pushToCustomersArray(customers, customer6);
		
		Customer customer7 = new Customer("Angelina", "Jolie", "11", "Smith Street", "Toorak", "7142");
		customers = Helpers.pushToCustomersArray(customers, customer7);
		
		Customer customer8 = new Customer("Matt", "Bomer", "42", "Station Street", "South Yarra", "8141");
		customers = Helpers.pushToCustomersArray(customers, customer8);
		
		for (Customer customer : customers) {
			System.out.println(customer.getDetails());
			System.out.println(customer.toString() + "\n\n\n");
		}

	}
	
	public void testInvalid() {
		
		Customer[] customers = {};
		
		Customer customer1 = new Customer("", "", "", "", "", "");
		customers = Helpers.pushToCustomersArray(customers, customer1);
		
		Customer customer2 = new Customer("Rowan", "Atkinson", "91", "Sebastian Street", "Carlton", "abcd");
		customers = Helpers.pushToCustomersArray(customers, customer2);
		
		Customer customer3 = new Customer("Jeremy", "Irons", "19", "John Close", "Essendon", "304");
		customers = Helpers.pushToCustomersArray(customers, customer3);
		
		Customer customer4 = new Customer("Whoopi", "Goldberg", "57", "Elaine Court", "St Albans", "40211");
		customers = Helpers.pushToCustomersArray(customers, customer4);
		
		Customer customer5 = new Customer("James", "Jones", "11", "Earl Road", "Melbourne", "0005");
		customers = Helpers.pushToCustomersArray(customers, customer5);
		
		Customer customer6 = new Customer("Angelina", "Jolie", "11", "Smith Street", "Toorak", "9142");
		customers = Helpers.pushToCustomersArray(customers, customer6);
		
		
		for (Customer customer : customers) {
			System.out.println(customer.getDetails());
			System.out.println(customer.toString() + "\n\n\n");
		}
	}

}
