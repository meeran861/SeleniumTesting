package seleniumtesting;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task1 {
	static WebDriver driver;
	public static void launch(String url){
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\srika\\eclipse-workspace\\seleniumtesting\\target\\chromedriver.exe");
	//	WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
	}
	public static void max() {
		driver.manage().window().maximize();
	}
	public static void min() {
		driver.manage().window().minimize();
	}
	public static void clo() {
		driver.close();
	}
	public static void qu() {
		driver.quit();
	}
		

	public static void main(String[] args) {
		
		

		
		

	}

}
