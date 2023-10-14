package demo.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import demoBase.BasePage;

public class SearchPage extends BasePage {
	WebDriver driver;
	//find the page object
		@FindBy(xpath="//input[@id='searchbox-input']")
		WebElement Searchfield;
	
	//page factory 
	public SearchPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	// create the action methods
	public String GetpageTitle() throws InterruptedException {
		String Title = driver.getTitle();
		Thread.sleep(5000);
		return Title;
		
	}
	
	
		public  void BtnClick() throws InterruptedException {
			Thread.sleep(5000);
			Searchfield.sendKeys("Hiver");
	}
	

}
