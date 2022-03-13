package store;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Viewcart
{
	@FindBy(xpath="//body/div[@id='page']/div[@id='content']/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/a[1]") private WebElement cart;
	@FindBy(xpath="//a[contains(text(),'Proceed to checkout')]") private WebElement checkout;
	
	public void cart1()
	{
		cart.click();
	}

	public void checkout1()
	{
		checkout.click();
	}
}
