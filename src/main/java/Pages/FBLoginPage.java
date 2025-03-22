package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBLoginPage {

	    WebDriver driver;

	    // Locators using @FindBy
	    @FindBy(id = "email")
	    WebElement emailField;

	    @FindBy(id = "pass")
	    WebElement passwordField;

	    @FindBy(name = "login")
	    WebElement loginButton;

	    // Constructor
	    public FBLoginPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	    // Login method
	    public void login(String username, String password) {
	        emailField.sendKeys(username);
	        passwordField.sendKeys(password);
	        loginButton.click();
	    }
	}

