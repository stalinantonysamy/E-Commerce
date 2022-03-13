package store;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Placeorder
{
	@FindBy(xpath="//button[@id='place_order']") private WebElement order;
	
	public void place1()
	{
		order.click();
	}

}
