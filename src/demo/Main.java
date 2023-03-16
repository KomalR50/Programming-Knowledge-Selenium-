package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		//Open the Chrome Browser
		System.setProperty("webdriver.chrome.driver","E://Selenium Jars and Drivers//Drivers//ChromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Maximize the URL
		driver.manage().window().maximize();
		
		//Navigate to the URL
		driver.get("https://www.Google.com");
		
		//Close the Browser
		Thread.sleep(4000);
		driver.close();
		}

}
