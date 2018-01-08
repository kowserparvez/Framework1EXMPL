package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AllProduct {

	public static void allProd(WebDriver driver) {
		
		WebElement allPro = driver.findElement(By.xpath(".//*[@id='menu-item-72']/a"));
		allPro.click();
		
	}
	
	public static void printtile3(WebDriver driver){
		
		System.out.println("Title of All Product page is ::::::::" +driver.getTitle());
		
	}
	
}
