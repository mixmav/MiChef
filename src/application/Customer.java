package application;

import utilities.Helpers;

public class Customer {
	private String firstName;
	private String lastName;
	private String streetNo;
	private String streetName;
	private String suburb;
	private String postcode;
	
	public Customer(String firstName, String lastName,
					String streetNumber, String streetName, String suburb, String postcode) {
		
		this.firstName = Helpers.checkEmptyString(firstName);
		this.lastName = Helpers.checkEmptyString(lastName);
		this.streetNo = Helpers.checkEmptyString(streetNumber);
		this.streetName = Helpers.checkEmptyString(streetName);
		this.suburb = Helpers.checkEmptyString(suburb);
		
		if (Helpers.validatePostcode(postcode)) {
			this.postcode = postcode;
		} else {
			this.postcode = "N/A";
		}
	}
	
	public String getDetails() {
		String details = "";
		
		details += String.format("%-30s %s %s\n", "Name: ", firstName, lastName);
		details += String.format("%-30s%s %s\n", "Address: ", streetNo, streetName, suburb, postcode);
		
		return details;
	}
	
	public String toString() {
		String details = "";
		
		
		
		return details;
		
	}
}
