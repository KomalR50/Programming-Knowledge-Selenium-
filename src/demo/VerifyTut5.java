package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTut5 {
	public static void main(String[] args) {
		// Open the chrome browser
		System.setProperty("webdriver.chrome.driver","E://Selenium Jars and Drivers//Drivers//ChromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Navigate to the URL.
		driver.get("https://opensource-demo.orangehrmlive.com/");
		// Verify the URL We can use getCurrentURL()
		String act_url = driver.getCurrentUrl();
		System.out.println(act_url);

		// Max chrome browser
		driver.manage().window().maximize();

		// Verify
		String desired_url = "https://opensource-demo.orangehrmlive.com";
		if (act_url.equals(desired_url)) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
		// Verify Title we can use getTitle()
		String act_title = driver.getTitle();
		System.out.println(act_title);

		// Verify
		String desired_title = "OrangeHRM";
		if (act_title.equals(desired_title)) {
			System.out.println("IT IS Correct" + "\n KOMAL YOU ARE SIMPLY SIGNIFICANT");
		} else {
			System.out.println("OrangeHRM is the correct Title." + "\n YOU ARE GOING WRONG WAY");
		}

		// Verify Source we can use getPageSource()

		String ps = driver.getPageSource();
		System.out.println(ps);

	}

}
