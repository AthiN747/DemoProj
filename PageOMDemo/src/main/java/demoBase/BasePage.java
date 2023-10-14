package demoBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasePage {
	public static WebDriver driver;
	 static Properties prop;
	
	//reading property files
	public BasePage(){
		try {
		prop = new Properties();
		FileInputStream ip = new FileInputStream("./src/main/resources/Config/Config.properties");
		prop.load(ip);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	//browser initialization
	public static void BrowserInitialization() {
		String Browsername = prop.getProperty("browser");
		if(Browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","./src/main/resources/Browserdrivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(prop.getProperty("url"));
			driver.manage().window().maximize();
			
		}
		if(Browsername.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver","./src/main/resources/Browserdrivers/geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get(prop.getProperty("url"));
			driver.manage().window().maximize();
			
		}
		
		
		
		
	}
	
	
	

}
