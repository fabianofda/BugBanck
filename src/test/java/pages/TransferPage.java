package pages;

import org.openqa.selenium.By;

import commons.Base;

public class TransferPage extends Base {
	public void acessoBugBank() {
		acessoHomePage();

	}

	public void finalizaBugBank() {
		finalizaSessao();

	}

	public boolean popUpAlertModal(String arg1) throws InterruptedException {

		String txt = driver.findElement(By.xpath("//p[text()[contains(., '" + arg1 + "')]]")).getText();
		return driver.getPageSource().contains(txt);

	}

	public void fecharPopUp() throws InterruptedException {
		Thread.sleep(500);
		driver.findElement(By.cssSelector("#btnCloseModal")).click();

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

	public void formTransferencia(String arg1, String arg2, String arg3, String arg4) throws InterruptedException {

		driver.findElement(By.cssSelector("input[name=accountNumber]")).sendKeys(arg1);
		driver.findElement(By.cssSelector("input[name=digit]")).sendKeys(arg2);
		driver.findElement(By.cssSelector("input[name=transferValue]")).sendKeys(arg3);
		driver.findElement(By.cssSelector("input[name=description]")).sendKeys(arg4);

	}

	public void btnTransferencia() throws InterruptedException {

		driver.findElement(By.cssSelector("#btn-TRANSFERÊNCIA")).click();

	}

	public void btnTransfAgora() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()[contains(., 'Transferir agora')]]")).click();

	}

	public String numConta() throws InterruptedException {
		String numConta = driver.findElement(By.xpath("//*[@id='textAccountNumber']/span")).getText();

		return numConta;

	}

	public void fazerLogin(String arg1, String arg2) throws InterruptedException {
		driver.findElement(By.name("email")).sendKeys(arg1);
		driver.findElement(By.name("password")).sendKeys(arg2);
		driver.findElement(By.xpath("//button[text()='Acessar']")).click();

	}
}
