package pom_class_Files;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Practice_page {
	@FindBy(xpath = "//li[@id='menu-item-20']")
	public static WebElement Practice;
	
	@FindBy(xpath ="//a[text()='Test Exceptions']" )
	public static WebElement TestExceptions;
	
	@FindBy (xpath = "//button[@id='add_btn']")
	public static WebElement Addbutton;
	
	@FindBy (xpath = "(//button[@id='edit_btn'])[1]")
	public static WebElement Row1Editbutton;
	
	@FindBy(xpath = "(//input[@class='input-field'])[1]")
	public  static WebElement Row1_textbox;
	
	@FindBy (xpath = "(//button[@id='save_btn'])[1]")
	public static WebElement Row1Savebutton;
	
	@FindBy (xpath = "//label[text()='Row 2']//following::input[@class='input-field']")
	public static WebElement  Row2textbox;
	
	@FindBy (xpath = "(//button[@id='save_btn'])[2]")
	public static WebElement row2savebutton;
	
	@FindBy (xpath="(//button[@name='Edit'])[2]")
	public static WebElement row2Edit_button;
	
	@FindBy(xpath = "//button[@id='remove_btn']")
	public static WebElement Removebutton;
	
	
	

}
