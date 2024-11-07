package pom_Test_execution;

import java.util.Random;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import graphql.PublicApi;
import pom_class_Files.Blog_page;
import pom_class_Files.Contact_page;
import pom_class_Files.Practice_page;
import pom_class_Files.User_LoginPage;
import pom_driver.Basic_Driver_Setup_1;

public class Test_Execution  extends Basic_Driver_Setup_1{
//	@Test(priority = 0)
	
	@Test(invocationCount = 3,threadPoolSize = 2,priority = 0)
	public void loginscenario() {
		PageFactory.initElements(driver,User_LoginPage.class);
		
		User_LoginPage.userName_1.sendKeys("student");
		User_LoginPage.Password_1.sendKeys("Password123");
		User_LoginPage.Submitbutton.click();
		
	
	}
//	@Test(priority = 1)
//	public void Practice() {
//		PageFactory.initElements(driver, Practice_page.class);
//		Practice_page.Practice.click();
//		Practice_page.Row1Editbutton.click();
//		Practice_page.Row1_textbox.sendKeys("Corn Pizza");
//		Practice_page.Row1Savebutton.click();
//		Practice_page.Row2textbox.sendKeys("Special Pizza");
//		Practice_page.row2savebutton.click();
//		Practice_page.row2Edit_button.click();
//		Practice_page.Row2textbox.sendKeys("Special Pizza cost is $15");
//		Practice_page.row2savebutton.click();
//		
//		
//	}
//	
//	@Test(priority = 2)
//	public void Blog_pages() {
//		PageFactory.initElements(driver, Blog_page.class);
//		Blog_page.Blog.click();
//		Blog_page.Readmore.click();
//		Blog_page.selenium.click();
//		Blog_page.SeleniumReadmore.click();
//	}
//	@Test(priority = 3)
//	public void contactpages() {
//		PageFactory.initElements(driver,Contact_page.class);
//		Contact_page.contact.click();
//		Contact_page.contact_FirstName.sendKeys("Varun");
//		Contact_page.contact_lastname.sendKeys("B");
//		Contact_page.contact_email.sendKeys("1234567@gmail.com");
//		Contact_page.contactpage_comment.sendKeys("Just Pass the values here");
//		Contact_page.Imnotarobot.click();
//		Contact_page.contactsubmit.click();
//		
//	}

}
