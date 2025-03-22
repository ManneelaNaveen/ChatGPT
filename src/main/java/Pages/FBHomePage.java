package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBHomePage {


	public class HomePage {
	    WebDriver driver;

	    // Example: Verify Home Page by locating the Profile Name
	    @FindBy(xpath = "//div[contains(@aria-label, 'Account')]")
	    WebElement profileIcon;

	    // Constructor
	    public HomePage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	    
	    // Method to verify homepage is displayed
	    
	    public boolean isHomePageDisplayed() {
	        return profileIcon.isDisplayed();
	    }
	}

	public boolean isHomePageDisplayed() {
		return false;
	}

}
