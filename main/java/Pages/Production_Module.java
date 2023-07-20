package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Production_Module extends Loginpag{
	//home page show selection
	public By homepgshow = By.xpath("//img[@alt='The Lion King']");
	
	//London page show name selection
	public By dropdown = By.xpath("//span[@class='city-nav__arrow sp-icon sp-icon-expand-more sp-icon--small']");
	public By London = By.linkText("London");
	
	public By newyork = By.linkText("New York");
	public By newyorksh = By.xpath("//div[@class='city-productions__listings  production-card-listings grid-x3']//img[@alt='Harry Potter and the Cursed Child']");
	
	public By Seatlogo = By.xpath("//img[@alt='SeatPlan Logo']");
	
	public By morelk = By.id("city-nav-more-control");
	public By comingsh = By.linkText("Coming Soon");
	public void showpg(WebDriver d)
	{
		d.findElement(homepgshow).click();
		delay(d, 5);
	
		//london city show selection
		d.findElement(dropdown).click();
		d.findElement(London).click();
		delay(d,10);
		
		//newyork city show selection
		d.findElement(dropdown).click();
		d.findElement(newyork).click();
		d.findElement(newyorksh).click();
		delay(d,10);
		d.findElement(Seatlogo).click();
		
		//onsale show selection
		d.findElement(homepgshow).click();
		
		//coming show selection
		d.findElement(morelk).click();
		d.findElement(comingsh).click();
		
		
	
		
	}
	
	public void pop(WebDriver driver) throws Exception
	{
	driver.findElement(By.xpath("//button[@id='confirmBox']")).click();
	
	Alert alert = driver.switchTo().alert(); // switch to alert
	String alertMessage= driver.switchTo().alert().getText(); // capture alert message

	System.out.println(alertMessage); // Print Alert Message
	Thread.sleep(5000);
	alert.accept();

}
	
	

}
