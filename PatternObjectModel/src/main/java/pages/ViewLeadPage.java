package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class ViewLeadPage extends ProjectMethods{

	public ViewLeadPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;

		PageFactory.initElements(driver, this);		

	}
	
	@FindBy(how=How.LINK_TEXT,using="Logout")
	private WebElement eleLogOut;
	public LoginPage clickLogout() {
		click(eleLogOut);
		return new LoginPage(driver, test);
	}
}
/*	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement eleCompanyName;

	public ViewLeadPage enterCmpName(String cName) {
		type(eleCompanyName, cName);
		return this;

	}

	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement eleFirstName;
	public ViewLeadPage enterFirstName(String fName) {
		type(eleFirstName,fName);
		return this;	
	}
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement eleLastName;
	public ViewLeadPage enterLastName(String lName) {
		type(eleFirstName,lName);
		return this;		
	}
	
	@FindBy(how=How.CLASS_NAME,using="smallSubmit")
	private WebElement createLead;
	public HomePage creatingLead() {
		click(createLead);
		return new HomePage(driver, test);
}
	
	
	}

*/
















