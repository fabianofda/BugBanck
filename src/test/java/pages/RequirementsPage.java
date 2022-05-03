package pages;

import org.openqa.selenium.By;

import commons.Base;

public class RequirementsPage extends Base {
	
	public void acessoBugBank() {
		acessoHomePage();

	}

	public void finalizaBugBank() {
		finalizaSessao();

	}

	public void lnkRequirement() {
		driver.findElement(By.xpath("//a[@href='/requirements']")).click();

	}


}
