package com.antonio.test.TestSkill;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Entities.Mapping;

public class TestSkillApplicationTests extends Mapping {

	/*Metodo que da un intervalo de tiempo de 1 segundo*/
	public void sleep1s() throws InterruptedException {
		Thread.sleep(1000);
	}

	private WebDriver driver;

	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bancolombia.com/personas");
	}

	@Test
	public void testQA() throws InterruptedException {
		driver.findElement(btnAcerca).click();
		sleep1s();
		
		driver.findElement(btnInfo).click();
		sleep1s();
		
		driver.findElement(btnProveedores).click();
		sleep1s();
		
		driver.findElement(btnDescargar).click();
		sleep1s();
	}
	
	@After
	public void tearDown() {
		
	}

}
