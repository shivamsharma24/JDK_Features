package implemenationInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandlesWithStream {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.popuptest.com/goodpopups.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Good PopUp #3")).click();
		String title = switchToWindow(driver, "PopupTest Wednesday");
		System.out.println(title);
		driver.quit();
	}
	
	public static String switchToWindow(WebDriver driver, String title) {
		return driver.getWindowHandles()
		.stream()
		.map(handler->driver.switchTo().window(handler).getTitle())
		.filter(ele->ele.contains(title))
		.findFirst()
		.orElseThrow(()-> {
			throw new RuntimeException("No such window");
		
		});
	}

}
