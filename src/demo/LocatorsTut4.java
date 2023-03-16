package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsTut4 {

	public static void main(String[] args) {
		// Open the chrome browser
		System.setProperty("webdriver.chrome.driver",
				"E://Selenium Jars and Drivers//Drivers//ChromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// max the chrome browser
		driver.manage().window().maximize();

		// navigate to the url
		driver.get("https://www.amazon.com");

		// By ID
		// driver.findElement(By.id("twotabsearchtextbox")).sendKeys("T-Shirts for
		// women");

		/*
		 * //OR second method WebElement search =
		 * driver.findElement(By.id("twotabsearchtextbox"));
		 * search.sendKeys("formal pants for women evening party");
		 */

		// By Name
		// driver.findElement(By.name("field-keywords")).sendKeys("Watches for women
		// digital");

		// By LinkText
		// driver.findElement(By.linkText("")).click();
		// driver.findElement(By.linkText("Scholarship")).click();
		// driver.findElement(By.linkText("Click Here To CAP Portal (Admission)
		// A.Y.2022-23")).click();

		// By PArtial LinkText
		// driver.findElement(By.partialLinkText("CAP")).click();

		// By ClassName
		// driver.findElement(By.className("")).sendKeys();

		// By TagName Note : findElemets now
		List<WebElement> Link = driver.findElements(By.tagName("a"));
		System.out.println(Link.size());

		// Name of Links
		for (WebElement l : Link) {
			System.out.println(l.getText());
		}

	}

}
