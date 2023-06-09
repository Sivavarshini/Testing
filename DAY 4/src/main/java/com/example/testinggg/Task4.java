package com.example.testinggg;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task4 {
	public static void main(String [] args) throws InterruptedException
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		String url = "https://demo.opencart.com/index.php?route=checkout/voucher&language=en-gb" ;
    	driver.manage().window().maximize();
    	
//    	driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("Sivavarshini");
    	driver.findElement(By.xpath("//*[@id=\"input-to-name\"]")).sendKeys("Sivavarshini");
    	driver.findElement(By.xpath("//*[@id=\"input-to-email\"]")).sendKeys("1234567890");
    	driver.findElement(By.xpath("//*[@id=\"input-from-name\"]")).sendKeys("abc");
//    	JavascriptExecutor js = (JavacriptExecutor) driver ;
    	JavascriptExecutor js = (JavascriptExecutor) driver ;
    	js.executeScript("window.scrollBy(0,1000)", "") ;
    	
    	
    	
//    	
    	



    	
	}

}