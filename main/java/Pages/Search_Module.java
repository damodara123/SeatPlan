package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Commin.functinalities;

public class Search_Module extends functinalities{	 
	 
	 
	public void Search(WebDriver d,String searchlocation, String text, String Sel,String Showsel) throws Exception
	{
		WebElement hederserdis = d.findElement(By.xpath("//input[@class='algolia-autocomplete algolia-autocomplete-site-header algolia-autocomplete-site-header-desktop aa-input']"));
		WebElement homeserdis = d.findElement(By.xpath("//input[@id='search-input']"));
		
		
		if(searchlocation.equalsIgnoreCase("Headerbar"))
		{
			display(hederserdis);
			sendkeys(d, "//input[@class='algolia-autocomplete algolia-autocomplete-site-header algolia-autocomplete-site-header-desktop aa-input']", text);
			click(d, "//i[@class='sp-icon sp-icon-search']");
			if(Sel.equalsIgnoreCase("Show"))
			{
				click(d, "//img[@alt='"+Showsel+"']");
				System.out.println("Show selection url:"+d.getCurrentUrl());
				click(d, "//img[@class='video-modal__play-btn-icon']");
				d.switchTo().frame("yt-player");
				//Thread.sleep(5000);
				WebElement eleme = d.findElement(By.xpath("//button[@class='ytp-large-play-button ytp-button ytp-large-play-button-red-bg']"));
				new WebDriverWait(d, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(eleme));			
				click(d, "//button[@class='ytp-large-play-button ytp-button ytp-large-play-button-red-bg']");
				d.switchTo().defaultContent();
				Thread.sleep(35000);
				click(d,"//button[@class='video-modal__close-btn']//span[@class='sp-icon sp-icon-close']");
				
			}
			else if (Sel.equalsIgnoreCase("Venue")) 
			{
				click(d, "//img[@alt='London Palladium']");
				System.out.println("venue selection url:"+d.getCurrentUrl());
				click(d, "//div[@class='card-image']//img[@alt='Peter Pan']");
			}
		}
		
		else if (searchlocation.equalsIgnoreCase("Homepage")) 
		{
			display(homeserdis);
			sendkeys(d, "//input[@id='search-input']", text);
			click(d, "//button[@type='submit']//i");
			if(Sel.equalsIgnoreCase("Show"))
			{
				click(d, "//img[@alt='"+Showsel+"']");
				System.out.println("Show selection url:"+d.getCurrentUrl());
				click(d, "//img[@class='video-modal__play-btn-icon']");
				d.switchTo().frame("yt-player");
				//Thread.sleep(5000);
				WebElement eleme = d.findElement(By.xpath("//button[@class='ytp-large-play-button ytp-button ytp-large-play-button-red-bg']"));
				new WebDriverWait(d, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(eleme));			
				click(d, "//button[@class='ytp-large-play-button ytp-button ytp-large-play-button-red-bg']");
				d.switchTo().defaultContent();
				Thread.sleep(35000);
				click(d,"//button[@class='video-modal__close-btn']//span[@class='sp-icon sp-icon-close']");
				
			}
			else if (Sel.equalsIgnoreCase("Venue")) 
			{
				click(d, "//img[@alt='London Palladium']");
				System.out.println("venue selection url:"+d.getCurrentUrl());
				click(d, "//div[@class='card-image']//img[@alt='Peter Pan']");
				d.findElement(By.linkText("Description")).click();
			}
		}
		
		
	}
	
	

}
