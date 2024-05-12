package com.alertautomation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class windowhandleex {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\thasleem\\\\Dropbox\\\\PC\\\\Downloads\\\\chromedriver_win32 (4)\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");

		//getwindowHandle()
		String windowID = driver.getWindowHandle();
		System.out.println(windowID);
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();


		//getWindowHandles()

		Set<String> windowIDs = driver.getWindowHandles();


		//First method – iterator()

		Iterator<String> it=windowIDs.iterator();
		String parentID= it.next();
		String childwindowID= it.next();

		System.out.println("parent window ID:"+parentID);
		System.out.println("childwindow ID:"+childwindowID);


//		//Second method- using List/ArrayList
//
//		List<String>windowIDsList = new ArrayList(windowIDs); // converting set…..List
//
//		String parentwindowID = windowIDsList.get(0); //parent window id
//		String parentwindowID1 = windowIDsList.get(1); // child window id
//
//		System.out.println("parent window ID:"+parentwindowID);
//		System.out.println("childwindow ID:"+childwindowID);



	}

}
