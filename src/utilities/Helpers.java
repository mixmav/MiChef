package utilities;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import application.Customer;

public class Helpers {	
	
	public static boolean validatePostcode(String postcode) {
		return Pattern.matches("^[1-8][0-9]{3}$", postcode);
	}
	
	public static String checkEmptyString(String string) {
		string = string.trim();

		if (string == null || string.length() == 0) {
			return "N/A";
		} else {
			return string;
		}
	}

	public static Customer[] pushToCustomersArray(Customer[] customers, Customer customer) {		
		customers = Arrays.copyOf(customers, customers.length + 1);
		customers[customers.length - 1] = customer;

		return customers;
	}
	
	public static String[] pushToStringArray(String[] array, String value) {		
		array = Arrays.copyOf(array, array.length + 1);
		array[array.length - 1] = value;

		return array;
	}
	
	public static boolean stringArrayContainDuplicates(String[] array) {
		boolean duplicates = false;
		
		for (int j = 0; j < array.length; j++) {
			for (int k = j+1; k < array.length; k++) {
				if (k != j && array[k] == array[j]) {
					duplicates = true;	
				}	
			}	
		}	
		return true;
	}
	
}
