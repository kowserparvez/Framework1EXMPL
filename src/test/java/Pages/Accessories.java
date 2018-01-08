package Pages;
import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Util.Lib;

public class Accessories extends Lib{

	
	public static void apWatch(WebDriver driver) throws IOException {
		WebElement appleW = driver.findElement(By.xpath(".//*[@id='main-nav']/form/fieldset/input[1]"));
		appleW.clear();
//		appleW.sendKeys("Apple Watch");
//		//comment also works to press enter
//		appleW.sendKeys("Apple Watch"+"\n");
//		Actions ac=new Actions(driver);
//		ac.keyDown(Keys.CONTROL).sendKeys(Keys.ENTER).keyUp(Keys.CONTROL).build().perform();
//				
		appleW.sendKeys(readexcel(driver,0,0)+"\n");
	
		
	}

	
}
