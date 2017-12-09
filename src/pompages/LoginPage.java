package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//declaration the element
	   @FindBy(id="username")
		private WebElement unTB;
	   
	   @FindBy(name="pwd")
	  	private WebElement pwdTB;
	   
	   @FindBy(xpath="//div[.='Login ']")
	 	private WebElement loginBtn;
	   //initiaxation
	   public LoginPage(WebDriver driver){
	 //select firstpackage of initElements
	 PageFactory.initElements(driver, this);
	   }
		
		//utilisation
	   
	   public void setUsername(String un){
		   unTB.sendKeys(un);
	   }

	   public void setPassword(String pwd){
		   pwdTB.sendKeys(pwd);
	   } 
	   
	   public void clickLogin(){
		   loginBtn.click();
	   } 
	   
	   
	   

	}



