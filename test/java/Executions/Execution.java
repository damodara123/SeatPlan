package Executions;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pages.Production_Module;
import Pages.popup;

public class Execution extends Production_Module{
		WebDriver driver;
			
			@BeforeClass
			public void Login() 
			{
				driver=lunchUrl("chrome","https://dev:devils@"+"uat.seatplan.com");
				//driver=lunchUrl("chrome","https://www.hyrtutorials.com/p/alertsdemo.html");
			}

		
			@Test
			public void Searching() throws Exception
			{
				loginfun(driver, "jogu@gmail.com", "Password@123");
				System.out.println("Current url:"+driver.getCurrentUrl());
				Search(driver,"headerbar","lion","show","The Lion King");
				
			}
			
			@Test(priority = 1)
			public void showexecution() throws Exception 
			{
				//showpg(driver);
				pop(driver);
				
			}

			@AfterClass
			public void close() 
			{
				//driver.close();
			}

}
