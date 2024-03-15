package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage {

	public class LoginPage {
		public  void enterEmail (WebDriver wd,String data) {
			WebElement username= wd.findElement(By.linkText("_2IX_2- VJZDxU"));
			username.sendKeys(data);
		}

		public  void enterPassword(WebDriver wd,String data) {
			WebElement password= wd.findElement(By.id("id_password"));
			password.sendKeys(data);
		}

		public  void clickLoginButton(WebDriver wd) {
			WebElement login= wd.findElement(By.xpath("/account/login?ret=/"));
			login.click();
		}

		public  void clickSignUpNowLink (WebDriver wd) {
			wd.findElement(By.linkText("Sign Up Now")).click();
		}

	}


}
