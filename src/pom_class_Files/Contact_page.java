package pom_class_Files;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Contact_page {
	
	@FindBy(xpath = "//a[text()='Contact']")
	public static WebElement contact;
@FindBy(xpath = "//input[@name='wpforms[fields][0][first]']")
public static WebElement contact_FirstName;
@FindBy(xpath = "//input[@name='wpforms[fields][0][last]']")
public static WebElement contact_lastname;
@FindBy (xpath = "//input[@name='wpforms[fields][1]']")
public static WebElement contact_email;
@FindBy(xpath = "//textarea[@name='wpforms[fields][2]']")
public static WebElement contactpage_comment;
@FindBy(xpath = "//div[@class='recaptcha-checkbox-border'][1]")
public static WebElement Imnotarobot;
@FindBy(xpath = "//button[@id='wpforms-submit-161']")
public static WebElement contactsubmit;

}
