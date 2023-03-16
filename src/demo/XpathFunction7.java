package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathFunction7 {

	public static void main(String[] args) {
		// 1. Open Chrome browser
		System.setProperty("webdriver.chrome.driver","E://Selenium Jars and Drivers//Drivers//Chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// 2. Navigate to the URL.
		driver.get("https://money.rediff.com/gainers");

		// 3. Max chrome browser
		driver.manage().window().maximize();

		// Xpath Axes
		// Self Node
		//driver.findElement(By.xpath("//a[contains(.,'Super Tex Indust')]/self::a")).click();
		String selfnode = driver.findElement(By.xpath("//a[contains(.,'Super Tex Indust')]/self::a")).getText();
		System.out.println("1.The first self node is:"+selfnode);
		
		//Parent node
		String parentnode= driver.findElement(By.xpath("//a[contains(.,'Super Tex Indust')]/parent::td")).getText();
		System.out.println("2. The parent node is:"+parentnode);
		
		//Child Node
		List <WebElement> childnodes = driver.findElements(By.xpath("//a[contains(.,'Super Tex Indust')]/ancestor::tr/child::*"));
		System.out.println("3. The number of Child Nodes are:" + childnodes.size());
		
		//Ansector node
		String ancestornode = driver.findElement(By.xpath("//a[contains(.,'Super Tex Indust')]/ancestor::tr")).getText();
		System.out.println("4. The Ancestor node is:"+ancestornode);
		
		//Following Node
		List <WebElement> followingnodes = driver.findElements(By.xpath("//a[contains(.,'Super Tex Indust')]/following::*"));
		System.out.println("5.The number of following elements in the current HTML tag is:"+followingnodes.size());
		
		//following-sibling
		List <WebElement> followingsibnodes = driver.findElements(By.xpath("//a[contains(.,'Super Tex Indust')]/ancestor::tr/following-sibling::*"));
		System.out.println("6. The number of Following-Sibling elements in the current HTML tag is:"+followingsibnodes.size());
		
		//Preceding
		
		  List <WebElement> preceding = driver.findElements(By.xpath("//a[contains(.,'Super Tex Indust')]/preceding::*")); 
		  System.out.println("7. The number of following elements in the current HTML tag is:"+preceding.size());
		  
		  //Preceding-sibling--NOTE I have chnage the customer to raj televusion as
		  List <WebElement> precedingsibling = driver.findElements(By.xpath("//a[contains(.,'Raj Television Netwo')]/ancestor::tr/preceding-sibling::*")); 
		  System.out.println("8. The number of following elements in the current HTML tag is:"+precedingsibling.size());
		 
		driver.close();
		}

}
