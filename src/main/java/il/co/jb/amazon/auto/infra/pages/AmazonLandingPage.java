package il.co.jb.amazon.auto.infra.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AmazonLandingPage extends AbstractPage {

	private static final By searchBox = By.id("twotabsearchtextbox");
	private static final By goButton = By.xpath("//input[@value='Go']");
	
	public AmazonLandingPage(WebDriver driver) {
		super(driver);
	}
	
	public void writeToSearchbox(String searchTerm) {
		driver.findElement(searchBox).sendKeys(searchTerm);
	}
	
	public AmazonSearchResultsPage clickOnGoButton() {
		driver.findElement(goButton).click();
		return new AmazonSearchResultsPage(driver);
	}
}
