package mavenyoutube;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class YoutubeMovie {
	public static WebDriver driver;

	@Test
	public void test1() {
		System.out.println("test111");
		System.setProperty("webdriver.chrome.driver", "C:\\seleniumWebdriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = (WebDriver) new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();

	}
}
