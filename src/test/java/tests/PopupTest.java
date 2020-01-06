package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PopupTest {

	WebDriver driver;  
	
	@Test
	public void Popup_window(){
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// 1. http://live.demoguru99.com/ 
		driver.get("http://live.demoguru99.com/");
		
		// 2. Click on 'Mobile menu'
		driver.findElement(By.xpath("//*[@id='nav']/ol/li[1]/a")).click();
		
		// 3. Click on 'Add To Compare' for 2 mobile - SONY XPERIA and IPHONE
		 driver.findElement(By.xpath("//*[@id='top']/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[1]/div/div[3]/ul/li[2]/a")).click();
		 
		driver.findElement(By.xpath("//*[@id='top']/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[2]/div/div[3]/ul/li[2]/a")).click();
	
		// 4. Click on 'COMPARE' buttons
		driver.findElement(By.xpath("//*[@id='top']/body/div/div/div[2]/div/div[3]/div[1]/div[2]/div/button")).click();
		
		// 5. Verify the pop-up window and check that the products are reflected in it.
		 // Products reflect on it
		
		// 6. Close the pop - up windows
		
		//driver.quit();
	}
}
