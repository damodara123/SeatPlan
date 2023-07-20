package Commin;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.Browser;

public class functinalities extends Browser{
		
	public void display(WebElement text)
	{
		System.out.println(text.isDisplayed());
	}
	
	public void click(WebDriver d, String path)
	{
		d.findElement(By.xpath(path)).click();	
	}
	
	public void sendkeys(WebDriver d, String path, String enterdata)
	{
		d.findElement(By.xpath(path)).sendKeys(enterdata);
	}
	
	public WebDriverWait delay(WebDriver dr, int time)
	{
		WebDriverWait wait = new WebDriverWait(dr, Duration.ofSeconds(time));
		return wait;
	}
	public void delay_ms(WebDriver dr,int time)
	{
		WebDriverWait wait1 = new WebDriverWait(dr, Duration.ofNanos(time*1000000));
	}
}

/*Note:
boolean bool=d.findElement(By.xpath(path)).isDisplayed();
 
if(bool)
{
d.findElement(By.xpath(path)).click();
}
else
{
	
}
*/

