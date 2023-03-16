package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Autosuggestion15 {

	public static void main(String[] args) throws InterruptedException {
		// 1. Open Chrome browser
		System.setProperty("webdriver.chrome.driver","E://Selenium Jars and Drivers//Drivers//Chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
				
		// 2. Max chrome browser
		driver.manage().window().maximize();

		// 3. Navigate to the URL.
		driver.get("http://fs-webrefresh-final.s3.ap-south-1.amazonaws.com/login.html");
		
		// Enter Valid USerName
        driver.findElement(By.id("userEmailAddress")).sendKeys("nilesh.shah@qlc.in");

		// Enter Valid PAssword
		driver.findElement(By.id("userPassword")).sendKeys("qlc.in123");
		
		// Click on login
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

		
		//NAvigate to the My Team URL
		Thread.sleep(5000);                  
		driver.get("http://fs-webrefresh-final.s3.ap-south-1.amazonaws.com/index.html");
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='ddl_ProdRpt']"));
        Select selectelement = new Select (dropdown);
				
        // Find the options present in the dropdown menu
		List<WebElement> options = selectelement.getOptions();
		System.out.println(options.size());
		
        //Autosuggestion
//		WebElement from = driver.findElement(By.className("CaptionCont SelectBox search"));
//		from.click();
//		from.sendKeys("mis");
//		from.sendKeys(Keys.ARROW_DOWN);
//		from.sendKeys(Keys.ENTER); 
	}

}
