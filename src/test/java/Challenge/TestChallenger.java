package Challenge;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Entities.Mapping;

public class TestChallenger extends Mapping {

	private WebDriver driver;

	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.grupobancolombia.com/");
	}

	@Test
	public void testQA() {

	}
	
	@After
	public void tearDown() {
		
	}

}
