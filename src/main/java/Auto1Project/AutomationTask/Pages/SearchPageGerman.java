package Auto1Project.AutomationTask.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Auto1Project.AutomationTask.Base.Base;

public class SearchPageGerman extends Base{

	//Initializing Page Object Elements within the Class.
		public SearchPageGerman() {
			PageFactory.initElements(driver,this);
		}
		
		@FindBy(xpath = "//button[text()='Alles akzeptieren']")
		WebElement acceptCookie;
		
		@FindBy(xpath = "//span[text() = 'Marke & Modell']")
		WebElement brandDropdown;
		
		@FindBy(xpath = "//ul[@data-qa-selector= 'topMakes']/li/input[@value ='Volkswagen']")
		WebElement carBrandName;
		
		@FindBy(xpath = "//input[@value ='Golf']")
		WebElement carMake;
		
		@FindBy(xpath = "//span[text() = 'Kilometer']")
		WebElement mileageDropdown;
		
		@FindBy(xpath = "//select[@data-qa-selector = 'select-mileage-to']")
		WebElement mileageSelect;
		
		@FindBy(xpath = "//button[text() ='Marke: Volkswagen']")
		WebElement selectedBrand;
		
		@FindBy(xpath = "//button[text() ='Modell: Golf']")
		WebElement selectedModel;
		
		@FindBy(xpath = "//button[text() ='Kilometer: Bis 25.000 km']")
		WebElement selectedMileage;
		
		public String acceptCookieGerman()
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
			sel.selectByVisibleText("25.000 km");		
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
