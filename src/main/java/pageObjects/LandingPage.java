package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.base;

//rahulonlinetutor@gmail.com
public class LandingPage extends base {

	public WebDriver driver;

	private By from = By.cssSelector("#travel_from");
	private By to = By.cssSelector("#travel_to");
	private By fromDropDown = By.cssSelector("#ajax_listOfOptions div");
	private By toDropDown = By.cssSelector("#ajax_listOfOptions div");
	private By calendar = By.cssSelector("travel_date");
	private By monthPicker = By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']");
	private By yearPicker = By.cssSelector(".ek-datepicker__column-label.label-year");
	private By next = By.cssSelector("[class='datepicker-days'] th[class='next']");
	private By dayPicker = By.cssSelector(".day");
	private By dateBetween = By.cssSelector("#datebetween");
	private By durationPicker = By.cssSelector("option[value='4W']");
	private By airLine = By.cssSelector("#travel_airline");
	private By selectingAirline = By.cssSelector("option[value='Emirates Airline']");
	private By language = By.cssSelector("#travel_language");
	private By selectingLanguage = By.cssSelector("option[value='English']");
	private By search = By.cssSelector(".btn.btn-primary");
	private By logo = By.cssSelector(".logo-desktop");
	private By headerSectionLinks = By.cssSelector(".nav.navbar-nav.navbar-right li");
	private By popup = By.cssSelector(".sumome-react-wysiwyg-move-handle");

	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub

		this.driver = driver;

	}

	public WebElement getCalendar() {
		return driver.findElement(calendar);
	}

	public WebElement getPopup() {
		return driver.findElement(popup);
	}

	public WebElement getFrom() {
		return driver.findElement(from);
	}

	public WebElement getTo() {
		return driver.findElement(to);
	}

	public List<WebElement> getFromDropDown() {
		return driver.findElements(fromDropDown);
	}

	public List<WebElement> getToDropDown() {

		return driver.findElements(toDropDown);
	}

	public List<WebElement> getMonthPicker() {
		return driver.findElements(monthPicker);
	}

	public List<WebElement> getYearPicker() {
		return driver.findElements(yearPicker);
	}

	public WebElement getNext() {
		return driver.findElement(next);
	}

	public List<WebElement> getDayPicker() {
		return driver.findElements(dayPicker);
	}

	public WebElement getDateBetween() {

		return driver.findElement(dateBetween);
	}

	public WebElement getDuration() {
		return driver.findElement(durationPicker);
	}

	public WebElement getAirline() {
		return driver.findElement(airLine);
	}

	public WebElement getSelectingAirline() {

		return driver.findElement(selectingAirline);
	}

	public WebElement getLanguage() {

		return driver.findElement(language);
	}

	public WebElement getSelectingLanguage() {

		return driver.findElement(selectingLanguage);
	}

	public WebElement getSearch() {

		return driver.findElement(search);
	}

	public List<WebElement> getHeaderSectionLinks() {

		return driver.findElements(headerSectionLinks);
	}

	public WebElement getLogo() {

		return driver.findElement(logo);
	}

}
