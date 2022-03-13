package store;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Cap 
{
	@FindBy(xpath="//header/div[@id='ast-desktop-header']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/nav[1]/div[1]/ul[1]/li[2]/a[1]") private WebElement cart1;
	@FindBy(xpath="//h2[contains(text(),'CAPW Cap')]") private WebElement cart2;
	@FindBy(xpath="//option[contains(text(),'5')]") private WebElement qty;
	@FindBy(xpath="//button[contains(text(),'Add to cart')]") private WebElement add;
	public void cart_1()
	{
		cart1.click();
	}
	
	public void cart_2()
	{
		cart2.click();
	}
	public void qty1()
	{
		qty.click();
		
	}
	
	public void add1()
	{
		add.click();
	}

	
}
