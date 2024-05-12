package com.alertautomation;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertautomation {

	public static void main(String[] args)throws Exception   {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\thasleem\\Dropbox\\PC\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.way2automation.com/demo.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[text()='Registration'])[1]")).click();
		Thread.sleep(3000);
		Set<String> wh=driver.getWindowHandles();
		Iterator<String> i1=wh.iterator();
		String mainwindow=driver.getWindowHandle();
		System.out.print(mainwindow);
		System.out.print(wh);

		while(i1.hasNext())
		{
			String childwindow=i1.next(); 
			if(!mainwindow.equalsIgnoreCase(childwindow))
			{
				driver.switchTo().window(childwindow);
				Thread.sleep(3000);
				driver.findElement(By.xpath("//div[@id='load_box']//a[@class='fancybox'][normalize-space()='ENTER TO THE TESTING WEBSITE']")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id='wrapper']/div/div/div[6]/ul/li/a/figure")).click();

				Set<String> wh1=driver.getWindowHandles();
				Iterator<String> i2=wh1.iterator();
				while(i2.hasNext())
				{
					String childwindow1=i2.next(); 
					if(!mainwindow.equalsIgnoreCase(childwindow1) && !childwindow.equalsIgnoreCase(childwindow1))
					{
						driver.switchTo().window(childwindow1);
						driver.switchTo().frame(0);
						driver.findElement(By.xpath("(//*[@onclick='myFunction()'])[1]")).click();
						Thread.sleep(3000);
						String alerttext=driver.switchTo().alert().getText();
						System.out.print(alerttext);
						Thread.sleep(3000);
						driver.switchTo().alert().accept();
						driver.switchTo().defaultContent();
						Thread.sleep(3000);
						driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[1]/div[1]/div[1]/ul/li[2]/a")).click();
						Thread.sleep(3000);
						driver.switchTo().frame(1);
						Thread.sleep(3000);
						driver.findElement(By.xpath("(//button[normalize-space()='Click the button to demonstrate the Input box.'])[1]")).click();
						Thread.sleep(3000);
						Alert alertwindow=driver.switchTo().alert();
						Thread.sleep(3000);
						System.out.println("The message displayed on alert:"+alertwindow.getText());
						Thread.sleep(3000);
						alertwindow.sendKeys("ameer");
						Thread.sleep(3000);
						alertwindow.accept();
						driver.switchTo().defaultContent();
						Thread.sleep(3000);
					}
				}
			}
		}

	}
}

