package BaseLayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static void setup() {

		WebDriverManager.firefoxdriver().setup();
		 driver = new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	}

}
