package com.sprighub;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MenuButton {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://app1.sprighub.ai/myviews/funnel-view");	
		driver.findElement(By.id("mat-input-0")).sendKeys("admin@veriforce.com");
		driver.findElement(By.id("mat-input-1")).sendKeys("Sprig@Hub");
		driver.findElement(By.cssSelector("btn-block icon-b-col btn-c btn-lg m-t-20 m-b-20 mat-raised-button mat-primary")).click();
		driver.findElement(By.className("mat-select-trigger")).click();
		driver.close();
	}

}
