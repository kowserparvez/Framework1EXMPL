package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Ipads {
	
	public static void clkIpad(WebDriver driver) throws InterruptedException {
		
		Actions ack = new Actions(driver);
		ack.moveToElement(driver.findElement(By.xpath("//a[text()='Product Category']"))).build().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='iPads']")).click();
		Thread.sleep(1000);
		
		
	}

public static void clkMac(WebDriver driver) throws InterruptedException {
		
		Actions ack = new Actions(driver);
		ack.moveToElement(driver.findElement(By.xpath("//a[text()='Product Category']"))).build().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='MacBooks']")).click();
		Thread.sleep(1000);
		
		
	}
}
