/*WINDOW HANDLE
 * Test Case 1: The first set of test case teaches us how to print the handle values and the difference between the getWindowHandle() and getWindowHandles().
1.Open the chrome browser
2. Navigate to the URL https://demoqa.com/browser-windows 3.Maximize the Window
4. Print the Parent window handle
5.Click on 'New Window' 3 times.
6.Print Window Handles.
7.Quit the Browser

Test Case 2: The next set of test case teaches us how to switch and navigate to other sites.
1.Open the Chrome Browser
2.Navigate to the URL https://demoqa.com/browser-windows
3.Maximize the window
4. Print Parent Windows Handle Value 5.Click on 'New window' 3 times
6.Print value of all window handles
7. Switching to windows
* 
* Test Case 3: The 3rd set of test cases teaches us how to close all the windows.
1.Open the Chrome Browser
2.Navigate to the URL https://demoqa.com/browser-windows
3.Maximize the window
4.Print Parent Windows Handle Value
5.Click on 'New window 3 times
6.Print value of all window handles
7.Switching to windows
8. Navigating to Google.com
9.Maximize the page
10.Switch to parent window
11.Close the parent Window
12.Switch back to other window
* */

package demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class MultiWin13 {

	public static void main(String[] args) throws InterruptedException {
		// 1.Open the Chrome browser
		System.setProperty("webdriver.chrome.driver",
				"E://Selenium Jars and Drivers//Drivers//Chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// open the URL
		driver.get("https://demoqa.com/browser-windows");

		// max
		driver.manage().window().maximize();

		// print parent window handle
		String parentwindowhandle = driver.getWindowHandle();
		System.out.println("the parent window handle is " + parentwindowhandle);

		// click 3 times
		for (int i = 1; i <= 3; i++) {
			driver.findElement(By.xpath("//button[normalize-space()='New Window']")).click();
			Thread.sleep(3000);
		}
		// print the window handles
		Set<String> windowhandles = driver.getWindowHandles();
		String lastwindowhandle = "";
		for (String handle : windowhandles) {
			System.out.println("The window handles are " + handle);
			// switching
			System.out.println("Switching windows " + handle);
			Thread.sleep(2000);
			driver.switchTo().window(handle);
			// Navigating to the google
			Thread.sleep(3000);
			driver.get("http://www.google.com");
			driver.manage().window().maximize();
		}
		// close parent window first
		Thread.sleep(2000);
		driver.switchTo().window(parentwindowhandle);
		driver.close();
//switch to the other windows
		Thread.sleep(2000);
		driver.switchTo().window(lastwindowhandle);
		Thread.sleep(2000);
		driver.quit();

	}

}
