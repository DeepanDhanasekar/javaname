package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class named {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "F:\\eclipse\\selenium\\driver\\chromedriver.exe");
WebDriver driver =new ChromeDriver();
driver.get("");
//WebElement element = driver.findElement(By.id("countries"));
//Select select=new Select(element);


WebElement link = driver.findElement(By.linkText("LC20lb MBeuO DKV0Md"));
link.click();


//List<WebElement> options = select.getOptions();
//for (int i = 0; i < options.size()  ; i++) {
//	WebElement webElement = options.get(i);
//	
//String attribute = webElement.getAttribute("value");
//System.out.println(attribute);
//
//
//
//


}}
}
