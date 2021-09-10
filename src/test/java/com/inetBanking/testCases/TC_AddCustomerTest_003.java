package com.inetBanking.testCases;


import org.junit.Assert;
import org.testng.annotations.Test;

import com.inetBamking.pageObjects.AddCustomerPage;
import com.inetBamking.pageObjects.LoginPage;

public class TC_AddCustomerTest_003 extends BaseClass{

	@Test
	public void addNewCustomer() throws Exception {
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		logger.info("username is provided");
		lp.setPassword(password);
		logger.info("password is provided");
		lp.clickSubmit();
		
		
		
		AddCustomerPage addcust=new AddCustomerPage(driver);
		addcust.clickAddNewCustomer();
		
		Thread.sleep(3000);
		addcust.custName("Raju");
		addcust.custGender("male");
		addcust.custDob("10","15","1985");
		addcust.custAddress("INDIA");
		addcust.custCity("HYD");
		addcust.custState("AP");
		addcust.custPin("5000074");
		addcust.custTelephoneno("987890091");
		
		String email = randomeString()+"@gmail.com";
		addcust.custEmailid(email);
		
		addcust.custPassword("abcdef");
		
		Thread.sleep(3000);
		
		addcust.custSubmit();
		
		logger.info("validation started");
		
		boolean res=driver.getPageSource().contains("Customer Registered Successfully!!!");
		
		if(res==true) {
			Assert.assertTrue(true);
			logger.info("customer added successfully....");
		}
		else {
			logger.info("customer added failed....");
			captureScreen(driver, "addNewCustomer");
			Assert.assertTrue(false);
		}
	}
}
