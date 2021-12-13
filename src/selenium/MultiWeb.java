package selenium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiWeb {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\eclipse\\selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/table.html");
		List<Integer> li = new ArrayList();
		
		List<WebElement> col = driver.findElements(By.tagName("th"));
		System.out.println(col.size());
		
		List<WebElement> row = driver.findElements(By.tagName("tr"));
		System.out.println(row.size());
		
		List<WebElement> least = driver.findElements(By.xpath("//td[2]"));
		for (int i = 0; i < least.size(); i++) {
			WebElement webElement = least.get(i);
			String text = webElement.getText();
			String replace = text.replace("%", "");
			System.out.println(replace);
			
			int parseInt = Integer.parseInt(replace);
			li.add(parseInt);
		}
		System.out.println(li);
		Integer min = Collections.min(li);
		System.out.println(min);
		
		String string = Integer.toString(min);
		String leastValue = string+"%";
		System.out.println(leastValue);
		
		String finalXpat = "//td[normalize-space()="+"\""+ leastValue +"\""+"]"+"//following-sibling::td[1]";
		WebElement findElement = driver.findElement(By.xpath(finalXpat));
		System.out.println(finalXpat);
		findElement.click();
	}

}
