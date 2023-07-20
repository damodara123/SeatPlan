package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {
	
	//public means to access the any where and static means starting to ending execution.
	public static WebDriver dri;
	
	public WebDriver lunchUrl(String browsername, String url)
	{
		if(browsername.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver();
			dri=new ChromeDriver();
			dri.get(url);
			dri.manage().window().maximize();
		}
		else if (browsername.equalsIgnoreCase("Edge"))
		{
			WebDriverManager.edgedriver();
			dri=new EdgeDriver();
			dri.get(url);
			dri.manage().window().maximize();
		}
		
		return dri;
	}

}
