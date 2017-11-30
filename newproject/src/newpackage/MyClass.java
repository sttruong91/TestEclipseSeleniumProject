package newpackage;

//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class MyClass {	
	public static void main(String[] args) {
		// declaration and instantiation of objects/variables
		//System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\struong\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		 // launch browser and direct it to the Base URL
        String baseUrl = "https://vertical.vappcenter.com/login";
        driver.get(baseUrl);
        
        // Get the WebElement corresponding to the Email Address(TextField)		
        WebElement Email = driver.findElement(By.id("email"));						            		
        // Type in an email address
        Email.sendKeys("struong@vertical.com");											
        // Find the Next button and click it		
        WebElement bNext = driver.findElement(By.className("btn_content"));
        // WebElement bNext = driver.findElement(By.className("btn_content"));
        //WebElement bNext = driver.findElement(By.class("btn btn--block btn--raised primary"));
        //WebElement bNext = driver.findElement(By.className("btn btn--block btn--raised primary"));
        
        // Using click method to click Next		
        bNext.click();	
        
        //close browser
        driver.close();    
    }
}
