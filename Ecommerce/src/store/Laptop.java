package store;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Laptop 
{
	@FindBy(xpath="//h2[contains(text(),'Top Skin-Laptop Skin')]") private WebElement lap;
	@FindBy(xpath="//option[contains(text(),'3')]") private WebElement qty2;
	@FindBy(xpath="//button[contains(text(),'Add to cart')]") private WebElement add2;
	public void lap1()
	{
		lap.click();
	}

	public void qty_2()
	{
		qty2.click();
	}
	
	public void add_2()
	{
		add2.click();
	}
}
