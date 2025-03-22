package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pages.FBHomePage;
import Pages.FBLoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FBLoginTest {


	    public WebDriver driver;
	    public FBLoginPage loginPage;
	    public FBHomePage homePage;

	    @BeforeClass
	    public void setup() {
	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.facebook.com/");
	        loginPage = new FBLoginPage(driver);
	        homePage = new FBHomePage();
	    }

	    @Test
	    public void testFacebookLogin() {
	        loginPage.login("naveen.manneela24@gmail.com", "Facebook@1234");
	        Assert.assertTrue(homePage.isHomePageDisplayed(), "Login failed or homepage not displayed");
	    }

	    @AfterClass
	    public void tearDown() {
	        driver.quit();
	    }
	}

