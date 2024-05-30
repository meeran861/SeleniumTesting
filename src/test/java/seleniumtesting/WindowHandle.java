package seleniumtesting;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Samsung S24",Keys.ENTER);
		driver.findElement(By.xpath("//div[contains(text(),'SAMSUNG Galaxy S24 Ultra 5G (Titanium Gray, 256 GB)')]")).click();
        //To Switch another tab:
		String cWin = driver.getWindowHandle();
		Set<String> allWin = driver.getWindowHandles();
//		for(String x : allWin) {
//			if(!x.equals(cWin))
//				driver.switchTo().window(x);
//		}
		java.util.List<String> li = new ArrayList<>();
	    li.addAll(allWin);
	    String x = li.get(1);
	    driver.switchTo().window(x);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='button']")).click();
		
	}

}
