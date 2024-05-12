package com.alertautomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebookcreateex {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\thasleem\\Dropbox\\PC\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();	
		driver.manage().deleteAllCookies();
		driver.findElement(By.xpath("(//a[normalize-space()='Create New Account'])[1]")).click();
		Thread.sleep(3000);
		WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
		Thread.sleep(3000);
		Select s = new Select(month);
		List<WebElement> alloptions=s.getOptions();
		System.out.println(alloptions.size()); 
		 for(WebElement s1:alloptions) { 
		 System.out.println(s1.getText()); 
		 } 
		 
		 
		 int sizeOfListbox = s.getOptions().size(); 
		
	}

}
