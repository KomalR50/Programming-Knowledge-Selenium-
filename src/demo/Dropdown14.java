package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Dropdown14 {

	public static void main(String[] args) throws InterruptedException {
		// 1. Open Chrome browser
		System.setProperty("webdriver.chrome.driver","E://Selenium Jars and Drivers//Drivers//Chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// 2. Max chrome browser
		driver.manage().window().maximize();

        // 3. Navigate to the URL.
		driver.get("http://fs-webrefresh-final.s3.ap-south-1.amazonaws.com/login.html");
		
		// Enter Valid USerName
        driver.findElement(By.id("userEmailAddress")).sendKeys("testdash@gmail.com");

		// Enter Valid PAssword
		driver.findElement(By.id("userPassword")).sendKeys("qlc.in123");
		
		// Click on login
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
//		Click on the Arrow for that use Select class
//		driver.findElement(By.xpath("//div[@class='nice-select open']//ul[@class='list']")).click();
//		OR
//		WebElement dropdown = driver.findElement(By.xpath("//body/div[@class='pcoded-main-container']/div[@class='pcoded-content']/div[@class='container-fluid container-set']/div[@class='row m-l-10 m-r-5']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]"));
//		Select selectelement = new Select (dropdown);
//		
//		Find the options present in the dropdown menu
//		List<WebElement> options = selectelement.getOptions();
//		System.out.println(options.size());
//		
		//NAvigate to the My Team URL
		//Thread.sleep(5000);                  
		//driver.get("http://fs-webrefresh-final.s3.ap-south-1.amazonaws.com/index.html");
		
	   //Navigate to the subordinate timeline page
		//driver.get("http://fs-webrefresh-final.s3.ap-south-1.amazonaws.com/my-team-location.html");
		//driver.findElement(By.className("dashboard-name")).click();
	}

}


