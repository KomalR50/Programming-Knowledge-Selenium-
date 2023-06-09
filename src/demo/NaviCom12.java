/*
 * LAunch the chrome browser
 * Open wordpress
 * min the window
 * Click on get started
 * come back to home page
 * Refresh the page
 * Close the browser
 * */

package demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaviCom12 {

	public static void main(String[] args) throws InterruptedException {
        //1.Open  the Chrome browser
        System.setProperty("webdriver.chrome.driver", "E://Selenium Jars and Drivers//Drivers//Chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

       //Navigate to the page
        driver.navigate().to("https://wordpress.com/");

        //max
        driver.manage().window().maximize();

        //click on get start
        driver.findElement(By.xpath("//a[normalize-space()='Get Started']")).click();

        //back
        Thread.sleep(5000);
        driver.navigate().back();

        //forward
        Thread.sleep(5000);
        driver.navigate().forward();

        //refresh
        Thread.sleep(5000);
        driver.navigate().refresh();

        //close the browser
        Thread.sleep(6000);
        driver.close();


    }

}
