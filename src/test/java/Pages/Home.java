package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home {

	public static void myaccount(WebDriver driver) {
		
		WebElement myacc=driver.findElement(By.xpath(".//*[@id='account']/a"));
		System.out.println("Here is the text::::::"+myacc.getText());
	}
	
	
	public static void clickproca(WebDriver driver) throws InterruptedException {
		WebElement prodCa=driver.findElement(By.xpath("//a[text()='Product Category']"));
		
		prodCa.click();
		Thread.sleep(2000);
	
	}
	
	public static void printtitle1(WebDriver driver) {
		System.out.println("Title of the Home page is ::::::::" +driver.getTitle());
		
	}
}
