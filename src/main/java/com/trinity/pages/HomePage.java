package com.trinity.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.trinity.base.TestBase;

public class HomePage {
	@FindBy(xpath = "//a[contains(text(),'Register')]")
	public WebElement registerLink;
	@FindBy(xpath = "//*[@id='customer.firstName']")
	public WebElement firstname;
	@FindBy(xpath ="//*[@id='customer.lastName']")
	public WebElement lastname;
	@FindBy(xpath = "//*[@id='customer.address.street']")
	public WebElement address;
	@FindBy(xpath = "//*[@id='customer.address.city']")
	public WebElement city;
	@FindBy(xpath = "//*[@id='customer.address.state']")
	public WebElement state;
	@FindBy(xpath = "//*[@id='customer.address.zipCode']")
	public WebElement zipcode;
	@FindBy(xpath = "//*[@id='customer.phoneNumber']")
	public WebElement phoneNo;
	@FindBy(xpath = "//*[@id='customer.ssn']")
	public WebElement ssn;
	@FindBy(xpath = "//*[@id='customer.username']")
	public WebElement username;
	@FindBy(xpath = "//*[@id='customer.password']")
	public WebElement password;
	@FindBy(xpath = "//*[@id='repeatedPassword']")
	public WebElement confirmPass;
	@FindBy(xpath = "//input[@value=\"Register\"]")
	public WebElement registerBtn;
	@FindBy(xpath = "//*[@id='customer.lastName.errors']")
	public WebElement lastNameError;
	@FindBy(xpath = "//*[@id='customer.address.street.errors']")
	public WebElement addressError;
	@FindBy(xpath= "//*[@id='customer.address.city.errors']")
	public WebElement cityError; 
	@FindBy(xpath= "//*[@id='customer.address.state.errors']")
	 public WebElement stateError;
	@FindBy(xpath="//*[@id='customer.address.zipCode.errors']") 
	public WebElement zipCodeError;
	@FindBy(xpath= "//*[@id='customer.phoneNumber.errors']")
	public WebElement phoneNoError; 
	@FindBy(xpath="//*[@id='customer.ssn.errors']") 
	public WebElement ssnError; 
	@FindBy(xpath="//*[@id='customer.username.errors']") 
	public WebElement userNameError; 
	@FindBy(xpath= "//*[@id='customer.password.errors']") 
	public WebElement passwordError;
	@FindBy(xpath="//*[@id='repeatedPassword.errors']") 
	public WebElement confirmPassError;

	

	public HomePage() {
		PageFactory.initElements(TestBase.keyword.driver, this);
	}

	public void clickOnRegisterLink() {
		registerLink.click();

	}

	public void enterFirstName(String text) {
		firstname.sendKeys(text);
	}

	public void enterLastName(String text) {
		lastname.sendKeys(text);
	}

	public void enterAddress(String text) {
		address.sendKeys(text);
	}

	public void enterCity(String text) {
		city.sendKeys(text);
	}

	public void enterState(String text) {
		state.sendKeys(text);
	}

	public void enterZipcode(String text) {
		zipcode.sendKeys(text);

	}

	public void enterPhoneNo(String text) {
		phoneNo.sendKeys(text);
	}

	public void enterSSN(String text) {
		ssn.sendKeys(text);

	}

	public void enterUserName(String text) {
		username.sendKeys(text);
	}

	public void enterPassword(String text) {
		password.sendKeys(text);

	}

	public void enterConfirmPass(String text) {
		confirmPass.sendKeys(text);
	}

	public void ClickRegBtn() {
		registerBtn.click();

	}

	public String getLastNameErrorMsg() {
		// TODO Auto-generated method stub
		return lastNameError.getText();
	}

	public String getAddressErrorMsg() {
		return addressError.getText();
	}

	public String CityErrorMsg() {
		// TODO Auto-generated method stub
		return cityError.getText();
	}

	public String ConfirmPassErrorMsg() {
		// TODO Auto-generated method stub
		return confirmPassError.getText();
	}
}
