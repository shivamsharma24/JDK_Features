package implemenationInSelenium;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebdriverWithJava8AndAbove {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://amazon.in");

		driver.manage().window().maximize();

		List<WebElement> linksInWebsite = driver.findElements(By.tagName("a"));
		System.out.println("Total links present in amazon homepage " + linksInWebsite.size());

//		// 1- using normal for-each loop
//		for (WebElement links : linksInWebsite)
//			System.out.println(links.getText());
//		
//		//2- using lamda expression
//		linksInWebsite.forEach(x-> System.out.println(x.getText()));

		// 3- Using stream we can remove Blank fields
		List<String> collect_List = linksInWebsite.stream().filter(ele -> !ele.getText().equals(""))
				.map(ele -> ele.getText()).collect(Collectors.toList());

		collect_List.forEach(ele -> System.out.println(ele));
		System.out.println("====================================");

		// 4. Findfirst
		String firstText = linksInWebsite.stream().filter(ele -> !ele.getText().equals("")).findFirst().get().getText();

		System.out.println(firstText);

		// 5. FindAny
		String firstAny = linksInWebsite.stream().filter(ele -> !ele.getText().equals("")).findAny().get().getText();
		System.out.println(firstAny);

		// 6. exclude blank fields and contains amazon
		System.out.println("=================exclude blank fields and contains amazon===================");

		List<String> collectString = linksInWebsite.stream()
				.filter(ele -> !ele.getText().equals("") && ele.getText().contains("Amazon")).map(ele -> ele.getText())
				.collect(Collectors.toList());

		collectString.forEach(ele -> System.out.println(ele));
		
		
		//7.
		List<String> collectString1 = linksInWebsite.stream()
				.filter(ele -> !ele.getText().isEmpty())
				.filter(ele ->!ele.getText().startsWith(""))
				.map(ele->ele.getText())
				.collect(Collectors.toList());
		
		collectString1.forEach(ele -> System.out.println(ele));
		
		driver.quit();

	}
}
