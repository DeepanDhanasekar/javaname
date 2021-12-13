package selenium;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragad {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "F:\\eclipse\\selenium\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.guru99.com/test/drag_drop.html");
WebElement element = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));

WebElement element2 = driver.findElement(By.id("bank"));
Actions d=new Actions(driver);
d.dragAndDrop(element, element2).perform();

WebElement f = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
WebElement f2 = driver.findElement(By.id("amt7"));
Actions s=new Actions(driver);
s.dragAndDrop(f, f2).perform();



}
}
