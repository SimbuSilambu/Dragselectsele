package org.Sp;

import java.nio.channels.SelectionKey;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Selec {
	
	

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\vignesh\\Silambu\\s2\\chromedriver.exe");
		WebDriver x = new ChromeDriver();
		x.get("http://output.jsbin.com/osebed/2");
		x.manage().window().maximize();
		
		WebElement ff = x.findElement(By.id("fruits"));
		
	Select s=new Select(ff);
		s.selectByIndex(0);
		s.selectByIndex(1);
		s.selectByIndex(2);
		Thread.sleep(3000);
		s.deselectAll();
		
		x.manage().window().minimize();
		
	x.quit();
	
	
	
	}

}
