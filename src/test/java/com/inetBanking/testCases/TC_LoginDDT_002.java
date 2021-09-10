package com.inetBanking.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.inetBamking.pageObjects.LoginPage;
import com.inetBanking.utilities.XLUtils;

public class TC_LoginDDT_002 extends BaseClass{
	
	@Test(dataProvider = "loginData")
	public void loginDDT(String user,String pwd) throws Exception {
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(user);
		logger.info("user name provided");
		lp.setPassword(pwd);
		logger.info("password provided");
		lp.clickSubmit();
		
		Thread.sleep(3000);
		
		if(isAlertPresent()==true) {
			logger.warn("login failed");
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
			Assert.assertTrue(false);
			
		}
		else {
			Assert.assertTrue(true);
			logger.info("login successfully");
			lp.clickLogout();
			Thread.sleep(3000);
			driver.switchTo().alert().accept();
			logger.info("logout successfully");
			driver.switchTo().defaultContent();
		}
	}
	
	
	@DataProvider(name="loginData")
	String [][] getData() throws IOException{
		String path=System.getProperty("user.dir")+"/src/test/java/com/inetBanking/testData/LoginData.xlsx";
		
		int rowcount=XLUtils.getRowCount(path, "sheet1");
		int colcount=XLUtils.getCellCount(path, "sheet1", 1);
		
		String loginData[][]=new String[rowcount][colcount];
		
		for(int i=1;i<rowcount;i++) {
			for(int j=0;j<colcount;j++) {
				loginData[i-1][j]=XLUtils.getCellData(path, "sheet1", i, j);
			}
		}
		
		return loginData;
		
	}
}
