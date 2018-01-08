package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//import Util.Lib;

public class Error {
 
public static void printsearch (WebDriver driver) {
  
  WebElement printsearch=driver.findElement(By.xpath(".//*[@id='content']"));
  //WebElement printsearch=findelement(driver, ".//*[@id='content']");
  System.out.println("here is text     "+printsearch.getText());
 }
}