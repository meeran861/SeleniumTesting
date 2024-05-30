package seleniumtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Task2 {
	static WebDriver driver;
	public static void dropDown() {
		WebElement drop = driver.findElement(By.xpath("//select[@id='second']"));
		Select s = new Select(drop);
		boolean mul = s.isMultiple();
		System.out.println(mul);
		s.selectByIndex(0);
		s.selectByIndex(1);
		s.selectByIndex(3);
		
	}
public static void main(String[] args) {
	Task1.launch("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
	Task1.max();
	Task2.dropDown();
	Task1.qu();

}
}
