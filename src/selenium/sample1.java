package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\eclipse\\GetAttribute\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
	}

}
