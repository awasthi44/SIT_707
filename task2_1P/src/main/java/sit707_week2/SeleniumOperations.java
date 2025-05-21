package sit707_week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumOperations {

	public static void sleep(int sec) {
		try {
			Thread.sleep(sec*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void officeworks_registration_page(String url) {
		// Step 1: Locate chrome driver folder in the local drive.
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver-win64/chromedriver.exe");
		
		// Step 2: Use above chrome driver to open up a chromium browser.
		System.out.println("Fire up chrome browser.");
		WebDriver driver = new ChromeDriver();
		
		System.out.println("Driver info: " + driver);
		
		sleep(2);
	
		// Load a webpage in chromium browser.
		driver.get(url);
		
		// Find first input field which is firstname
		WebElement element1 = driver.findElement(By.id("firstname"));
		System.out.println("Found element: " + element1);
		// Send first name
		element1.sendKeys("Shova");
		WebElement element2 = driver.findElement(By.id("lastname"));
		System.out.println("Found element: " + element2);
		// Send last name
		element2.sendKeys("Awasthi");
		WebElement element3 = driver.findElement(By.id("phoneNumber"));
		System.out.println("Found element: " + element3);
		// Send email
		element3.sendKeys("0426270233");
		WebElement element4 = driver.findElement(By.id("email"));
		System.out.println("Found element: " + element4);
		// Send email
		element4.sendKeys("awasthishova44@gmail.com");
		WebElement element5 = driver.findElement(By.id("password"));
		System.out.println("Found element: " + element5);
		// Send password
		element5.sendKeys("Shova123");
		WebElement element6 = driver.findElement(By.id("confirmPassword"));
		System.out.println("Found element: " + element6);
		// Send confirm password
		element6.sendKeys("Shova123");
		WebElement element7 = driver.findElement(By.id("account-action-btn"));
		System.out.println("Found element: " + element7);
		// Send confirm password
		element7.click();
		
		// Sleep a while
		sleep(2);
		
		// close chrome driver
		driver.close();	
	}

	public static void alternating_website(String url) {
		// TODO Auto-generated method stub
		// Step 1: Locate chrome driver folder in the local drive.
				System.setProperty("webdriver.chrome.driver", "C:/chromedriver-win64/chromedriver.exe");
				
				// Step 2: Use above chrome driver to open up a chromium browser.
				System.out.println("Fire up chrome browser.");
				WebDriver driver = new ChromeDriver();
				
				System.out.println("Driver info: " + driver);
				
				sleep(2);
			
				// Load a webpage in chromium browser.
				driver.get(url);
				
				WebElement element1 = driver.findElement(By.id("uid"));
				System.out.println("Found element: " + element1);
				// Send email
				element1.sendKeys("awasthishova44@gmail.com");
				WebElement element2 = driver.findElement(By.id("password"));
				System.out.println("Found element: " + element2);
				// Send password
				element2.sendKeys("Shova123");
				// Find first input field which is firstname
				WebElement element3 = driver.findElement(By.id("firstName"));
				System.out.println("Found element: " + element3);
				// Send first name
				element3.sendKeys("Shova");
				WebElement element4 = driver.findElement(By.id("lastName"));
				System.out.println("Found element: " + element4);
				// Send last name
				element4.sendKeys("Awasthi");
				WebElement element5 = driver.findElement(By.id("input_CreateAccount"));
				System.out.println("Found element: " + element5);
				// Send confirm password
				element5.click();
				
				
				// Sleep a while
				sleep(2);
				
				// close chrome driver
				driver.close();	
		
	}
	
	
}
