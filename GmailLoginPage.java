package com.sprighub;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GmailLoginPage {

	public static void main(String[] args) throws InterruptedException 
	{
		//System.setProperty("webdriver.chrome driver","C:\\Program Files\\Selenium Driver&Jars\\Drivers\\chromedriver_win32\\chromedriver.exe");
				WebDriverManager.chromedriver().setup();
				WebDriver driver=new ChromeDriver();
				driver.get("https://www.gmail.com/");
				driver.manage().window().maximize();
				driver.findElement(By.id("identifierId")).sendKeys("amala10004@gmail.com");
				Thread.sleep(2000);
				driver.findElement(By.className("VfPpkd-vQzf8d")).click();
				Thread.sleep(2000);
				String at=driver.getTitle();
				String et="SignIn";
				driver.close();
				if(at.equalsIgnoreCase(et)) 
				{
					System.out.println("Test Case Successusfully Executed");
				}
				else
				{
					System.out.println("Test UnSuccessus");
				}		

	}

}
