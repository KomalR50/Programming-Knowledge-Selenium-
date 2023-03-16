package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDom9 {

	public static void main(String[] args) {
        // 1. Open Chrome browser
		System.setProperty("webdriver.chrome.driver","E://Selenium Jars and Drivers//Drivers//Chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// 2. Max chrome browser
		driver.manage().window().maximize();

        // 3. Navigate to the URL.
		driver.get("https://books-pwakit.appspot.com/");
		
		//host
		WebElement host = driver.findElement(By.tagName("book-app"));
		
		//Shadow dom
		JavascriptExecutor j = (JavascriptExecutor) driver;
		SearchContext shadowdom = (SearchContext) j.executeScript("return arguments[0].shadowRoot",host);
		
		//App Header
		WebElement appheader = shadowdom.findElement(By.tagName("app-header"));
		
		//App toolbar
		WebElement apptool = appheader.findElement(By.cssSelector("app-toolbar.toolbar-bottom"));
		
		//Book Input
		WebElement book = apptool.findElement(By.tagName("book-input-decorator"));
		
		//Input
		book.findElement(By.cssSelector("input#input")).sendKeys("SeleniumWebdriver");
		
		//Close the Browser
		//driver.close();

		
}

}
