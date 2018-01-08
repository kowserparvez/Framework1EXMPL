package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductCa {

	public static void printtile2(WebDriver driver){
		
		System.out.println("Title of the Product page is ::::::::" +driver.getTitle());
		
	}
	
	public static void prodCat(WebDriver driver ) {
		WebElement proCat = driver.findElement(By.xpath(".//*[@id='post-64']/header/h1"));
		System.out.println("Here is the text::::::"+proCat.getText());
		
		
	}
}
