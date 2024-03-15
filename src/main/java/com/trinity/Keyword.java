package com.trinity;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import com.trinity.exceptions.InvalidBrowserNameError;

public class Keyword {
	public RemoteWebDriver driver;
	public FluentWait<WebDriver> wait;

	public void openBrowser(String browserName) {
		if (browserName.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
			System.out.println("Launching Chrome Browser");
		} else if (browserName.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
			System.out.println("Launching Edge Browser");
		} else if (browserName.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
			System.out.println("Launching Firefox Browser");

		} else {
			System.err.println("Invalid browser name");// TODO Auto-generated method stub
			throw new InvalidBrowserNameError(browserName);
		}

		wait = new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(60));
		wait.pollingEvery(Duration.ofMillis(500));
		wait.withMessage("");
		wait.ignoring(NoSuchElementException.class);
	}

	public void launchUrl(String url) {
		driver.get(url);
	}

	public void waitForElementToBeVisible(By element) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(element));

	}

	public void waitForElementToBeClickable(By element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));

	}

	public void click(String xpath) {
		driver.findElement(By.xpath(xpath)).click();
	}

	public void enterText(String xpath, String text) {
		driver.findElement(By.xpath(xpath)).sendKeys(text);
	}

	public String getText(String xpath) {
		return driver.findElement(By.xpath(xpath)).getText();
	}

	public void closeBrowser() {
		driver.close();

	}

	public void quitBrowser() {
		driver.quit();

	}
}