package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	    private WebDriver driver;

	    // Locators
	    
	    private By usernameField = By.name("username");
	    private By passwordField = By.name("password");
	    private By loginButton = By.xpath("//button[@type='submit']");

	    // Constructor
	    
	    public LoginPage(WebDriver driver) {
	        this.driver = driver;
	    }

	    // Actions
	    
	    public void enterUsername(String username) {
	        driver.findElement(usernameField).sendKeys(username);
	    }

	    public void enterPassword(String password) {
	        driver.findElement(passwordField).sendKeys(password);
	    }

	    public void clickLogin() {
	        driver.findElement(loginButton).click();
	    }

	    public String getPageTitle() {
	        return driver.getTitle();
	    }
	}


