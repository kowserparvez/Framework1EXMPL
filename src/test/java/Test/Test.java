package Test;

import java.io.IOException;
import java.security.AllPermission;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.Accessories;
import Pages.AllProduct;
import Pages.Home;
import Pages.Ipads;
import Pages.ProductCa;
import Pages.Error;

public class Test {
	
static WebDriver driver;
	@Before
		public void Starting() {
			//System.out.println("Run before test");
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Kowser\\eclipse-workspace\\ToolsQA\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("http://store.demoqa.com/");
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		}
		
			
		@After
		public void Ending() throws InterruptedException {
			//System.out.println("Run after test");
			driver.manage().deleteAllCookies();
			Thread.sleep(3000);
			driver.close();
		}	

		@org.junit.Test
		public void testing() throws InterruptedException, IOException {
			System.out.println("testing");
			Home hm = new Home();
			hm.myaccount(driver);
			Thread.sleep(1000);
			hm.clickproca(driver);
			Thread.sleep(1000);
			hm.printtitle1(driver);
			Thread.sleep(1000);
			ProductCa pc = new ProductCa();
			pc.printtile2(driver);
			Thread.sleep(1000);
			pc.prodCat(driver);
			AllProduct ap= new AllProduct();
			Thread.sleep(1000);
			ap.allProd(driver);
			Thread.sleep(1000);
			ap.printtile3(driver);
			Thread.sleep(1000);
			Ipads ip=new Ipads();
			ip.clkIpad(driver);
			Thread.sleep(1000);
			ip.clkMac(driver);
			Accessories aw=new Accessories();
			aw.apWatch(driver);
			Thread.sleep(1000);
			Error er=new Error();
			er.printsearch(driver);
			
			
		}
}
