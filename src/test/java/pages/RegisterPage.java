package pages;

import org.openqa.selenium.By;

import commons.Base;

public class RegisterPage extends Base {

	public void acessoBugBank() {
		acessoHomePage();

	}

	public void finalizaBugBank() {
		finalizaSessao();

	}

	public void cadastroDeUsuario(String arg1, String arg2, String arg3, String arg4) throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Registrar']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//form/div[2]/input")).sendKeys(arg1);
		driver.findElement(By.xpath("//form/div[3]/input")).sendKeys(arg2);
		driver.findElement(By.xpath("//form/div[4]/div/input")).sendKeys(arg3);
		driver.findElement(By.xpath("//form/div[5]/div/input")).sendKeys(arg4);

		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Cadastrar']")).click();
	}

	public String msgErrosCadastro(String arg1, String arg2, String arg3) throws InterruptedException {
		return driver.findElement(By.xpath("//p[text()[contains(., 'É campo obrigatório')]]")).getText();

	}

	public void cadastroDeUmNovoUsuario(String arg1, String arg2, String arg3, String arg4)
			throws InterruptedException {
		Thread.sleep(500);
		driver.findElement(By.xpath("//button[text()='Registrar']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//form/div[2]/input")).sendKeys(arg1);
		driver.findElement(By.xpath("//form/div[3]/input")).sendKeys(arg2);
		driver.findElement(By.xpath("//form/div[4]/div/input")).sendKeys(arg3);
		driver.findElement(By.xpath("//form/div[5]/div/input")).sendKeys(arg4);
		Thread.sleep(500);
		driver.findElement(By.cssSelector("#toggleAddBalance")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//button[text()='Cadastrar']")).click();

	}

	public void popUpSucesso() throws InterruptedException {
		Thread.sleep(500);
		finalizaBugBank();

	}

	public void fecharPopUp() throws InterruptedException {
		Thread.sleep(500);
		driver.findElement(By.cssSelector("#btnCloseModal")).click();

	}

	public void fazerLogin(String arg1, String arg2) throws InterruptedException {
		Thread.sleep(500);
		driver.findElement(By.name("email")).sendKeys(arg1);
		Thread.sleep(500);
		driver.findElement(By.name("password")).sendKeys(arg2);
		Thread.sleep(500);
		driver.findElement(By.xpath("//button[text()='Acessar']")).click();

	}
	
	
	public boolean container(String arg1, String arg2, String arg3, String arg4) throws InterruptedException {
		Thread.sleep(500);
		driver.findElement(By.xpath("//p[text()[contains(., '" + arg1 + "')]]")).getText();
		Thread.sleep(500);
		driver.findElement(By.xpath("//p[text()[contains(., '" + arg2 + "')]]")).getText();
		Thread.sleep(500);
		driver.findElement(By.xpath("//p[text()[contains(., '" + arg3 + "')]]")).getText();
		Thread.sleep(500);
		driver.findElement(By.xpath("//p[text()[contains(., '" + arg4 + "')]]")).getText();
		

		return this.container(arg1, arg2, arg3, arg4);

	}
	
	
	
	
	
}
