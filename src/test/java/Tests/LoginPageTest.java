package Tests;

import org.testng.annotations.Test;

import Base.BaseClass;
import Pages.LoginPage;
import Utils.ConfigReader;

public class LoginPageTest extends BaseClass {

	    @Test
	    public void testValidLogin() {    	
	 
	    	
	    	LoginPage loginPage = new LoginPage(driver);
	        
	        // Read credentials from config.properties
	    	
	        String username = ConfigReader.getProperty("username");
	        String password = ConfigReader.getProperty("password");
	        loginPage.clickLogin();

	    }
	}


