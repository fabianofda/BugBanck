package pages;

import org.openqa.selenium.By;

import commons.Base;

public class LoginPage extends Base {

	public void acessoBugBank() {
		acessoHomePage();

	}

	public void finalizaBugBank() {
		finalizaSessao();

	}

	public void fazerLogin(String arg1, String arg2) throws InterruptedException {
		driver.findElement(By.name("email")).sendKeys(arg1);
		driver.findElement(By.name("password")).sendKeys(arg2);
		driver.findElement(By.xpath("//button[text()='Acessar']")).click();

	}

	public String mensagemAlert(String arg1) {
		return driver.findElement(By.xpath("//p[text()[contains(., '" + arg1 + "')]]")).getText();

	}

	public boolean popUpAlert(Object arg1) throws InterruptedException {
		String txt = driver.findElement(By.xpath("//p[text()[contains(., '" + arg1 + "')]]")).getText();
		return driver.getPageSource().contains(txt);

	}

	public boolean mensagensAlerts(String arg1, String arg2) throws InterruptedException {
		String txt = mensagemAlert(arg1);
		return driver.getPageSource().contains(txt);

	}

	public void cadastraUsuario(String arg1, String arg2, String arg3, String arg4) throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Registrar']")).click();

		driver.findElement(By.xpath("//form/div[2]/input")).sendKeys(arg1);
		driver.findElement(By.xpath("//form/div[3]/input")).sendKeys(arg2);
		driver.findElement(By.xpath("//form/div[4]/div/input")).sendKeys(arg3);
		driver.findElement(By.xpath("//form/div[5]/div/input")).sendKeys(arg4);

		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#toggleAddBalance")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Cadastrar']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#btnCloseModal")).click();

	}

	public String mesagemDeBoasVindas(String arg1) throws InterruptedException {
		return numConta();
	}

	public String numConta() throws InterruptedException {

		String numConta = driver.findElement(By.xpath("//*[@id='textAccountNumber']/span")).getText();

		return numConta;

	}
}
