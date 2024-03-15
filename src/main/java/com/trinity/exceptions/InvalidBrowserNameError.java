package com.trinity.exceptions;

import com.trinity.utilities.PropUtil;

public class InvalidBrowserNameError extends Error {

	private String msg;

	public InvalidBrowserNameError(String browserName) {
		msg = "Invalid browser name:" + browserName;
		PropUtil prop = new PropUtil();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return msg;
	}
}
