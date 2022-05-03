package commons;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	protected WebDriver driver = new ChromeDriver();

	public void acessoHomePage() {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://bugbank.netlify.app/");
	}

	public void finalizaSessao() {
		driver.quit();

	}

}
