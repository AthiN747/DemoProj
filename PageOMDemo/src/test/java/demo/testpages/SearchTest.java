package demo.testpages;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import demo.Pages.SearchPage;
import demoBase.BasePage;

public class SearchTest extends BasePage{
	SearchPage searchpage;
	
	public SearchTest(){
		super();
		}
	
	@BeforeMethod
	public void SetUp() throws InterruptedException {
		BrowserInitialization();
		Thread.sleep(5000);
		searchpage = new SearchPage(driver);
	}
	
	@Test
	public void ValidatePagetitle() throws InterruptedException {
		String Title = searchpage.GetpageTitle();
		Assert.assertEquals(Title, "Chrome Web Store - Extensions");
		System.out.println(Title);
	}
	
	@Test(priority=1)
	public void ActionClick() throws InterruptedException {
		searchpage.BtnClick();
	}
	
 @AfterMethod
 public void teardown() {
	 
	 driver.quit();
 }
	
	
	
	
	

}
