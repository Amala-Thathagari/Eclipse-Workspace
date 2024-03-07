package com.sprighub;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReveloutionLoginPage {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chromedriver driver","C:\\Program Files\\Selenium Driver&Jars\\Drivers\\chromedriver_win32\\chromedriver.exe");
				WebDriverManager.chromedriver().setup();
				WebDriver driver=new ChromeDriver();
				driver.get("https://app1.sprighub.ai/authentication/login");
				driver.findElement(By.id("mat-input-0")).sendKeys("admin@autonation.com");
				driver.findElement(By.id("mat-input-1")).sendKeys("Sprig@Hub");
				driver.findElement(By.cssSelector("btn-block icon-b-col btn-c btn-lg m-t-20 m-b-20 mat-raised-button mat-primary")).click();
				driver.close();

	}

}
