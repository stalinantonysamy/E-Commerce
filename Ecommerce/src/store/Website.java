package store;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.AfterClass;

public class Website
{
	public static WebDriver driver;
	
  @Test(priority=0)
  public void a()
  {
	  Cap c=PageFactory.initElements(driver, Cap.class);
	  c.cart_1();
	  c.cart_2();  
	  c.qty1();
	  c.add1();
  }
  @Test(priority=1)
  public void b()
  {
	  Laptop l=PageFactory.initElements(driver, Laptop.class);
	  l.lap1();
	  l.qty_2();
	  l.add_2();
  }
  @Test(priority=2)
  public void c()
  {
	  Umbrella u=PageFactory.initElements(driver, Umbrella.class);
	  u.yellow1();
	  u.add_3();
  }
  @Test(priority=3)
  public void d()
  {
	  Viewcart v=PageFactory.initElements(driver, Viewcart.class);
	  v.cart1();
	  v.checkout1();
  }
  
  @Test(priority=4)
  public void e()
  {
	  Billing b=PageFactory.initElements(driver, Billing.class);
	  b.email1();
	  b.pay1();
	  b.first1();
	  b.last1();
	  b.address1();
	  b.city1();
	  b.zipcode1();
	  b.phone1();
	  b.pay_2();
	  
	  
  }
  @Test(priority=5)
  public void f()
  {
	  Placeorder p=PageFactory.initElements(driver, Placeorder.class);
	  p.place1();
  }

@BeforeClass
  public void beforeClass() 
  {
	  System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://localhost/wordpress/");
	  
	  
  }

  @AfterClass
  public void afterClass() 
  {
	  
  }

}
