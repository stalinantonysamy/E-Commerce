package store;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Umbrella
{
	@FindBy(xpath="//h2[contains(text(),'Umbrella')]") private WebElement yellow;
	@FindBy(xpath="//button[contains(text(),'Add to cart')]") private WebElement add3;
	public void yellow1()
	{
		yellow.click();
	}
	
	public void add_3()
	{
		add3.click();
	}

}
