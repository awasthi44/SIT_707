package web.service;

import static org.junit.Assert.*;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class LoginServiceTest {

    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:/chromedriver-win64/chromedriver.exe"); 
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test
    public void testValidLogin() {
        openLoginPage();
        fillLoginForm("shova", "shova_pass", "1995-05-10");
        submitForm();
        assertEquals("Expected title to be 'success' for valid login", "success", driver.getTitle());
    }

    @Test
    public void testInvalidLogin() {
        openLoginPage();
        fillLoginForm("shova", "wrong", "1995-05-10");
        submitForm();
        assertEquals("Expected title to be 'fail' for invalid password", "fail", driver.getTitle());
    }

    @Test
    public void testEmptyForm() {
        openLoginPage();
        fillLoginForm("", "", "");
        submitForm();
        assertEquals("Expected title to be 'fail' for empty form", "fail", driver.getTitle());
    }

    private void openLoginPage() {
        driver.get("http://localhost:8082/index.html"); // Load from running Jetty server
    }

    private void fillLoginForm(String username, String password, String dob) {
        driver.findElement(By.name("username")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.name("dob")).sendKeys(dob);
    }

    private void submitForm() {
        WebElement form = driver.findElement(By.tagName("form"));
        form.submit();
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
