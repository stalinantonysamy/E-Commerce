package store;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Billing 
{
	@FindBy(xpath="//input[@id='billing_email']") private WebElement email;
	@FindBy(xpath="//button[contains(text(),'Proceed to Billing')]") private WebElement pay;
	@FindBy(xpath="//input[@id='billing_first_name']") private WebElement first;
	@FindBy(xpath="//input[@id='billing_last_name']") private WebElement last;
	@FindBy(xpath="//input[@id='billing_address_1']") private WebElement address;
	@FindBy(xpath="//input[@id='billing_city']") private WebElement city;
	@FindBy(xpath="//input[@id='billing_postcode']") private WebElement zipcode;
	@FindBy(xpath="//input[@id='billing_phone']") private WebElement phone;
	@FindBy(xpath="//button[contains(text(),'Proceed to Payment')]") private WebElement pay2;
	
	
	public void email1()
	{
		email.sendKeys("stalincse604@gmail.com");
	}
	
	public void pay1()
	{
		pay.click();
	}
	
	public void first1()
	{
		first.sendKeys("stalin");
	}
	
	public void last1()
	{
		last.sendKeys("a");
	}
		
	public void address1()
	{
		address.sendKeys("560");
		
	}
	
	public void city1()
	{
		city.sendKeys("coimbatore");
	}
	
	public void zipcode1()
	{
		zipcode.sendKeys("75254");
	}
	
	public void phone1()
	{
		phone.sendKeys("994282");
	}
	
	public void pay_2()
	{
		pay2.click();
	}
	
	

}
