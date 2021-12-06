package Auto1Project.AutomationTask;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Auto1Project.AutomationTask.Base.Base;
import Auto1Project.AutomationTask.Pages.SearchPageEnglish;
import Auto1Project.AutomationTask.Pages.SearchPageGerman;


public class searchFunctionality extends Base{
	SearchPageGerman searchPageGerman;
	SearchPageEnglish searchPageEnglish;
	public searchFunctionality()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp() throws InterruptedException
	{
		intialization();
		searchPageEnglish = new SearchPageEnglish(); 
		searchPageGerman = new SearchPageGerman();
	}
	
	@Test
	public void filterCarsTest() {
		if(searchPageGerman.acceptCookieGerman().equalsIgnoreCase("Alles akzeptieren"))
		{
		searchPageGerman.filterSelection();
		Assert.assertEquals("Marke: Volkswagen", searchPageGerman.selectedBrandName());
		Assert.assertEquals("Modell: Golf", searchPageGerman.selectedModelName());
		Assert.assertEquals("Kilometer: Bis 25.000 km", searchPageGerman.selectedMileageName());
		}
		else if(searchPageEnglish.acceptCookieEnglish().equalsIgnoreCase("Accept everything"))
		{
		searchPageEnglish.filterSelection();
		Assert.assertEquals("Brand: Volkswagen", searchPageEnglish.selectedBrandName());
		Assert.assertEquals("Model: Golf", searchPageEnglish.selectedModelName());
		Assert.assertEquals("Kilometers: Up to 25,000 km", searchPageEnglish.selectedMileageName());
		}
		else
		System.out.println("No Results");
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
