package sit707_week1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumOperations {
	
	public static void sleep(int sec) {
		try {
			Thread.sleep(sec * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void open_chrome_and_close() {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver-win64/chromedriver.exe");
		
		System.out.println("Fire up chrome browser.");
		WebDriver driver = new ChromeDriver();
		
		System.out.println("Driver info: " + driver);
		
		sleep(5);
		
		driver.close();
	}
	
	public static void open_chrome_maximize_close() {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver-win64/chromedriver.exe");
		
		System.out.println("Fire up chrome browser.");
		WebDriver driver = new ChromeDriver();
		
		System.out.println("Driver info: " + driver);
		
		sleep(5);
		
		driver.manage().window().maximize();
		
		sleep(5);
		
		driver.close();
	}

	public static void load_web_page_close() {
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver-win64/chromedriver.exe");
		
		System.out.println("Fire up chrome browser.");
		WebDriver driver = new ChromeDriver();
		
		System.out.println("Driver info: " + driver);
		
		sleep(5);
		
		driver.get("https://selenium.dev");
		
		sleep(5);
		
		driver.close();
	}
	
	public static void open_chrome_loadpage_resize_close() {
		// Student Information
		System.out.println("Hello from 224887189, Shova Awasthi");
		
		// Step 1: Locate chrome driver folder in the local drive.
		System.setProperty("webdriver.chrome.driver", "C:/chromedriver-win64/chromedriver.exe");
		
		// Step 2: Use above chrome driver to open up a chromium browser.
		System.out.println("Fire up chrome browser.");
		WebDriver driver = new ChromeDriver();
		
		System.out.println("Driver info: " + driver);
		
		sleep(2);
		
		// Load Google page
		driver.get("https://www.google.com");
		
		sleep(2);
		
		// Set window size to 640x480
		driver.manage().window().setSize(new Dimension(640, 480));
		System.out.println("Window resized to 640x480");
		sleep(2);
		
		// Double window size to 1280x960
		driver.manage().window().setSize(new Dimension(1280, 960));
		System.out.println("Window resized to 1280x960");
		sleep(2);
		
		// Close browser
		driver.close();
	}
}
