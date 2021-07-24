package testBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;


public class SetUpTest {
	
	public static WebDriver driver;
	
	@Before(order= 1)
	public void open_Browser() {   

		String projectPath = System.getProperty("user.dir");

		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/drivers/chromeDriver/chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		System.out.println("Inside Step- browser is open");
	}	

	@Before(order= 0)
	public void setUp2() {
		
		System.out.println("---- I am inside step2 -----");
	}
	
	@BeforeStep
	public void beforeStep() {
		
		System.out.println("I am inside beforeSteps ----");
	}
	
	@AfterStep
	public void afterStep() {
		
		System.out.println("I am inside afterSteps ----");
	}
	
	@After(order= 1)
	public void tearDown() {
		
		System.out.println("I am inside tearDown ----");
	}
	
	@After(order= 2)
	public void close_Browser() {
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.close();
	}	
}
