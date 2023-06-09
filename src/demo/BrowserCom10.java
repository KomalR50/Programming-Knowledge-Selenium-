/*
 * 1.Open the chrome browser
 * 2.Navigate to the URL
 * 3.Max the window
 * 4.verify the current URL
 * 5.Verify the title of the page
 * 6.Print the length of the title of the page.
 * 7.Print the pagesource of the page
 * 8.Print the length of the pagesource of the page.
 * 9.Click on the New tab
 * 10.Close the browser
 * 11.Quit the browser.
 * */

package demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCom10 {

	public static void main(String[] args) throws InterruptedException {
		// 1.Open the Chrome browser
		System.setProperty("webdriver.chrome.driver","E://Selenium Jars and Drivers//Drivers//Chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

//        //navigate to the URL
		driver.get("https://demoqa.com/browser-windows");

//      //2.Navigate to the url
//        //Assign the url to a string variable
//        String url="https://demoqa.com/browser-windows";
//        driver.get(url);

		// max the window
		driver.manage().window().maximize();

		// URL of the page
		String urlofthepage = driver.getCurrentUrl();
		System.out.println("The URL of the page is " + urlofthepage);

		// Verify the URL
		if (urlofthepage.equals("https://demoqa.com/browser-windows")) {
			System.out.println("The URL is verified");
		} else {
			System.out.println("The URL is not verified");
		}

		// Title of the page
		String title = driver.getTitle();
		System.out.println("The title of the page is " + title);
		// verify
		if (title.equals("ToolsQA")) {
			System.out.println("The title is verified");
		} else {
			System.out.println("The title is not verified");
		}
		// length of the title
		int titlelength = driver.getTitle().length();
		System.out.println("The length of the title is " + titlelength);

		// pagesource
		String ps = driver.getPageSource();
		System.out.println("The page source is " + ps);

		// length of page source
		int pslength = driver.getPageSource().length();
		System.out.println("The length of the page source is " + pslength);

		// click()
		driver.findElement(By.xpath("//body/div/div/div/div/div/div/div[1]/button[1]")).click();

//        //close()
//        Thread.sleep(5000);
//        driver.close();

		// quit

		Thread.sleep(5000);

		driver.quit();

	}

}


