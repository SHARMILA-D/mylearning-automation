package amazontest;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AmazonLoginPage {

	public static WebDriver driver;

	@BeforeSuite
	public static void methstart() {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium WebDriver3.4\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement textbox = driver.findElement(By.id("twotabsearchtextbox"));
		textbox.sendKeys("mobile");
		textbox.sendKeys(Keys.ENTER);
		System.out.println("AmazonLoginPage.methstart()");
	}

	@Test
	public static void myTestMethod() {
		System.out.println("AmazonLoginPage.methstart()");
	}
	
	@Test
	public static void mysecondtest()
	{
	    List<WebElement> mobileamount=driver.findElements(By.className("//*[@id=\"search\"]/div[1]/div/div[1]/div/span[3]/div[2]/div[2]/div/span/div/div/div/div/div[2]/div[2]/div/div[3]/div[1]/div/div[1]/div[1]/a/span[1]/span[2]/span[2]"));
	    
		for(WebElement currentmobileamount:mobileamount)
		{
			String stringtext=currentmobileamount.getText();
			System.out.println("stringtext="+stringtext);
		}
		
	}

	@AfterSuite
	public static void methend() {
		driver.quit();
	}
}
