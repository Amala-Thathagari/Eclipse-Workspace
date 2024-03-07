package com.sprighub;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleWebPage {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Amala Thathagari\\Downloads\\chromedriver_win32\\chromedriver.exe");
				WebDriverManager.chromedriver().setup();
				//ChromeOptions co=new ChromeOptions();
				//co.addArguments("--remote-allow-origins=*");
				WebDriver driver=new ChromeDriver();
				//driver.manage().window().maximize();
				driver.get("https://www.google.com");
				Thread.sleep(2000);
				driver.close();
	}

}
