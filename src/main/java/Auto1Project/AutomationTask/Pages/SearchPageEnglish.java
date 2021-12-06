package Auto1Project.AutomationTask.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Auto1Project.AutomationTask.Base.Base;

public class SearchPageEnglish extends Base{

	//Initializing Page Object Elements within the Class.
	public SearchPageEnglish() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//button[text()='Accept everything']")
	WebElement acceptCookie;
	
	@FindBy(xpath = "//font[text() = 'Brand & Model']")
	WebElement brandDropdown;
	
	@FindBy(xpath = "//ul[@data-qa-selector='topMakes']/li/font/font/input[@value ='Volkswagen']")
	WebElement carBrandName;
	
	@FindBy(xpath = "//input[@value ='golf']")
	WebElement carMake;
	
	@FindBy(xpath = "//font[text() = 'kilometre']")
	WebElement mileageDropdown;
	
	@FindBy(xpath = "//select[@data-qa-selector = 'select-mileage-to']")
	WebElement mileageSelect;
	
	@FindBy(xpath = "//font[text() ='Brand: Volkswagen']")
	WebElement selectedBrand;
	
	@FindBy(xpath = "//font[text() ='Brand: Golf']")
	WebElement selectedModel;
	
	@FindBy(xpath = "//font[text() ='Brand: Kilometers: Up to 25,000 km']")
	WebElement selectedMileage;
	
	public String acceptCookieEnglish()
	{
		return acceptCookie.getText();
	}
	
	public void filterSelection()
	{
		acceptCookie.click();
		brandDropdown.click();
		carBrandName.click();
		carMake.click();
		mileageDropdown.click();
		Select sel = new Select(mileageSelect);
		sel.selectByVisibleText("25000");		
	}
	public String selectedBrandName()
	{
		return selectedBrand.getText();
	}
	public String selectedModelName()
	{
		return selectedModel.getText();
	}
	public String selectedMileageName()
	{
		return selectedMileage.getText();
	}
	
}
