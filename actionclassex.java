package com.alertautomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionclassex {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\thasleem\\.cache\\selenium\\chromedriver\\win32\\chromedriver_win32 (7)\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://stqatools.com/demo/index.php");
		driver.manage().window().maximize();	
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//a[contains(text(),'Interactions')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Double Click']")).click();
		WebElement xyz = driver.findElement(By.xpath("//button[text()='Click Me / Double Click Me!']"));
		xyz.click();
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		 act.doubleClick(xyz).build().perform();
		 act.moveToElement(xyz, 20, 30);
		 Thread.sleep(4000);
		
//		act.click().click().click().build().perform();
//		act.contextClick(xyz).build().perform();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[text()='Inspect']")).click();
	}
}

