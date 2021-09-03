package academy;

import java.io.IOException;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resources.base;

public class HomePage extends base {

	public LandingPage l;

	public static Logger log = LogManager.getLogger(base.class.getName());

	@BeforeTest
	public void initialize() throws IOException {

		driver = initializeDriver();

	}

	@Test
	public void bookingFlight() {
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		l = new LandingPage(driver);
		l.getFrom().click();
		l.getFrom().sendKeys("ben");
		List<WebElement> from = l.getFromDropDown();
		for (WebElement dep : from) {

			if (dep.getText().contains("Bengaluru")) {
				dep.click();
				break;
			}

		}
		l.getTo().click();
		l.getTo().sendKeys("del");
		List<WebElement> to = l.getToDropDown();
		for (WebElement des : to) {

			if (des.getText().contains("Delhi")) {
				des.click();
				break;
			}
		}

		WebElement pop = w.until(ExpectedConditions.visibilityOfElementLocated((By) l.getPopup()));
		pop.click();

		l.getCalendar().click();
		while (!l.getMonthPicker().contains("December")) {

			l.getNext().click();
		}

		List<WebElement> days = l.getDayPicker();
		for (WebElement day : days) {
			if (day.getText().equalsIgnoreCase("15")) {
				day.click();
				break;
			}

		}

		l.getDateBetween().click();
		l.getDuration().click();
		l.getAirline().click();
		l.getSelectingAirline().click();
		l.getLanguage().click();
		l.getSelectingLanguage().click();
		l.getSearch().click();
	}

	@AfterTest
	public void teardown() {

		driver.close();

	}
}