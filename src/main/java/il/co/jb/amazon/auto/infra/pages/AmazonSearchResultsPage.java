package il.co.jb.amazon.auto.infra.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AmazonSearchResultsPage extends AbstractPage {

	private static final By firstNonSponsoredResultTitle = By.xpath("//div[@data-index='2']//h5");
	
	public AmazonSearchResultsPage(WebDriver driver) {
		super(driver);
	}
	
	public String getFirstNonSponsoredResultTitle() {
		return driver.findElement(firstNonSponsoredResultTitle).getText();
	}
	
}
