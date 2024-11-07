package pom_class_Files;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class User_LoginPage {
	@FindBy(xpath = "//input[@id='username']")
	public static WebElement userName_1;
	@FindBy(xpath = "//input[@id='password']")
	public static WebElement Password_1;
	@FindBy(xpath = "//button[@id='submit']")
	public static WebElement Submitbutton;
	

}
