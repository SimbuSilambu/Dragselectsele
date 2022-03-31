package org.robbot;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robo {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\vignesh\\Silambu\\s2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("karthikesan");
		WebElement pass = driver.findElement(By.name("pass"));
		pass.sendKeys("karthi008");
		Thread.sleep(3000);
		WebElement mouse = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		Actions a= new Actions(driver);
		a.moveToElement(mouse).perform();
		
		
		TakesScreenshot t=(TakesScreenshot)driver;
		File src= t.getScreenshotAs(OutputType.FILE);
		File dest =new File("C:\\Users\\Admin\\eclipse-workspace\\vignesh\\Silambu\\s1\\karthi");
		FileUtils.copyFile(src, dest);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
