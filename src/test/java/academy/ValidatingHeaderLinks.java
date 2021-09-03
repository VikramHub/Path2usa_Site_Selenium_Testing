package academy;

import java.io.IOException;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resources.base;

public class ValidatingHeaderLinks extends base {

	public WebDriver driver;
	LandingPage l;
	public static Logger log = LogManager.getLogger(base.class.getName());

	@BeforeTest
	public void initialize() throws IOException {

		driver = initializeDriver();
		log.info("Driver is initialized");

		driver.get(prop.getProperty("url"));
		log.info("Navigated to booking page");
	}

	@Test
	public void validatingHeaderLinks() {

		l = new LandingPage(driver);
		List<WebElement> link = l.getHeaderSectionLinks();
		System.out.println("Total No.of Header Links: " + link.size());
		for (WebElement links : link) {

			System.out.println(links);

		}

		log.info("Header Links are displayed");
	}

	@AfterTest
	public void teardown() {

		driver.close();

	}
}
