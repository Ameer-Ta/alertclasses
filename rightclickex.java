package com.alertautomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class rightclickex {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\thasleem\\Dropbox\\PC\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();	
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Actions act = new Actions(driver);
		WebElement webe = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		act.contextClick(webe).build().perform();
		driver.findElement(By.xpath("//li[@class='context-menu-item context-menu-icon context-menu-icon-delete']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
	}

	
	}

}
