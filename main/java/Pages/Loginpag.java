package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpag extends Search_Module{

	public By Loginicon = By.xpath("//span[@class='sp-icon sp-icon-person sp-icon--filled sp-icon--large']");
	public By Logingmailbut = By.xpath("//button[@type='button']");
	public By gmailfield = By.xpath("//input[@name='email']");
	public By passwordfield = By.xpath("//input[@name='password']");
	public By submit = By.xpath("//input[@name='password']//following::button[@type='submit']");
	
	public void loginfun(WebDriver d, String gmail, String password) throws Exception 
	{   
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		d.findElement(Loginicon).click();
		d.findElement(Logingmailbut).click();
		d.findElement(gmailfield).sendKeys(gmail);
		d.findElement(passwordfield).sendKeys(password);
		
		Thread.sleep(5000);
		d.findElement(submit).click();
		Thread.sleep(5000);
		 
	}
	

}
