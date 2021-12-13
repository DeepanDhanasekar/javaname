package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkText {
	
	public static void main(String[] args) {
		
		
		
    System.setProperty("webdriver.chrome.driver", "F:\\eclipse\\selenium\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	
	WebElement li = driver.findElement(By.name("q"));
	li.sendKeys("Java",Keys.ENTER);
	
	WebElement link = driver.findElement(By.linkText("LC20lb MBeuO DKV0Md"));
	link.click();
	
	
	
	}

}
