package pom_class_Files;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Blog_page {
	@FindBy(xpath = "//a[text()='Blog']")
	public static WebElement Blog;
	@FindBy (xpath = "(//a[text()='Read More'])[2]")
	public static WebElement Readmore;
	@FindBy (xpath = "//a[text()='selenium']")
	public static WebElement selenium;
	@FindBy (xpath = "(//a[text()='Read More'])[10]")
	public static WebElement SeleniumReadmore;
	
	
 public void range() {
	 
 }

} 
