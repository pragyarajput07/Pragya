package com.trinity.base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.trinity.Config;
import com.trinity.Keyword;

public class TestBase {
	public final static Keyword keyword = new Keyword();

	@BeforeMethod
	public void setup() {
		Config config = new Config();
		keyword.openBrowser(config.getBrowserName());
		keyword.launchUrl(config.getAppUrl());
	}

	@AfterMethod
	public void tearDown() throws Exception {

		keyword.quitBrowser();
	}

}
