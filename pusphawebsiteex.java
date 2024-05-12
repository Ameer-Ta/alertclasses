package com.alertautomation;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class pusphawebsiteex {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\thasleem\\Dropbox\\PC\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		//				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(50));
		//				wait.until(ExpectedConditions.alertIsPresent());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("Pushpa: The Rise"+Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//h3[text()='Pushpa: The Rise - Wikipedia']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		String reldate=driver.findElement(By.xpath("//tbody/tr[12]/td[1]/div[1]/ul[1]/li[1]")).getText();
		System.out.println(reldate);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String country = driver.findElement(By.xpath("//td[normalize-space()='India']")).getText();
		System.out.println(country);
		driver.navigate().back();
		driver.findElement(By.xpath("//input[@aria-label='Search']")).clear();
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("pushpa movie imdb"+Keys.ENTER);
		driver.findElement(By.xpath("//h3[text()='Pushpa: The Rise - Part 1 (2021) - IMDb']")).click();
		String reldateimdb=driver.findElement(By.xpath("//a[normalize-space()='December 17, 2021 (United States)']")).getText();
		System.out.println(reldateimdb);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		String country1 = driver.findElement(By.xpath("//a[normalize-space()='India']")).getText();
		System.out.println(country1);
		//		

		String s1="December 17, 2021";
		String s2="December 17, 2021 (United States)";

		System.out.println(Arrays.toString(s1.split(" ")));
		System.out.println(Arrays.toString(s2.split(" ")));
		System.out.println(s2.contains("December 17, 2021"));

		if((s2.contains(s1)))
		{
			System.out.println(true);
		}
		else
		{
			System.out.println(false);
		}
		if(country.contains(country1))
		{
			System.out.println(true);
		}
		else
		{
			System.out.println(false);

		}



	}
}