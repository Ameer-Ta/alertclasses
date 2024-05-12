package com.alertautomation;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert2prac {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\thasleem\\Dropbox\\PC\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/popup.php");
		driver.manage().window().maximize();		
		
		//driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();	
		driver.findElement(By.xpath("//a[normalize-space()='Click Here']")).click();
        Thread.sleep(3000);

		        		
		        String MainWindow=driver.getWindowHandle();		
		        		
		        // To handle all new opened window.				
		            Set<String> s1=driver.getWindowHandles();	//it is used to store multiple 	
		        Iterator<String> i1=s1.iterator();		
		        		
		        while(i1.hasNext())			
		        
		        {		
		            String ChildWindow=i1.next();		
		            		
		            if(!MainWindow.equalsIgnoreCase(ChildWindow))			
		            {    		
		                 
		                    // Switching to Child window
		                    driver.switchTo().window(ChildWindow);
		            
		                    Thread.sleep(3000);
		                    driver.findElement(By.name("emailid")).sendKeys("mahammadameer@gmail.com");  
		                    Thread.sleep(3000);

		                                			
		                    
		                    driver.findElement(By.name("btnLogin")).click();
		                    Thread.sleep(3000);
		                                 
					// Closing the Child Window.
		                        driver.close();		
		            }		
		        }		
		        // Switching to Parent window i.e Main Window.
		            driver.switchTo().window(MainWindow);	

		
	}
}
