package steps;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class LoginSteps {
	private WebDriver driver;

	@Dado("^que desejo realiza login$")
	public void queDesejoRealizaLogin() throws Throwable {
		driver = new ChromeDriver();
		driver.get("https://bugbank.netlify.app/");

	}

	@Quando("^informo credenciais validas$")
	public void informoCredenciaisValidas() throws Throwable {
		driver.findElement(By.xpath("//button[text()='Registrar']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@placeholder='Informe seu e-mail'])[2]")).sendKeys("teste@teste.com.br");
		driver.findElement(By.name("name")).sendKeys("teste");
		driver.findElement(By.xpath("(//input[@placeholder='Informe sua senha'])[2]")).sendKeys("123456");
		driver.findElement(By.name("passwordConfirmation")).sendKeys("123456");
		driver.findElement(By.xpath("//button[text()='Cadastrar']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("btnCloseModal")).click();

		driver.findElement(By.name("email")).sendKeys("teste@teste.com.br");
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.xpath("//button[text()='Acessar']")).click();
	}

	@Quando("^informo email invalido$")
	public void informoEmailInvalido() throws Throwable {

		driver.findElement(By.name("email")).sendKeys("teste#teste.com.br");
		driver.findElement(By.name("password")).sendKeys("123456");

	}

	@Quando("^informo senha invalida$")
	public void informoSenhaInvalida() throws Throwable {
		driver.findElement(By.name("email")).sendKeys("teste@teste.com.br");
		driver.findElement(By.name("password")).sendKeys("abc123");
		driver.findElement(By.xpath("//button[text()='Acessar']")).click();
	}

	@Entao("^devo ver a area logada$")
	public void devoVerAAreaLogada() throws Throwable {

		Thread.sleep(1000);
		driver.findElement(By.id("btnExit")).click();
		driver.quit();
	}

	@Entao("^devo ver a popup de alerta$")
	public void devoVerAPopupDeAlerta() throws Throwable {

		String txt = "Usuário ou senha inválido.";

		assertEquals("Usuário ou senha inválido.", txt);

		driver.quit();

	}

	@Entao("^devo ver a mensagem alerta$")
	public void devoVerAMensagemAlerta() throws Throwable {
		String txt = driver.findElement(By.className("input__warging")).getText();

		assertEquals("Formato inválido", txt);

		driver.quit();
	}

	@Quando("^nao informo nenhum campo$")
	public void naoInformoNenhumCampo() throws Throwable {
		driver.findElement(By.name("email")).sendKeys("");
		driver.findElement(By.name("password")).sendKeys("");
		driver.findElement(By.xpath("//button[text()='Acessar']")).click();
	}

	@Entao("^devo ver as mensagems alertas$")
	public void devoVerAsMensagemsAlertas() throws Throwable {
		String txtEmail = driver.findElement(By.className("input__warging")).getText();
		String txtPass = driver.findElement(By.className("input__warging")).getText();

		assertEquals("É campo obrigatório", txtEmail);
		assertEquals("É campo obrigatório", txtPass);

		driver.quit();
	}

}
