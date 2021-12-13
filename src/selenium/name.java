package selenium;

import java.awt.List;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class name {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "F:\\eclipse\\selenium\\driver\\chromedriver.exe");

WebDriver driver =new ChromeDriver();
driver.get("https://www.amazon.in/");
driver.manage().window().maximize();

WebElement textsearch = driver.findElement(By.id("twotabsearchtextbox"));
textsearch.sendKeys("Iphone",Keys.ENTER);

WebElement lnkIphone = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[2]"));
lnkIphone.click();

String parentwindowId = driver.getWindowHandle();
System.out.println(parentwindowId);

Set<String> allwindowsId = driver.getWindowHandles();
System.out.println(allwindowsId);
for (String eachwindowId : allwindowsId) {
	if (!parentwindowId.equals(eachwindowId)) {
		driver.switchTo().window(eachwindowId);
		}
}

WebElement btn = driver.findElement(By.id("add-to-cart-button"));
btn.click();
driver.close();
driver.quit();
}
}
