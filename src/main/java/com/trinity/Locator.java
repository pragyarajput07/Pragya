package com.trinity;

import org.openqa.selenium.By;

public interface Locator {
	String REGISTERLINK = "//a[contains(text(),'Register')]";
	String FIRSTNAME = "//*[@id='customer.firstName']";
	String LASTNAME = "//*[@id='customer.lastName']";
	String ADDRESS = "//*[@id='customer.address.street']";
	String CITY = "//*[@id='customer.address.city']";
	String STATE = "//*[@id='customer.address.state']";
	String ZIPCODE = "//*[@id='customer.address.zipCode']";
	String PHONENO = "//*[@id='customer.phoneNumber']";
	String SSN = "//*[@id='customer.ssn']";
	String USERNAME = "//*[@id='customer.username']";
	String PASSWORD = "//*[@id='customer.password']";
	String CONFIRMPASS = "//*[@id='repeatedPassword']";
	String REGISTERBTN = "//input[@value='Register']";
	String LASTNAMEERROR = "//*[@id='customer.lastName.errors']";
	String ADDRESSERROR = "//*[@id='customer.address.street.errors']";
	String CITYERROR = "//*[@id='customer.address.city.errors']";
	String STATEERROR = "//*[@id='customer.address.state.errors']";
	String ZIPCODEERROR = "//*[@id='customer.address.zipCode.errors']";
	String PHONENOERROR = "//*[@id='customer.phoneNumber.errors']";
	String SSNERROR = "//*[@id='customer.ssn.errors']";
	String USERNAMEERROR = "//*[@id='customer.username.errors']";
	String PASSWORDERROR = "//*[@id='customer.password.errors']";
	String CONFIRMPASSERROR = "//*[@id='repeatedPassword.errors']";
}
