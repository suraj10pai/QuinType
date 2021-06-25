package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class loginPage {

	private WebDriver driver;

	private By SearchTextBox = By.cssSelector("input.new-todo");

	private By checkbox = By.cssSelector(":nth-child(1) > div input");

	private By ButtonDelete = By.cssSelector("button.destroy");
	
	private By ButtonDelete1 = By.cssSelector("li:nth-child(2) > div");


	public loginPage(WebDriver driver) {
		this.driver = driver;
	}

	public By getSearchTextBox() {
		return SearchTextBox;
	}

	public By getcheckbox() {
		return checkbox;
	}

	public By getButtonDelete() {
		return ButtonDelete;
	}
	
	
	

	public void AddThreeNotes() {
		driver.get("https://todomvc.com/examples/react/#/");
		Actions ac = new Actions(driver);

		ac.moveToElement(driver.findElement(getSearchTextBox())).build().perform();

		driver.findElement(getSearchTextBox()).sendKeys("FIRST");
		driver.findElement(getSearchTextBox()).sendKeys(Keys.ENTER);

		driver.findElement(getSearchTextBox()).sendKeys("SECOND");
		driver.findElement(getSearchTextBox()).sendKeys(Keys.ENTER);

		driver.findElement(getSearchTextBox()).sendKeys("THIRD");
		driver.findElement(getSearchTextBox()).sendKeys(Keys.ENTER);

	}

	public void MarkExistingNoteasDone() {

		driver.findElement(getcheckbox()).click();
	}

	public void DeleteNotes() {
		Actions ac = new Actions(driver);

		ac.moveToElement(driver.findElement(getcheckbox())).build().perform();
		driver.findElement(getButtonDelete()).click();
		//driver.close();

	}

}
