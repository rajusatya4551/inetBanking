package com.inetBamking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {
	
	WebDriver ldriver;
	
	public AddCustomerPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	//find elements
	@CacheLookup
	@FindBy(how = How.LINK_TEXT, using ="New Customer")
	WebElement lnkAddNewCustomer;
	
	@CacheLookup
	@FindBy(how = How.NAME, using = "name")
	WebElement txtCustomerName;
	
	@CacheLookup
	@FindBy(name = "rad1")
	WebElement rdGender;
	
	@CacheLookup
	@FindBy(name = "dob")
	WebElement txtdob;
	
	@CacheLookup
	@FindBy(name = "addr")
	WebElement txtaddress;

	@CacheLookup
	@FindBy(name = "city")
	WebElement txtcity;

	@CacheLookup
	@FindBy(name = "state")
	WebElement txtstate;

	@CacheLookup
	@FindBy(name = "pinno")
	WebElement txtpinno;

	@CacheLookup
	@FindBy(name = "telephoneno")
	WebElement txttelephoneno;

	@CacheLookup
	@FindBy(name = "emailid")
	WebElement txtemailid;

	@CacheLookup
	@FindBy(name = "password")
	WebElement txtpassword;

	@CacheLookup
	@FindBy(name = "sub")
	WebElement btnSubmit;
	
	//Action methods for web elements 
	public void clickAddNewCustomer() {
		lnkAddNewCustomer.click();
	}
	
	public void custName(String cname) {
		txtCustomerName.sendKeys(cname);
	}
	
	public void custGender(String cgender) {
		rdGender.click();
	}
	
	public void custDob(String mm,String dd,String yy) {
		txtdob.sendKeys(mm);
		txtdob.sendKeys(dd);
		txtdob.sendKeys(yy);
	}
	
	public void custAddress(String caddress) {
		txtaddress.sendKeys(caddress);
	}

	public void custCity(String ccity) {
		txtcity.sendKeys(ccity);
	}

	public void custState(String cstate) {
		txtstate.sendKeys(cstate);
	}
	
	public void custPin(String cpin) {
		txtpinno.sendKeys(String.valueOf(cpin));
	}
	
	public void custTelephoneno(String ctelephoneno) {
		txttelephoneno.sendKeys(ctelephoneno);
	}

	public void custEmailid(String cemailid) {
		txtemailid.sendKeys(cemailid);
	}

	public void custPassword(String cpassword) {
		txtpassword.sendKeys(cpassword);
	}

	public void custSubmit() {
		btnSubmit.click();
	}
}
