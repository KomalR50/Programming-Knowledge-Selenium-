/* Launch the chrome browser
 Open the Url
 Enter Username and Password
 Clear Password and Password
 Submit Login Button---unable to perform it instead click
 Get Text
 Get Location
 Get Size
 Get tag Name
 To Print number of links present on the webpage.
 Check if the login button is displayed
 Check if the login button is enabled
 Check if the login button is selected
*/

package demo;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebEle12 {

	public static void main(String[] args) throws InterruptedException {
		// Open the chrome browser
		System.setProperty("webdriver.chrome.driver",
				"E://Selenium Jars and Drivers//Drivers//Chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Navigate to the URL.

		driver.get("https://web.fieldsense.in/");

		//Max the window
		driver.manage().window().maximize();

		// Enter Valid USerName
        driver.findElement(By.id("userEmailAddress")).sendKeys("komal.rasal@qlc.in");

		// Enter Valid PAssword
		driver.findElement(By.id("userPassword")).sendKeys("Gr@ce5035");

		// Clear the USername and Password

		Thread.sleep(2000);
		driver.findElement(By.id("userEmailAddress")).clear();
		Thread.sleep(1000);
		driver.findElement(By.id("userPassword")).clear();

		// Click on login
		driver.findElement(By.xpath("//button[normalize-space()='LOG IN']")).click();

		// GetText--Plz do this by linktext
		String gettext = driver.findElement(By.xpath("//span[normalize-space()='Forgot Password?']")).getText();
		System.out.println("The text is: " + gettext);

		// Get Location
		WebElement Element = driver.findElement(By.id("userEmailAddress"));
		Point point = Element.getLocation();
		System.out.println("X coordinates " + point.x);
		System.out.println("y coordinates " + point.y);

		// GetSize
		WebElement Element1 = driver.findElement(By.id("userEmailAddress"));
		org.openqa.selenium.Dimension dim = Element1.getSize();
		System.out.println("Height is " + dim.height);
		System.out.println("Width is " + dim.width);

		// Get Tagname
		String getTagName = driver.findElement(By.id("userEmailAddress")).getTagName();
		System.out.println("Tag Name is: " + getTagName);

		// To Print number of links present on the webpage.
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("NUMBER OF LINKS PRESENT ON THE WEBPAGE ARE: " + links.size());

		// Check if the login button is displayed
		Boolean bool1 = driver.findElement(By.xpath("//input[@id='userEmailAddress']")).isDisplayed();
		System.out.println(bool1);

		// Check if the login button is enabled
		Boolean bool2 = driver.findElement(By.xpath("//input[@id='userEmailAddress']")).isEnabled();
		System.out.println(bool2);

		// Check if the login button is selected
		Boolean bool3 = driver.findElement(By.xpath("//input[@id='userEmailAddress']")).isSelected();
		System.out.println(bool3);
	}



}
