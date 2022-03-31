package org.Sp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Drag {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\vignesh\\Silambu\\s2\\chromedriver.exe");
		WebDriver W = new ChromeDriver();
		W.get("https://affiliate.flipkart.com/login");
		W.manage().window().maximize();
	    WebElement username = W.findElement(By.className("form-control"));
	    username.sendKeys("silambujagajn24@gmail.com");
	    WebElement password = W.findElement(By.id("inputPassword"));
	    password.sendKeys("22446688");
	    WebElement login = W.findElement(By.id("submitLogin"));
	    login.click();
	    WebElement cl = W.findElement(By.xpath("//a[text()='Forgot password?']"));
	    cl.click();
	   WebElement fp = W.findElement(By.id("forgotPasswordInputEmail"));
	   fp.sendKeys("silambujagan24@gmail.com");
	   WebElement na = W.findElement(By.name("submit"));
	   na.click();
	   
	   W.quit();
	    
       
	}

}
                                                                                           