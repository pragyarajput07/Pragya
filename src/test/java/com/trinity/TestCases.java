package com.trinity;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import org.testng.annotations.Test;

import com.trinity.base.TestBase;
import com.trinity.pages.HomePage;
import com.trinity.utilities.PropUtil;

public class TestCases extends TestBase {
	@Test
	public void VerifyIfLastNameIsRequiredOrNot() {

		keyword.driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();
		String expectedErrorMsg = "Last name is required.";
		keyword.driver.findElement(By.xpath("//*[@id=\"customer.firstName\"]")).sendKeys("Pragya");
		keyword.driver.findElement(By.xpath("//*[@id=\"customer.address.street\"]")).sendKeys("2201 E BLOCK");
		keyword.driver.findElement(By.xpath("//*[@id=\"customer.address.city\"]")).sendKeys("GANDHINAGAR");
		keyword.driver.findElement(By.xpath("//*[@id=\"customer.address.state\"]")).sendKeys("UK");
		keyword.driver.findElement(By.xpath("//*[@id=\"customer.address.zipCode\"]")).sendKeys("462021");
		keyword.driver.findElement(By.xpath("//*[@id=\"customer.phoneNumber\"]")).sendKeys("7212121212");
		keyword.driver.findElement(By.xpath("//*[@id=\"customer.ssn\"]")).sendKeys("3577777yief3434384");
		keyword.driver.findElement(By.xpath("//*[@id=\"customer.username\"]")).sendKeys("TestUser");
		keyword.driver.findElement(By.xpath("//*[@id=\"customer.password\"]")).sendKeys("Test@12345");
		keyword.driver.findElement(By.xpath("//*[@id=\"repeatedPassword\"]")).sendKeys("Test@12345");
		keyword.driver.findElement(By.xpath("//input[@value=\"Register\"]")).click();
		String errorMsg = keyword.driver.findElement(By.xpath("//*[@id=\"customer.lastName.errors\"]")).getText();
		Assert.assertEquals(errorMsg, expectedErrorMsg);

	}

	@Test
	public void VerifyIfLastNameIsRequired() throws IOException {

		String expectedErrorMsg = "Last name is required.";
		Config conf = new Config();

		String dir = System.getProperty("user.dir");
		String filePath = dir + "/src/test/resources/Locators.properties";
		PropUtil prop = new PropUtil(filePath);

		keyword.click(prop.getValue("REGISTERLINK"));
		keyword.enterText(Locator.FIRSTNAME, "Pragya");
		keyword.enterText(Locator.ADDRESS, "2201 E BLOCK");
		keyword.enterText(Locator.CITY, "GANDHINAGAR");
		keyword.enterText(Locator.STATE, "GUJRAT");
		keyword.enterText(Locator.ZIPCODE, "456738");
		keyword.enterText(Locator.PHONENO, "6575859515");
		keyword.enterText(Locator.SSN, "DDHSJ37658");
		keyword.enterText(Locator.USERNAME, "Test");
		keyword.enterText(Locator.PASSWORD, "Test@12345");
		keyword.enterText(Locator.CONFIRMPASS, "Test@12345");
		keyword.click(Locator.REGISTERBTN);
		String errorMsg = keyword.getText(Locator.LASTNAMEERROR);
		Assert.assertEquals(errorMsg, expectedErrorMsg);
	}

	@Test
	public void VerifyIfLastNameIsRequiredUsingPOM() {
		String expectedErrorMsg = "Last name is required.";
		HomePage home = new HomePage();
		home.clickOnRegisterLink();
		home.enterFirstName("Pragya");
		home.enterAddress("203 f block");
		home.enterCity("Crawley");
		home.enterState("United Kingdom");
		home.enterZipcode("462086");
		home.enterPhoneNo("6574876789");
		home.enterSSN("edfgrt213");
		home.enterUserName("test");
		home.enterPassword("test@12345");
		home.enterConfirmPass("test@12345");
		home.ClickRegBtn();
		String errorMsg = home.getLastNameErrorMsg();
		Assert.assertEquals(errorMsg, expectedErrorMsg);
	}
	
	@Test
	public void VerifyIfAddressIsRequiredUsingPOM() {
		String expectedErrorMsg = "Address is required.";
		HomePage home = new HomePage();
		home.clickOnRegisterLink();
		home.enterFirstName("Pragya");
		home.enterLastName("Rajput");
		home.enterCity("Crawley");
		home.enterState("United Kingdom");
		home.enterZipcode("462086");
		home.enterPhoneNo("6574876789");
		home.enterSSN("edfgrt213");
		home.enterUserName("test");
		home.enterPassword("test@12345");
		home.enterConfirmPass("test@12345");
		home.ClickRegBtn();
		String errorMsg = home.getAddressErrorMsg();
		Assert.assertEquals(errorMsg, expectedErrorMsg);
	}
	@Test
	public void verifyIfCityIsRequiredUsingPOM() {
			String expectedErrorMsg = "City is required.";
			HomePage home = new HomePage();
			home.clickOnRegisterLink();
			home.enterFirstName("Pragya");
			home.enterLastName("Rajput");
			home.enterAddress("208 e block");
			home.enterState("United Kingdom");
			home.enterZipcode("462086");
			home.enterPhoneNo("6574876789");
			home.enterSSN("edfgrt213");
			home.enterUserName("test");
			home.enterPassword("test@12345");
			home.enterConfirmPass("test@12345");
			home.ClickRegBtn();
			String errorMsg = home.CityErrorMsg();
			Assert.assertEquals(errorMsg, expectedErrorMsg);
		}
	@Test
	public void toCheckIfPasswordConfirmationIsCorrect() {
		String expectedErrorMsg = "Passwords did not match.";
		HomePage home = new HomePage();
		home.clickOnRegisterLink();
		home.enterFirstName("Pragya");
		home.enterLastName("Rajput");
		home.enterAddress("208 e block");
		home.enterCity("Crawley");
		home.enterState("United Kingdom");
		home.enterZipcode("462086");
		home.enterPhoneNo("6574876789");
		home.enterSSN("edfgrt213");
		home.enterUserName("test");
		home.enterPassword("test@12345");
		home.enterConfirmPass("test@1235");
		home.ClickRegBtn();
		String errorMsg = home.ConfirmPassErrorMsg();
		Assert.assertEquals(errorMsg, expectedErrorMsg);
	}
	}

